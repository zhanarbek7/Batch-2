package day55teacher.animals1;

interface SoundAble {
     public void sound();  // No implementation
}

interface HuntAble {
    public void hunt();
}


class Dog implements SoundAble, HuntAble {
    public void sound() {
        System.out.println("Dog Barks");
    }

    public void hunt() {
        System.out.println("Dog Hunts");
    }
}



