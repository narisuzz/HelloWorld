package com.mt.service.impl;

import com.mt.dao.BookDao;
import com.mt.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
