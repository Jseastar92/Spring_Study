package polymorphism;

public class SamsungTV implements TV   {

    private SonySpeaker speaker;

    public SamsungTV(){
        System.out.println("===> samsung TV Object(1) Created");
    }

    public SamsungTV(SonySpeaker speaker) {
        System.out.println("----> SamsungTv Obj(2) Created");
        this.speaker = speaker;
    }

    public void powerOn() {
        System.out.println("Samsung TV -- power On");
    }

    public void powerOff() {
        System.out.println("Samsung TV -- power Off");

    }

    public void volumeUp() {
        speaker.volumeUp();
    }

    public void volumeDown() {
        speaker.volumeDown();
    }
}
