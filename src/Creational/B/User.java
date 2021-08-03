package Creational.B;

public class User {
    private final String name;
    private final int age;
    private final String adress;

    private User(UserBuilder userbuilder){
        this.name = userbuilder.name;
        this.age = userbuilder.age;
        this.adress = userbuilder.adress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static class UserBuilder{
        private final String name;
        private int age;
        private String adress;

        public UserBuilder(String name){
            this.name = name;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }
        public UserBuilder adress(String adress){
            this.adress = adress;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
