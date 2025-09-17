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

    @Override
    public String toString(){
        return getTitle() + " " + "(" + getType() + ")";
    }
}
