abstract class Actor {
    String name;
    String type;
    int age;

    static int totalActors = 0;

    public Actor(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        totalActors++;
    }

    abstract void performAudition();

    void showProfile() {
        System.out.println("Name: " + name + " Type: " + type + " Age: " + age);
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage Collector called for: " + this.name);
    }
}

class LeadActor extends Actor {

    public LeadActor(String name, int age) {
        super(name, "Lead Hero", age);
    }

    @Override
    void performAudition() {
        System.out.println(name + " is performing audition for Lead Actor....");
    }

    void giveAutograph() {
        System.out.println(name + " signs an autograph.");
    }
}

class Villain extends Actor {

    public Villain(String name, int age) {
        super(name, "Villain", age);
    }

    @Override
    void performAudition() {
        System.out.println(name + " is perfroming audition for Villain....");
    }
}

class SideActor extends Actor {

    public SideActor(String name, int age) {
        super(name, "Side Actors", age);
    }

    @Override
    void performAudition() {
        System.out.println(name + " performing audition for Side Actor....");
    }
}

public class Bollywood_Talent {
    public static void main(String[] args) {
        System.out.println("----- Bollywood Talent Management System ------");
        Actor[] actors = new Actor[4];

        actors[0] = new LeadActor("Shah Rukh", 55);
        actors[1] = new Villain("Gabbar", 45);
        actors[2] = new SideActor("Nawazuddin", 49);

        System.out.println("Total Actors Registered: " + Actor.totalActors);
        System.out.println("********************************************");
        for (Actor actor : actors) {
            actor.showProfile();
            actor.performAudition();
            if (actor instanceof LeadActor) {
                System.out.println("-> Assign Role: Lead Role");
            } else if (actor instanceof Villain) {
                System.out.println("-> Assign Role: Villain");
            } else {
                System.out.println("-> Assign Role: Upcoming Star");
            }
            System.out.println("********************************************");
        }
        System.out.println("--- Garbage Collection Demo ---");
        Actor tempActor = new LeadActor("Guest Star", 25);
        System.out.println("Created temp actor: " + tempActor.name);
        tempActor = null;
        System.gc();
        System.out.println("Requested Garbage Collection (System.gc() called)...");
    }
}
