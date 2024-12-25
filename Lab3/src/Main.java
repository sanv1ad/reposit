//інтерфейс для будівельника запитів
interface QueryBuilder {
    QueryBuilder select(String... columns);
    QueryBuilder where(String condition);
    QueryBuilder limit(int limit);
    String getSQL();
}

//будівельник запитів для PostgreSQL
class PostgreSQLQueryBuilder implements QueryBuilder {
    private StringBuilder query;

    public PostgreSQLQueryBuilder() {
        this.query = new StringBuilder();
    }

    @Override
    public QueryBuilder select(String... columns) {
        query.append("SELECT ")
                .append(String.join(", ", columns))
                .append(" ");
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        query.append("WHERE ")
                .append(condition)
                .append(" ");
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        query.append("LIMIT ")
                .append(limit)
                .append(" ");
        return this;
    }

    @Override
    public String getSQL() {
        return query.toString().trim();
    }
}

//будівельник запитів для MySQL
class MySQLQueryBuilder implements QueryBuilder {
    private StringBuilder query;

    public MySQLQueryBuilder() {
        this.query = new StringBuilder();
    }

    @Override
    public QueryBuilder select(String... columns) {
        query.append("SELECT ")
                .append(String.join(", ", columns))
                .append(" ");
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        query.append("WHERE ")
                .append(condition)
                .append(" ");
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        query.append("LIMIT ")
                .append(limit)
                .append(" ");
        return this;
    }

    @Override
    public String getSQL() {
        return query.toString().trim();
    }
}

public class Main {
    public static void main(String[] args) {
        //будівельник для PostgreSQL
        QueryBuilder postgreSQLBuilder = new PostgreSQLQueryBuilder();
        String postgreSQLQuery = postgreSQLBuilder
                .select("id", "name")
                .where("age > 18")
                .limit(10)
                .getSQL();
        System.out.println("PostgreSQL Query: " + postgreSQLQuery);

        //будівельник для MySQL
        QueryBuilder mySQLBuilder = new MySQLQueryBuilder();
        String mySQLQuery = mySQLBuilder
                .select("id", "email")
                .where("status = 'active'")
                .limit(5)
                .getSQL();
        System.out.println("MySQL Query: " + mySQLQuery);
    }
}