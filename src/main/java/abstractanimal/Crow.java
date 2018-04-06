package abstractanimal;

public class Crow extends Birds{

    public Crow(String name) {
        super(name);

    }
    String eat() {

        return "Dead Animals";

    }
    String makeNoise() {

        return "caw caw";

    }

}