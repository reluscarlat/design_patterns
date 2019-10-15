package templateMethod;

public abstract class Pizza {
    public void makePizza(){
        makeDough();
        addCheese();
        addTomatoeSouce();
        addTopping();   // abstract method overrided in subclass.
        finishPizza();  // abstract method overrided in subclass.
    }

    public void makeDough() {
        System.out.println("Making dough...");
    }

    public void addCheese() {
        System.out.println("Adding cheese...");
    }

    public void addTomatoeSouce() {
        System.out.println("Adding tomatoe souce...");
    }

    public abstract void addTopping();
    public abstract void finishPizza();
}
