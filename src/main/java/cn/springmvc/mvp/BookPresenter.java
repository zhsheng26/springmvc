package cn.springmvc.mvp;

public class BookPresenter implements IBookPresenter {
    private final IBookModel bookModel;

    public BookPresenter(IBookModel bookModel) {
        this.bookModel = bookModel;
    }

    @Override
    public void showBookInfo() {
        System.out.printf(bookModel.getBookInfo());
    }
}
