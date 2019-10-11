package Factory;

public class AnimalFactory {
    public static Animal getAnimal(String animal) {
        switch (animal) {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            default:
                return null;
        }
    }
}
