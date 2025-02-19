import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Synsets Entered for April: ");
        double num1 = scanner.nextDouble();

        System.out.print("Synsets Entered for May: ");
        double num2 = scanner.nextDouble();

        System.out.print("Synsets Entered for June: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("Average Synset Entered: " + average);

        scanner.close();
    }
    
}