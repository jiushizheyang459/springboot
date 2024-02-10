package com.bhu.service;

import com.bhu.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * 保存（增加）
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 更改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
