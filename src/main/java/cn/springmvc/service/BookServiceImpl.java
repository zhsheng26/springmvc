package cn.springmvc.service;


import cn.springmvc.entity.BookObj;
import cn.springmvc.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository bookRepositoryIml;

    @Override
    public Long saveBook() {
        BookObj book = new BookObj();
        book.setBookName("时光留言");
        book.setPageNum("12");
        return bookRepositoryIml.save(book);
    }
}
