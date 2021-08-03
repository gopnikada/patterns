package Structural.Bridge;

public class TextMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Text msg is sent.");
    }
}
