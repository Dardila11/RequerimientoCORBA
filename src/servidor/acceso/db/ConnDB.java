package servidor.acceso.db;

import java.sql.*;

public class ConnDB {

    private Connection conn;
    private String bd;
    private String login;
    private String password;
    private String url;

    public ConnDB() {
        conn = null;
        bd = "ReqDB";
        login = "root";
        password = "12345";
        url = "jdbc:mysql://localhost/"+bd;
    }

    public int conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url,login,password);
            return 1;
        }
        catch(SQLException e){
            System.out.println("Error de SQL: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return -1;
    }

    public void desconectar(){
        try{
            conn.close();
        }

        catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public Connection getConnection(){
        return conn;
    }

}
