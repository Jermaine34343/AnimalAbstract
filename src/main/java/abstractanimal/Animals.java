package abstractanimal;

    public abstract class Animals {


            protected String name;

            abstract String eat();

            abstract String makeNoise();



            protected Animals(String name) {

                this.name = name;

            }

        }

