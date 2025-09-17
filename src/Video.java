public class Video extends LoanItems{

    private int length; //Attribute til at bestemme længde

    Video(String title, String type, int length){
        super (title, type);
        this.length = length; // Konstruktør til at definere længde
    }

    //Metode til at returnere længden af video i minutter
    public int getLength() {return length;}

    @Override
    public String toString() {
        return super.toString()+ "\t" + getLength(); // Returnerer længde

    }
}
