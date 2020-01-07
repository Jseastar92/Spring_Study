package polymorphism;

public class SamsungTV implements TV   {

    public SamsungTV(){
        System.out.println("===> samsung TV Object Created");
    }

    public void powerOn() {
        System.out.println("Samsung TV -- power On");
    }

    public void powerOff() {
        System.out.println("Samsung TV -- power Off");

    }

    public void volumeUp() {
        System.out.println("Samsung TV -- volume up");

    }

    public void volumeDown() {
        System.out.println("Samsung TV -- volume down");

    }
}
