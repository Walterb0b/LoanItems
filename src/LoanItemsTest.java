import java.util.Scanner;

public class LoanItemsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfItems;
        do{
            System.out.print("How many items would you like to register: ");
        while(!sc.hasNextInt()){
                System.out.print("Please enter a positive number: ");
                sc.next();
            }
            numberOfItems = sc.nextInt();
        }while(numberOfItems <= 0);{
                System.out.println("Noted that you would like to register " + numberOfItems + " items");
        }



        String[] Items = {};


    }

}
