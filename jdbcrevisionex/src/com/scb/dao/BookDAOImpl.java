package com.scb.dao;

import com.scb.exceptions.BookNotFoundException;
import com.scb.exceptions.DuplicateBookIdException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Book;
import com.scb.util.DBConnectionUtil;


import java.sql.*;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public String addBook(Book book) throws SQLException, DuplicateBookIdException {



        try(
                Connection conn=DBConnectionUtil.getDBConnection();
                PreparedStatement pstmt = conn.prepareStatement("");
                Statement stmt = conn.createStatement();
        ){
            stmt.executeQuery("select name,author,publisher from book where id=?");
            pstmt.setInt(1,15);
            ResultSet rs = pstmt.executeQuery();
       }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    @Override
    public Book getBookById(Integer id) throws SQLException, BookNotFoundException {
        return null;
    }

    @Override
    public String updateBook(Book book) throws SQLException, BookNotFoundException {
        return "";
    }

    @Override
    public String deleteBook(Integer id) throws SQLException, BookNotFoundException {
        return "";
    }

    @Override
    public Book getBookByName(String name) throws SQLException, BookNotFoundException {
        return null;
    }

    @Override
    public Book getBookByAuthor(String author) throws SQLException, NoRecordFoundException {
        return null;
    }

    @Override
    public Book getBookByPrice(Double price) throws SQLException, NoRecordFoundException {
        return null;
    }

    @Override
    public Book getBookByPrice(Double price1, Double price2) throws SQLException, NoRecordFoundException {
        return null;
    }

    @Override
    public List<Book> getAllBooksAndSortByPrice() throws SQLException, NoRecordFoundException {
        return List.of();
    }

    @Override
    public List<Book> getAllBooks() throws SQLException, NoRecordFoundException {
        return List.of();
    }
}
