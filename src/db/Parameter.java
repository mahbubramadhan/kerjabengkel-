package db;

import java.sql.Connection;

public class Parameter {

    public static String IPHOST = "127.0.0.1";
    public static String HOST_DB = "jdbc:mysql://" + IPHOST + ":3306/hotel";
    public static String USERNAME_DB = "root";
    public static String PASSWORD_DB = "";
    //public static String PORT="11111";
    //public static String USER;
    public static int PORT = 11111;
    public static String USER;

    public Connection getdb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
