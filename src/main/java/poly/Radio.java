package poly;

public class Radio implements RemoteController {
    @Override
    public void channelUp() {
        System.out.println("Radio의 채널이 올라간다.");
    }

    @Override
    public void channelDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio의 소리가 올라간다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio의 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("Radio에서는 인터넷이 지원이 안됩니다.");
    }
}
