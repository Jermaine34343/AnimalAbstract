package abstractanimal;

public class TurkeyVultures extends Birds{

    public TurkeyVultures(String name) {
        super(name);

    }
    String eat() {

        return "Dead Meat";

    }
    String makeNoise() {

        return "Screech";

    }

}
