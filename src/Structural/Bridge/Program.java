package Structural.Bridge;

public class Program {
    public static void main(String[] args) {
        MessageSender m1 = new TextMessageSender();
        Message mm1 = new TextMessage(m1);
        mm1.send();

        MessageSender m2 = new ImageMessageSender();
        Message mm2 =  new ImageMessage(m2);
        mm2.send();
    }
}
