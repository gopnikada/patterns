package Creational.AF;

public class Program {


    static Manufacture confMan(){
        Manufacture manufacture;
        DeviceFactory deviceFactory;

        deviceFactory = new AppleFactory();
        manufacture = new Manufacture(deviceFactory);
        return manufacture;
    }

    public static void main(String[] args)
    {
        Manufacture manufacture = confMan();
        manufacture.showItems();
    }
}
