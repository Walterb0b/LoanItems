public class Book extends LoanItems{
    private int pages;

    //Book constructor som arver title og type fra vores superclass LoanItems
    Book(String title, String type, int pages){
        super(title, type);
        this.pages = pages;
    }

    //getPages metode til at retunere antallet af sider
    public int getPages(){return pages;}


}
