class Animal {
    void run() {
        System.out.println("Running..");
    }
}
class Cat extends Animal {
    void bark() {
        System.out.println("Cat Barking");
    }
    void run() {
        System.out.println("Cat Running");
    }
}

public class UpCastingAndDownCasting {
    public static void main(String[] args) {

        //Upcasting
        Animal animal = new Cat();
        animal.run(); // Will invoke the child class run() method

        //Downcasting
        Cat cat = (Cat) animal;
        cat.bark();
        cat.run();

    }
}
