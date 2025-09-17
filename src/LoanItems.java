public class LoanItems {
    //Attributes til vores loan items
    private String title;
    private String type;

    //Constructor til vores loan items
    LoanItems(String title, String type){
        this.title = title;
        this.type = type;
    }

    //Getters
    public String getTitle() {return title;}
    public String getType() {return type;}

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setType(String type){
        this.type = type;
    }
    //toString metode til at vise title og type på vores item
    @Override
    public String toString(){
        return "\t" + getType() + "\t" + getTitle();
    }
}
