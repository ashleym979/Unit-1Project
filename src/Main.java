import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("|Note! do not use any symbols when inputting data! (no $ or %|");
        System.out.println("--------------------------------------------------------------");




        System.out.println("Enter your Bill($): ");
        double totalBill= scan.nextDouble();
        System.out.println("Tip Percent: ");
        int tip= scan.nextInt();
        System.out.println("Number of People: ");
        int people= scan.nextInt();




        double tipDeci= (double) tip/100;
        double billPerPerson= (double)((int)(totalBill/people*100))/100;
        double tipPerPerson= (double)((int)(billPerPerson*tipDeci*100))/100;
        double totalTip= (double)((int)(tipPerPerson*people*100))/100;
        double tipBill= (double)((int)((billPerPerson+tipPerPerson)*100))/100;
        double totalTipBill= (double)((int)((totalBill+totalTip)*100))/100;




        System.out.println("-------------------------------------");
        System.out.println("|Total Tip Amount: $"+totalTip);
        System.out.println("-------------------------------------");
        System.out.println("|Total bill cost: $"+totalTipBill);
        System.out.println("-------------------------------------");
        System.out.println("|Tip per person: $"+tipPerPerson);
        System.out.println("-------------------------------------");
        System.out.println("|Total bill per person: $"+tipBill);
        System.out.println("-------------------------------------");
    }
}



