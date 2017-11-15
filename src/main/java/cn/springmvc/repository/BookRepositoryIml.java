package cn.springmvc.repository;

import cn.springmvc.entity.BookObj;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BookRepositoryIml implements IBookRepository {
    @Resource
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
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

    @Transactional
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
