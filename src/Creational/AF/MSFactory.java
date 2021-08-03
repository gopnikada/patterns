package Creational.AF;

public class MSFactory implements DeviceFactory{
    @Override
    public Mouse makeMouse() {
        return new MicrosoftMouse();
    }

    @Override
    public Keyboard makeKeyboard() {
        return new MicrosoftKB();
    }
}
