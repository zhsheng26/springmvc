package cn.springmvc.mvp;

public class BookModel implements IBookModel{

    @Override
    public String getBookInfo() {
        return "时光流影";
    }
}
