package poly;

public class TV implements RemoteController {
    @Override
    public void channelUp() {
        System.out.println("TV의 채널이 올라간다.");
    }

    @Override
    public void channelDown() {
        System.out.println("TV의 채널이 내려간다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV의 소리가 올라간다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV의 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("TV에서는 인터넷이 실행된다.");
    }
}
