package com.dienmaydo.utils;

import java.sql.*;

public class JdbcHelper {

    private static String url = "jdbc:sqlserver://localhost;database = QLBHDIENMAY_DO";
    private static String usename = "sa";
    private static String password = "123";

    public static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(url, usename, password);
        PreparedStatement pst = null;
        if (sql.trim().startsWith("{")) {
            pst = connection.prepareCall(sql);
        } else {
            pst = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pst.setObject(i + 1, args[i]);
        }
        return pst;
    }

    public static void excuteUpdate(String sql, Object... args) {
        try {
            PreparedStatement pst = preparedStatement(sql, args);
            try {
                pst.executeUpdate();
            } finally {
                pst.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement pst = preparedStatement(sql, args);
            return pst.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
