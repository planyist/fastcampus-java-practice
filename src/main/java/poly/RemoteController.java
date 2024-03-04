package poly;

public abstract class RemoteController {
    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void internet() {
        System.out.println("인터넷이 구동된다.");
    }
}
