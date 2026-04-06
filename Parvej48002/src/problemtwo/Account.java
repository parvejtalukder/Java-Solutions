package problemtwo;

// ENCAPSULATION
public class Account {
    private int ac; // using this
    // setter Method
    public void Rakhram(int input) {
        System.out.println("Started");
        this.ac = input;        
        System.out.println("Inputed");
    }
    // getter Method
    public int Niram() {
        System.out.println("Printing on the go");
        return this.ac;
        // System.out.println("Returned");
    }

}
