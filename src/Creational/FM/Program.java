package Creational.FM;

public class Program {

    private static LaptopFactory laptopFactory;

    public static void Conf(){
        laptopFactory = new SamsungFactory();
    }
    public static void logik(){
        laptopFactory.showResult();
     }

    public static void main(String[] args) {
        Conf();
        logik();
    }
}
