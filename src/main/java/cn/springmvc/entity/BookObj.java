package cn.springmvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookObj {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "pageNum")
    private String pageNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

}
