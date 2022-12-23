package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws SQLException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet res = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            res = st.executeQuery("SELECT * FROM department");

            while (res.next()) {
                System.out.println(res.getInt("Id") + ", " + res.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            res.close();
            st.close();
        }

        try {
            conn = DB.getConnection();
            pst = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            pst.setString(1, "Felipe Pereira");
            pst.setString(2, "felipe@mail.com");
            pst.setDate(3, new java.sql.Date(sdf.parse("09/05/1990").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 1);

            int rowsAffected = pst.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rst = pst.getGeneratedKeys();
                while (rst.next()){
                    int id = rst.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected.");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (SQLException sql) {
            sql.printStackTrace();
        }

        try {
            pst = conn.prepareStatement(
                    "UPDATE seller "
                            + "SET BaseSalary = BaseSalary + ? "
                            + "WHERE (DepartmentId = ?)"
            );

            pst.setDouble(1, 250.0);
            pst.setInt(2, 1);

            int rowsAffected = pst.executeUpdate();
            System.out.println(rowsAffected);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            pst = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?"
            );

            pst.setInt(1,5);
            int rowsAffected = pst.executeUpdate();
            System.out.println(rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            pst.close();
            DB.closeConnection();
        }
    }
}
