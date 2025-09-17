public class Video extends LoanItems{

    private int length;

    Video(String title, String type, int length){
        super (title, type);
        this.length = length;
    }

    //Metode til at returnere længden af vores video
    public int getLength() {return length;}

    @Override
    public String toString() {
        return super.toString()+ "\t" + getLength();

    }
}
