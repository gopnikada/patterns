package Creational.AF;

public class AppleFactory implements DeviceFactory{
    @Override
    public Keyboard makeKeyboard() {
        return new AppleKB();
    }

    @Override
    public Mouse makeMouse() {
        return new AppleMouse();
    }
}
