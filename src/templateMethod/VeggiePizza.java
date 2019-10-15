package templateMethod;

public class VeggiePizza extends Pizza {
    @Override
    public void addTopping() {
        System.out.println("Adding vegetables...");
    }

    @Override
    public void finishPizza() {
        System.out.println("Veggie pizza finished.\n");
    }
}
