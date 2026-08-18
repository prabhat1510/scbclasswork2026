package com.scb.services;

import com.scb.dao.BookDAO;
import com.scb.dao.BookDAOImpl;
import com.scb.exceptions.BookNotFoundException;
import com.scb.exceptions.DuplicateBookIdException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Book;

import java.sql.SQLException;
import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDAO bookDAO = new BookDAOImpl();
    @Override
    public String addBook(Book book) throws SQLException, DuplicateBookIdException {
        String message = bookDAO.addBook(book);
        return message;
        //return bookDAO.addBook(book);
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
