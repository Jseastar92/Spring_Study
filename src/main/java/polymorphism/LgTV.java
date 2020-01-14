package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("tv")
public class LgTV implements TV {

//    @Resource(name = "apple")
//    private Speaker speaker;


    /*@Qualifier("apple")*/
    @Autowired
    private Speaker speaker;


    public LgTV() {
        System.out.println("===> LgTv 객체 생성");
    }

    public void powerOn() {
        System.out.println("Lg TV -- power On");
    }

    public void powerOff() {
        System.out.println("Lg TV -- power Off");

    }
//
//    public void volumeUp() {
//        System.out.println("Lg TV -- volume up");
//
//    }
//
//    public void volumeDown() {
//        System.out.println("Lg TV -- volume down");
//    }

    public void volumeUp() {
        speaker.volumeUp();
    }
    public void volumeDown() {
        speaker.volumeDown();
    }
}
