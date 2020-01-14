package polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker{
    public SonySpeaker(){
        System.out.println(" ===> SonySpeaker Obj Created");
    }

    public void volumeUp(){
        System.out.println("SonySpeaker ==== Sound up");
    }
    public void volumeDown(){
        System.out.println("SonySpeaker ==== Sound Down");
    }
}
