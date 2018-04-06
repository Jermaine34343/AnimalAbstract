package abstractanimal;

public class Main {
    public static void main(String[] args){

        Crow crow = new Crow("Crow");

        TurkeyVultures turkeyVultures = new TurkeyVultures("TurkeyVultures");

        Eagles eagles= new Eagles("Eagles");



        // Canines

        Dog dog = new Dog("dog");

        Fox fox = new Fox("Fox");

        Wolves wolves = new Wolves("Wolf");



        // Felines

        Cat cat = new Cat("Cat");

        Lion lion = new Lion ("Sassy");

        Tiger tiger = new Tiger("Tigris");




        Animals[] animals = new Animals[]{crow, turkeyVultures, eagles, dog, fox, wolves, cat, lion, tiger};



        for (Animals a : animals) {

            System.out.println(a.eat());

        }

    }

}