import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        String name = "codeup";
//        System.out.println(name);
//        System.out.print(name);
//        System.out.print(name);
//        System.out.print(name);

//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//        System.out.println("Hello there, " + name + "Nice to see you.");



//        String greeting = "Salutations";
//        String name = "codeup";
//
//        System.out.printf("%s, %s! %n", greeting, name);
//        System.out.printf("%s, %s!", greeting, name);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");



    }
}


