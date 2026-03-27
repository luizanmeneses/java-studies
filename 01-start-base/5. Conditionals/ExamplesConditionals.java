import java.util.Scanner;

public class ExamplesConditionals{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("\nPut a number for choice a day of the week: ");
        int weekDay = scan.nextInt();

        if (weekDay == 1){
            System.out.println("Sunday");
        }else if (weekDay == 2){
            System.out.println("Monday");
        }else if (weekDay == 3){
            System.out.println("Tuesday");
        }else if (weekDay == 4){
            System.out.println("Wednesday");
        }else if (weekDay == 5){
            System.out.println("Thursday");
        }else if (weekDay == 6){
            System.out.println("Friday");
        }else if (weekDay == 7){
            System.out.println("Saturday");
        }else {
            System.out.println("Number is invalid. Try again");
        }

        //We can use the Switch-case as a alternative for if-else aligned

        switch(weekDay){
            case 1: System.out.println("Sunday"); break; //break it's like }
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thuesday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Number invalid. Try again");
        }

        switch(weekDay){
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Week day"); break;
            case 1: 
            case 7: System.out.println("Weekend day"); break;
            default: System.out.println("Number invalid. Try again");
        }
    }
}