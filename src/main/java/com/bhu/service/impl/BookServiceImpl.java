package com.bhu.service.impl;

import com.bhu.controller.Code;
import com.bhu.dao.BookDao;
import com.bhu.domain.Book;
import com.bhu.exception.BusinessException;
import com.bhu.exception.SystemException;
import com.bhu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {

        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {

        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        //模拟异常
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请不要挑战我的耐心！");
        }

        /*try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时，请重试！", e);
        }*/

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
