package abstractanimal;

public class Tiger extends Feline{

    public Tiger(String name) {
        super(name);

    }
    String eat() {

        return "Meat";

    }
    String makeNoise() {

        return "purrrrrrr";

    }

}