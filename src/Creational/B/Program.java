package Creational.B;

public class Program {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder("Oleg").build();
        User u2 = new User.UserBuilder("Ivan").age(15).build();

        System.out.println(u1.toString());
        System.out.println(u2.toString());


    }
}
