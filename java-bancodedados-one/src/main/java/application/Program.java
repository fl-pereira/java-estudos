package application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet res = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            res = st.executeQuery("select * from department");

            while (res.next()) {
                System.out.println(res.getInt("Id") + ", " + res.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            res.close();
            st.close();
            DB.closeConnection();
        }

    }
}
