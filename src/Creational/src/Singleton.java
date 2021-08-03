package Creational.src;

public class Singleton {
    private static Singleton instance;

    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Singleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Singleton getInstance(String name, int age){
        if(instance == null){
            return instance = new Singleton(name, age);
        }
        return instance;
    }
}
