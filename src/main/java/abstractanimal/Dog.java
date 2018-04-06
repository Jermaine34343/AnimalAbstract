package abstractanimal;

public class Dog extends Canine{

    public Dog(String name) {
        super(name);

    }
    String eat() {

        return "Dog Food";

    }
    String makeNoise() {

        return "woof woof";

    }

}