import java.sql.SQLOutput;
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
            sc.nextLine();
        }while(numberOfItems <= 0);{
                System.out.println("Noted that you would like to register " + numberOfItems + " items");
        }

        System.out.println();

        LoanItems[] Items = new LoanItems[numberOfItems];
        for (int i = 0; i <numberOfItems; i++){
            System.out.println("Enter name of title " + (i+1));
            String name = sc.nextLine();

            System.out.println("Enter type of item (Video/Book) ");
            String type = sc.nextLine();

            if(type.equalsIgnoreCase("Book")) {
                System.out.println("Enter number of pages in the book ");
                int pages = sc.nextInt();
                sc.nextLine();

                Items[i] = new Book(name, type, pages);
            }else if(type.equalsIgnoreCase("Video")){
                System.out.println("Enter length of video (In minutes) ");
                int length = sc.nextInt();
                sc.nextLine();
                Items[i]= new Video (name, type, length);
            }
        }
        System.out.println("List of loan items:");
        System.out.println("-------------------");

        System.out.println("ID\tTYPE\tTITLE");
        for(int i = 0; i < Items.length; i++){
            System.out.println((i + 1) + "\t" + Items.toString());
        }
    }
}
