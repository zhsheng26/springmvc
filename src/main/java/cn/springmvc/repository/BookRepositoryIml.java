package cn.springmvc.repository;

import cn.springmvc.entity.BookObj;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryIml implements IBookRepository {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    @Override
    public BookObj load(Long id) {
        return null;
    }

    @Override
    public BookObj get(Long id) {
        return null;
    }

    @Override
    public List<BookObj> findAll() {
        return null;
    }

    @Override
    public void persist(BookObj entity) {
        getCurrentSession().persist(entity);
    }

    @Override
    public Long save(BookObj entity) {
        return (Long) getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(BookObj entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void flush() {
        getCurrentSession().flush();
    }
}
