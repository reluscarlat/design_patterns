import Factory.Animal;
import Factory.AnimalFactory;
import observer.Citizen;
import observer.Mail;
import observer.PostalMail;
import strategy.*;

import java.util.Arrays;

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


//        // Observer
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


//        // Factory
//        Animal dog = AnimalFactory.getAnimal("DOG");
//        dog.sound();
//        Animal cat = AnimalFactory.getAnimal("CAT");
//        cat.sound();
    }
}
