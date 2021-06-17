package module;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dao {
    private Connection connection;
    private String url = "jdbc:sqlserver://localhost\\DESKTOP-4RLM06U:1433;database=project";
    private String usernameDB = "sa";
    private String password = "123";
    private List<product> listProduct;
    private List<account> listAccount;

    public dao() {
        connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url,usernameDB,password);
            System.out.println("ok");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadProduct() {
        listProduct = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
            while(resultSet.next()) {
                listProduct.add(new product(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3),resultSet.getString(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        dao dao = new dao();
//        dao.loadProduct();
//        for(product p : dao.getListProduct()) {
//            System.out.println(p);
//        }
//    }

    public void loadAccount() {
        listAccount = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM account");
            while(resultSet.next()) {
                listAccount.add(new account(resultSet.getString(1),resultSet.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<product> listProduct) {
        this.listProduct = listProduct;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsernameDB() {
        return usernameDB;
    }

    public void setUsernameDB(String usernameDB) {
        this.usernameDB = usernameDB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<account> getListAccount() {
        return listAccount;
    }

    public void setListAccount(List<account> listAccount) {
        this.listAccount = listAccount;
    }
}
