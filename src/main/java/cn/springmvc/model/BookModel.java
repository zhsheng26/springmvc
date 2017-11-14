package cn.springmvc.model;

public class BookModel implements IBookModel{

    @Override
    public String getBookInfo() {
        return "时光流影";
    }
}
