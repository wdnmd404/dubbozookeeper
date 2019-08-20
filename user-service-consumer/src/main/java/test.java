import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.selectUser;

import java.io.IOException;

public class test {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("consumer.xml");
        selectUser su=cpx.getBean(selectUser.class);
        System.out.println(su.Pay());
    }
}
