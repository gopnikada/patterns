package Structural.Bridge;

public class ImageMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Sending image msg.");
    }
}
