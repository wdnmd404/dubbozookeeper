import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("provider.xml");
        cpx.start();
        System.in.read();
    }
}
