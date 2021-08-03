package Creational.src;

public class App {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("Oleg", 15);
        Singleton s2 = Singleton.getInstance("Ivan", 20);

        System.out.println(s1.getName()+s1.getAge());
        System.out.println(s2.getName()+s2.getAge());
    }
}
