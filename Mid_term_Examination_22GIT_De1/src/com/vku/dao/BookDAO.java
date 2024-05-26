/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vku.dao;
import java.sql.*;
import com.vku.common.Database;
import com.vku.model.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin!
 */
public class BookDAO {

    public static List<Book> getAll() {

        List<Book> books = new ArrayList<>();

        try {
            String sql = "select * from Sach";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maSach = rs.getString("masach");
                String tenSach = rs.getString("Tensach");
                String nhaXuatBan = rs.getString("Nhaxuatban");
                int soLuong = Integer.valueOf(rs.getString("Soluong")); // cast

                Book book = new Book(maSach, tenSach, nhaXuatBan, soLuong);
                books.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return books;

    }
    
    public static List<Book> getSearch(String keyword) {
        
        List<Book> books = new ArrayList<>();

        try {
            String sql = "select * from Sach where masach like ? or Tensach like ? or Nhaxuatban like ?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, '%' + keyword + '%');
            ps.setString(2, '%' + keyword + '%');
            ps.setString(3, '%' + keyword + '%');
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maSach = rs.getString("masach");
                String tenSach = rs.getString("Tensach");
                String nhaXuatBan = rs.getString("Nhaxuatban");
                int soLuong = Integer.valueOf(rs.getString("Soluong")); // cast

                Book book = new Book(maSach, tenSach, nhaXuatBan, soLuong);
                books.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return books;

    }

    public static boolean update(Book book) {

        try {
            String sql = "update Sach set Tensach = ?, Nhaxuatban = ?, Soluong = ? where masach = ?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, book.getTenSach());
            ps.setString(2, book.getNhaXuatBan());
            ps.setInt(3, book.getSoLuong());
            ps.setString(4, book.getMaSach());
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
public static boolean insert(Book book){
     try {
            String sql = "INSERT INTO Sach \n" +
"VALUES\n" +
"(?, ?,?, ?)"; ;
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, book.getMaSach());
            ps.setString(2, book.getTenSach());
            ps.setString(3, book.getNhaXuatBan());
            ps.setInt(4, book.getSoLuong());
        
           
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

      }  

public static boolean delete(Book book){
     try {
            String sql = "DELETE FROM Sach \n"+
"WHERE masach= " +"?";
            PreparedStatement ps = Database.getConnection().prepareCall(sql);
            ps.setString(1, book.getMaSach());
            int check = ps.executeUpdate();
            System.out.println("check: " + check);
            if(check == 1) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

      }  

// select * from sinhvien wherr masv like "?" 
 public static ArrayList<Book> selectCondition(String condition ) {

        ArrayList<Book> books = new ArrayList<>();

        try {
            String sql = "select * from sach where masach = '"+condition+"'";
            Connection conn = Database.getConnection();
            Statement ps = conn.createStatement();

            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String maSach = rs.getString("masach");
                String tenSach = rs.getString("Tensach");
                String nhaXuatBan = rs.getString("Nhaxuatban");
                int soLuong = Integer.valueOf(rs.getString("Soluong")); // cast

                Book book = new Book(maSach, tenSach, nhaXuatBan, soLuong);
                books.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return books;
 
    }


    public static void main(String[] args) {

        System.out.println(BookDAO.getSearch("s10").size());
        System.out.println(BookDAO.getSearch("s10"));
//        if(BookDAO.update(new Book("s1", "Sách Tiếng Viết", "Kim Đồng", 100))) {
//            System.out.println("Y");
//        } else {
//            System.out.println("N");
//        }

    }
/*
public static void main(String[] args){
    if(BookDAO.insert(new Book("s105", "Sách Java cơ bản", "NXB GD&DT", 100))){
        System.out.println("Y");
        
    }else{
        System.out.println("N");
    }
}
*/

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
