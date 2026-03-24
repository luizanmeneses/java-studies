import java.util.Scanner;

public class ReadData{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Scanner it is a class that reads the input.
        scan.useLocale(java.util.Locale.US); //It is important to set the locale to US because it uses the dot as a decimal separator. Without this detail, the program not worked.

        //Read all the line
        System.out.println("Put your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is: " + fullName);

        //Read just the first name
        System.out.println("Put your first name: ");
        String firstName = scan.next(); //Even if I put the full name, it will read just the first name.
        System.out.println("Your first name is: " + firstName);

        //Read an integer number
        System.out.println("Put your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        //Several answers in the same question
        System.out.println("Put your informations: First name, Age, your weight, quantity of children and if you have a pet (true/false) ");
        String name = scan.next();
        int age2 = scan.nextInt();
        double weight = scan.nextDouble();
        int qtChildren = scan.nextInt();
        Boolean havePet = scan.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age2);
        System.out.println("Weight: " + weight);
        System.out.println("Quantity of children: " + qtChildren);
        System.out.println("Have pet? " + havePet);

        scan.close(); //It is important to close because it is a resource that is being used, and if we don't close it, it can cause memory leaks.
    }
}