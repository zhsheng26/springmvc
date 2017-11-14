package cn.springmvc;

import cn.springmvc.model.IBookPresenter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainActivity {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        IBookPresenter accountService = (IBookPresenter) context.getBean("bookPresenter");
        accountService.showBookInfo();

    }
}
