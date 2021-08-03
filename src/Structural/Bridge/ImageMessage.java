package Structural.Bridge;

public class ImageMessage extends Message{
    public ImageMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
