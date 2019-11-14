package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:42
 * @Description: 数据库访问类
 */
public class BaseDao {
    //数据库连接字符串
    private static String CLASS_DRIVER = null;
    private static String DATA_URL = null;
    private static String USER_NAME = null;
    private static String PASSWORD = null;

    static {
        init();
    }


    public static void init() {
        //谁来读取：创建Properties对象
        Properties params = new Properties();
        //读取谁：设置配置文件名
        String configFile = "jdbc.properties";
        //怎么读
        InputStream is = BaseDao.class
                .getClassLoader()
                .getResourceAsStream(configFile);
        //读取
        try {
            params.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CLASS_DRIVER = params.getProperty("driver");
        DATA_URL = params.getProperty("url");
        USER_NAME = params.getProperty("username");
        PASSWORD = params.getProperty("password");
    }


    //数据库连接对象
    Connection conn = null;
    //发送SQL语句的对象
    PreparedStatement pstmt = null;
    //结果集对象
    ResultSet rs = null;

    /**
     * 获取数据库连接
     *
     * @return 数据库连接对象
     */
    public Connection getConn() {
        //加载类驱动
        try {
            Class.forName(CLASS_DRIVER);
            if (conn == null) {
                //获取数据库连接
                conn = DriverManager.getConnection(DATA_URL, USER_NAME, PASSWORD);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public int myExecuteModify(String sql, Object[] params) {
        int num = 0;
        try {
            //获取数据库连接
            Connection conn = this.getConn();

            pstmt = conn.prepareStatement(sql);
            //参数赋值
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            //获取执行结果
            num = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //返回受影响行数
        return num;
    }


    /**
     * 释放资源
     *
     * @param rs    结果集
     * @param pstmt 发送SQL语句的对象
     * @param conn  数据库连接对象
     */
    public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}