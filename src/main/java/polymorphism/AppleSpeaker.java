package polymorphism;

public class AppleSpeaker implements Speaker {
    public AppleSpeaker(){
        System.out.println("====> AppleSpeaker obj Created");
    };

    public void volumeUp() {
        System.out.println("------Apple Speaker Sound UP!");
    }

    public void volumeDown() {
        System.out.println("------Apple Speaker Sound DOWN!");

    }
}
