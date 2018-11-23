package data;

import java.sql.*;

public class OpenSql {
    //    // JDBC 驱动名及数据库 URL
//    static final String DRIVER = "com.mysql.jdbc.Driver";
//    static final String URL = "jdbc:mysql://goddv.com:3306/login";
//
//    // 数据库的用户名与密码，需要根据自己的设置
//    static final String USERNAME = "sa";
//    static final String PASSWORD = "@as123.A";
    // 连接驱动
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    // 连接路径
    private static final String URL = "jdbc:sqlserver://192.168.254.10:1433;databaseName=login";
    // 用户名
    private static final String USERNAME = "sa";
    // 密码
    private static final String PASSWORD = "@as123.A";
    public Connection conn = getConnection();
    static {
        try {
            // 加载驱动
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public OpenSql(){
    }
    public Connection getConnection() {
        Connection conn = null;
        System.out.println("开始连接数据库");
        try{
            conn= DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("数据库连接失败！");
            System.exit(0);
        }
        System.out.println("数据库连接成功");
        return conn;
    }
}
