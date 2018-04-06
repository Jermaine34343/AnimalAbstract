package abstractanimal;

public class Eagles extends Birds{

    public Eagles(String name) {
        super(name);

    }
    String eat() {

        return "Medium sized animals";

    }
    String makeNoise() {

        return "caw caw";

    }

}