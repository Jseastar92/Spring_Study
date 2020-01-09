package polymorphism;

public class SamsungTV implements TV   {

    private Speaker speaker;
    private int price;


    public SamsungTV(){
        System.out.println("===> samsung TV Object(1) Created");
    }

    public void setSpeaker(Speaker speaker) {
        System.out.println("===> setSpeaker() call");
        this.speaker = speaker;
    }

    public void setPrice(int price) {
        System.out.println("---> setPrice() call");
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
