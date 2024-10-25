package day55.animalsInterface;

public class Dog implements SoundAble, HuntAble{
    @Override
    public void hunt() {
        System.out.println("Dog hunts!");
    }

    @Override
    public void sound() {
        System.out.println("Dog sounds!");
    }
}
