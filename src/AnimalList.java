import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalList {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name of the animal (or hit enter to exit): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = scanner.nextBoolean();
            scanner.nextLine(); // Consume the newline character after reading boolean

            Animal animal = new Animal(name, isDog);
            animalList.add(animal);
        }

        System.out.println("Animal List:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}