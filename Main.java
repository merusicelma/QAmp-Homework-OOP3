import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("white", "male", 10, true, true, true, true);
        Cat myCat = new Cat("black", "female", 8, true, true);
        SiameseCat mySiameseCat = new SiameseCat("black-white", "female", 8, true, true, true, true);

        ArrayList<Animal> myAnimal = new ArrayList<>();
        myAnimal.add(myDog);
        myAnimal.add(myCat);
        myAnimal.add(mySiameseCat);

        for (Animal animal : myAnimal) {
            animal.speak();
            animal.getBasicInfo();
            animal.cuddle();
        }


    }
}
