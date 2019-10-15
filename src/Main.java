import adapter.EnemyAttacker;
import adapter.EnemyRobot;
import adapter.EnemyRobotAdapter;
import builder.BankAccount;
import reflection.Person;
import templateMethod.Pizza;
import templateMethod.SalamiPizza;
import templateMethod.VeggiePizza;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {


//        // Strategy Pattern:
//        // Ex1
//        Animal dog = new Dog();
//        dog.tryToFly();
//        dog.setFlyAbility(new CantFly());
//        dog.tryToFly();
//        // Ex2
//        Compressor compressor = new Compressor();
//        String fileName = "MyFile";
//        compressor.compressFile(fileName);
//        compressor.setStrategy(new ZipCompressionStrategy());
//        compressor.compressFile(fileName);


//        // Observer Pattern
//        // Ex1
//        PostalMail postalMail = PostalMail.getInstance();
//        postalMail.setCitizens(Arrays.asList(new Citizen[] {
//                new Citizen("John"),
//                new Citizen("Bob"),
//                new Citizen("Eric")
//        }));
//        postalMail.setMails(Arrays.asList(
//                new Mail("Eric","c 1"),
//                new Mail("Eric","c 2"),
//                new Mail("Bob","c 3"),
//                new Mail("John","c 4")
//        ));
//        postalMail.notifyCitizens();
//        postalMail.getCitizens().forEach(citizen -> {
//            if(citizen.getName().equals("Eric")) {
//                citizen.setNotifyalble(false);
//            }
//        });
//        System.out.println();
//        postalMail.notifyCitizens();


//        // Factory Pattern
//        // Ex1
//        Animal dog = AnimalFactory.getAnimal("DOG");
//        dog.sound();
//        Animal cat = AnimalFactory.getAnimal("CAT");
//        cat.sound();

//        // Builder Pattern
          // Ex1
//        BankAccount bankAccount = new BankAccount.Builder()
//                .withAccountNumber(123)
//                .withOwner("John Smith")
//                .atBranch("Bucharest")
//                .openingBalance(1000)
//                .atRate(1.5)
//                .build();
//        System.out.println(bankAccount.toString());

        // Reflection
        // Ex1
//        Person p = new Person("Resc");
//        try {
//            Field field = p.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            System.out.println(field.get(p));
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        Person p2 = new Person("Gigi");
//        try {
//            Field field2 = Person.class.getDeclaredField("numPeople");
//            field2.setAccessible(true);
//            System.out.println(field2.get(null));
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        try {
//            Method method = p.getClass().getMethod("getName");
//            System.out.println(method.invoke(p));
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        try {
//            Method method2 = p.getClass().getMethod("setName", String.class);
//            method2.invoke(p,"Mirel");
//            System.out.println(p.getName());
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        try {
//            Constructor<Person> constructor = Person.class.getConstructor(String.class);
//            Person p3 = constructor.newInstance("John");
//            System.out.println(p3.getName());
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

//        // Adapter
//        // Ex1
//        EnemyRobot enemyRobot = new EnemyRobot();
//        EnemyAttacker attacker = new EnemyRobotAdapter(enemyRobot);
//        attacker.assignDriver("John");
//        attacker.driveForward();
//        attacker.fireWeapon();

//        // Template Method
//        // Ex1
//        Pizza veggiePizza = new VeggiePizza();
//        veggiePizza.makePizza();
//        Pizza salamiPizza = new SalamiPizza();
//        salamiPizza.makePizza();

    }
}
