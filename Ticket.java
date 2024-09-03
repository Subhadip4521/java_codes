import java.util.Scanner;


public class Ticket{
    public static double refreshment(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Any refreshment needed?");
        System.out.println("Enter number of refreshment: ");
        int rfhmnt= sc.nextInt();
        double costr=50*rfhmnt;
        return costr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter number of tickets: ");
        int nOfTickets=sc.nextInt();
        if(nOfTickets<5 || nOfTickets>40){
            System.out.println("Minimum of 5 and Maximum of 40 tickets.");
            System.exit(0);
        }
        if(nOfTickets>=5 && nOfTickets<=40){
            if(nOfTickets>20){
                System.out.println("You will get 10% discount.");
            }
        }

        System.out.println("Do you have any coupon code? ");
        System.out.println("Press Y for yes \nPress N for no");
        String code=sc.next();

        int Ycode;
        if(code.equals("Y")){
            System.out.print("Enter coupon code: ");
            Ycode=sc.nextInt();
            System.out.println("You will get 2% discount.");
        }
        else if(code.equals("N")){

        }
        else{
            System.out.println("Invalid input.");
            System.exit(0);
        }



        System.out.println("Which class of tickets do you want: ");
        System.out.print("Press K for front seat\nPress Q for rear seat: ");
        String ticketClass=sc.next();



        double costk;
        double costq;

        if(ticketClass.equals("K")){
            System.out.println("The ticket cost is Rs. 75.");
            costk=75*nOfTickets;
            System.out.println("Total cost of tickets is Rs. "+costk);

            if(nOfTickets>20 && code.equals("N")){
                costk=costk-costk*(0.10);
                System.out.println("After discount total cost of tickets is Rs. "+(costk));
            }
            if(nOfTickets<=20 && code.equals("N")){
                // costk=costk;
                System.out.println("After discount total cost of tickets is Rs. "+(costk));
            }
            if(nOfTickets>20 && code.equals("Y")){
                costk=costk-costk*(0.10)*(0.02);
                System.out.println("After discount total cost of tickets is Rs. "+(costk));
            }
            if(nOfTickets<=20 && code.equals("Y")){
                costk=costk-costk*(0.02);
                System.out.println("After discount total cost of tickets is Rs. "+(costk));
            }

            double r=refreshment();
            System.out.println("Total cost: "+(r+costk));
        }


        else if(ticketClass.equals("Q")){
            System.out.println("The ticket cost is Rs.150.");
            costq=150*nOfTickets;
            System.out.println("Total cost of tickets is Rs. "+costq);

            if(nOfTickets>20 && code.equals("N")){ 
                costq=costq-costq*(0.10);
                System.out.println("After discount total cost of tickets is Rs. "+costq);
            }
            if(nOfTickets<=20 && code.equals("N")){ 
                // costq=costq;
                System.out.println("After discount total cost of tickets is Rs. "+costq);
            }
            if(nOfTickets>20 && code.equals("Y")){
                costq=costq-costq*(0.10)*(0.02);
                System.out.println("After discount total cost of tickets is Rs. "+costq);
            }
            if(nOfTickets<=20 && code.equals("Y")){
                costq=costq-costq*(0.02);
                System.out.println("After discount total cost of tickets is Rs. "+costq);
            }

            double r=refreshment();
            System.out.println("Total cost: "+(r+costq));
        }

        else{
            System.out.println("Invalid input.");
            System.exit(0);
        }
        
    }
}