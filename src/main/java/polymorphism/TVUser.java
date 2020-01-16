package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String [] args) {

//        1. Spring 컨테이너 구현
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");


//        BeanFactory factory = new BeanFactory();

//         2. Spring 컨테이너로부터 필요한 객체를 요청(look up)한다
        TV tv = (TV) factory.getBean("tv");
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
        tv.volumeDown();
//
//        // 3. Sprng 컨테이너 종료
        factory.close();
    }
}
