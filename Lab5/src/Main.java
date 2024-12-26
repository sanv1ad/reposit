interface Renderer {
    String renderTitle(String title);
    String renderContent(String content);
    String renderProduct(String name, String description, String image, String id);
}

class HTMLRenderer implements Renderer {
    @Override
    public String renderTitle(String title) {
        return "<h1>" + title + "</h1>";
    }

    @Override
    public String renderContent(String content) {
        return "<p>" + content + "</p>";
    }

    @Override
    public String renderProduct(String name, String description, String image, String id) {
        return "<div><h1>" + name + "</h1><p>" + description + "</p><img src='" + image + "'/><p>ID: " + id + "</p></div>";
    }
}

class JsonRenderer implements Renderer {
    @Override
    public String renderTitle(String title) {
        return "{\"title\": \"" + title + "\"}";
    }

    @Override
    public String renderContent(String content) {
        return "{\"content\": \"" + content + "\"}";
    }

    @Override
    public String renderProduct(String name, String description, String image, String id) {
        return "{\"name\": \"" + name + "\", \"description\": \"" + description + "\", \"image\": \"" + image + "\", \"id\": \"" + id + "\"}";
    }
}

class XmlRenderer implements Renderer {
    @Override
    public String renderTitle(String title) {
        return "<title>" + title + "</title>";
    }

    @Override
    public String renderContent(String content) {
        return "<content>" + content + "</content>";
    }

    @Override
    public String renderProduct(String name, String description, String image, String id) {
        return "<product><name>" + name + "</name><description>" + description + "</description><image>" + image + "</image><id>" + id + "</id></product>";
    }
}

abstract class Page {
    protected Renderer renderer;

    public Page(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String view();
}

class SimplePage extends Page {
    private String title;
    private String content;

    public SimplePage(Renderer renderer, String title, String content) {
        super(renderer);
        this.title = title;
        this.content = content;
    }

    @Override
    public String view() {
        return renderer.renderTitle(title) + renderer.renderContent(content);
    }
}

class ProductPage extends Page {
    private Product product;

    public ProductPage(Renderer renderer, Product product) {
        super(renderer);
        this.product = product;
    }

    @Override
    public String view() {
        return renderer.renderProduct(product.getName(), product.getDescription(), product.getImage(), product.getId());
    }
}

class Product {
    private String name;
    private String description;
    private String image;
    private String id;

    public Product(String name, String description, String image, String id) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getId() {
        return id;
    }
}

class Main {
    public static void main(String[] args) {
        Renderer htmlRenderer = new HTMLRenderer();
        Renderer jsonRenderer = new JsonRenderer();
        Renderer xmlRenderer = new XmlRenderer();

        Page simplePageHTML = new SimplePage(htmlRenderer, "Simple Page Title", "This is the content of the simple page.");
        Page productPageHTML = new ProductPage(htmlRenderer, new Product("Product Name", "Product Description", "product.jpg", "123"));

        Page simplePageJSON = new SimplePage(jsonRenderer, "Simple Page Title", "This is the content of the simple page.");
        Page productPageJSON = new ProductPage(jsonRenderer, new Product("Product Name", "Product Description", "product.jpg", "123"));

        Page simplePageXML = new SimplePage(xmlRenderer, "Simple Page Title", "This is the content of the simple page.");
        Page productPageXML = new ProductPage(xmlRenderer, new Product("Product Name", "Product Description", "product.jpg", "123"));

        System.out.println(simplePageHTML.view());
        System.out.println(productPageHTML.view());

        System.out.println(simplePageJSON.view());
        System.out.println(productPageJSON.view());

        System.out.println(simplePageXML.view());
        System.out.println(productPageXML.view());
    }
}