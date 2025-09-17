import java.sql.SQLOutput;
import java.util.Scanner;

public class LoanItemsTest {
    public static void main(String[] args) {
        LoanItems();
    }
    //Metode til vores loan items
    public static void LoanItems() {
        Scanner sc = new Scanner(System.in);
        int numberOfItems; //Integer til at bestemme antallet af items brugeren vil låne

        //Checker om inputtet er en integer som er positiv, ved hjælp af et do while loop
        do {
            System.out.print("How many items would you like to register: ");
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a positive number: ");
                sc.next();
            }
            numberOfItems = sc.nextInt();
            sc.nextLine();
        } while (numberOfItems <= 0);
        {
            System.out.println("Noted that you would like to register " + numberOfItems + " items");
        }

        System.out.println();

        //Vi laver et array med antallet af vores loan items
        LoanItems[] Items = new LoanItems[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter the title of item " + (i + 1) + ": ");
            String name = sc.nextLine();
            //Vi laver en boolean der bruges til at tjekke om inputtet fra brugeren er book eller video
            boolean valid = false;
            while (!valid) {
                System.out.print("Enter type of item (Video/Book): ");
                String type = sc.nextLine();
                if (type.equalsIgnoreCase("Book")) {
                    int pages; //Antal af sider i vores book
                    //Checker om inputtet er en integer som er positiv, ved hjælp af et do while loop
                    do {
                        System.out.print("Enter number of pages in the book: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Please enter a positive number: ");
                            sc.next();
                        }
                        pages = sc.nextInt();
                        sc.nextLine();

                        Items[i] = new Book(name, type, pages);
                        valid = true;
                    } while (pages <= 0);

                } else if (type.equalsIgnoreCase("Video")) {
                    int length; //Længden af vores video
                    //Checker om inputtet er en integer som er positiv, ved hjælp af et do while loop
                    do {
                        System.out.print("Enter the length of the video (in minutes): ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Please enter a positive number: ");
                            sc.next();
                        }
                        length = sc.nextInt();
                        sc.nextLine();

                        Items[i] = new Video(name, type, length);
                        valid = true;
                    } while (length <= 0);

                } else {
                    System.out.println("You did not enter in book or video");
                    System.out.println("Try again");
                    valid = false;
                }
            }
        }
        //Vi laver en fin oversigt over alle vores loan items ved brug af et for loop og toString() metoden
        System.out.println();
        System.out.println("List of loan items:");
        System.out.println("-------------------");

        System.out.println("ID\tTYPE\tTITLE\tPAGES/PLAYTIME(minutes)");
        for (int i = 0; i < Items.length; i++) {
            System.out.println((i + 1) + "\t" + Items[i].toString());
        }
    }
}
