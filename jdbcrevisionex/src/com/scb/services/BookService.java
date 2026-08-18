package com.scb.services;

import com.scb.exceptions.AuthorNotFoundException;
import com.scb.exceptions.BookNotFoundException;
import com.scb.exceptions.DuplicateBookIdException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookService {
    //Create
    public String addBook(Book book) throws SQLException, DuplicateBookIdException;
    //Retrieve by book id
    public Book getBookById(Integer id) throws SQLException, BookNotFoundException;
    //Update
    public String updateBook(Book book) throws SQLException, BookNotFoundException;
    //Delete
    public String deleteBook(Integer id) throws SQLException, BookNotFoundException;
    //Search or Retrieve by book name
    public Book getBookByName(String name) throws SQLException, BookNotFoundException;
    //Search or Retrieve by book author
    public Book getBookByAuthor(String author) throws SQLException, NoRecordFoundException;
    //Search or Retrieve by book publisher
    public Book getBookByPrice(Double price) throws SQLException, NoRecordFoundException;
    //Search or Retrieve by book price range
    public Book getBookByPrice(Double price1, Double price2) throws SQLException, NoRecordFoundException;

    //Retrieve all books and sort on the basis of price in ascending
    public List<Book> getAllBooksAndSortByPrice() throws SQLException, NoRecordFoundException;
    //Retrieve all books
    public List<Book> getAllBooks() throws SQLException, NoRecordFoundException;
}
