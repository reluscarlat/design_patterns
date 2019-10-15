package templateMethod;

public class SalamiPizza extends Pizza {
    @Override
    public void addTopping() {
        System.out.println("Adding salami...");
    }

    @Override
    public void finishPizza() {
        System.out.println("Salami pizza finished.\n");
    }
}
