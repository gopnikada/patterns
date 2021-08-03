package Creational.AF;

public class Manufacture {
   static Mouse mouse;
    static  Keyboard keyboard;
    Manufacture(DeviceFactory deviceFactory){
        mouse = deviceFactory.makeMouse();
        keyboard = deviceFactory.makeKeyboard();
    }

    public void showItems(){
        mouse.clickButton();
        keyboard.pressButton();
    }
}
