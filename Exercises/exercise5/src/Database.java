public class Database {
    private static Database instance = new Database();

    private Database() {}

    public static Database getInstance() {
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
