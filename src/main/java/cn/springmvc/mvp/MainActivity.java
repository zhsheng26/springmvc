package cn.springmvc.mvp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainActivity {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IBookPresenter bookPresenter = (IBookPresenter) context.getBean("bookPresenter");
        bookPresenter.showBookInfo();

    }
}
