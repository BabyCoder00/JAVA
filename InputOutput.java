import java.util.Scanner;  

public class InputOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your mail: ");
        String mail = scanner.nextLine();

        System.out.print("Enter your employee-code: ");
        String ecode = scanner.nextLine();

        System.out.print("Enter your phone no: ");
        String phn = scanner.nextLine();

        System.out.println("\n----- Employee Details -----");
        System.out.print(name + "\t");
        System.out.print(mail + "\t");
        System.out.print(ecode + "\t");
        System.out.print(phn);
        
        scanner.close();
    }
}
