package part4;

import poly.Radio;
import poly.RemoteController;
import poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoteController remoteController = new Radio();
        remoteController.channelUp();
        remoteController.channelDown();
        remoteController.volumeUp();
        remoteController.volumeDown();
        remoteController.internet();

        remoteController = new TV();
        remoteController.channelUp();
        remoteController.channelDown();
        remoteController.volumeUp();
        remoteController.volumeDown();
        remoteController.internet();
    }
}
