import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFacade {

    DbSingleton instance = null;

    public JDBCFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE address (ID INTEGER, StreetName VARCHAR )");
            sta.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return count;

    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values ...");
            sta.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return count;

    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while(((ResultSet) rs).next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            rs.close();
            sta.close();
            conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }

}
