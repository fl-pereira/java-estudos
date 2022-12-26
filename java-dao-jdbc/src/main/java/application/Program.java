package application;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.sql.SQLException;

public class Program {

    public static void main(String[] args){
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = null;
        try {
            seller = sellerDao.findById(3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(seller);
    }
}
