package polymorphism;

public class SamsungTV implements TV   {

    private Speaker speaker;
    private int price;


    public SamsungTV(){
        System.out.println("===> samsung TV Object(1) Created");
    }

    public SamsungTV(Speaker speaker) {
        System.out.println("----> SamsungTv Obj(2) Created");
        this.speaker = speaker;
    }

    public SamsungTV(Speaker speaker, int price) {
        System.out.println("=======>> Samsung TV (3) obj created");
        this.speaker = speaker;
        this.price = price;
    }

    public void powerOn() {
        System.out.println("Samsung TV -- power On (가격 :" + price + ")");
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
