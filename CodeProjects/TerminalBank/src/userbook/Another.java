public class Another extends User { 
    String temp = "Student";
    Another(String Name, String Role, int Id) {
        super(Name, Role, Id);
        if (this.temp == super.role) {
            super.pre = "Std";
        } else {
            super.pre = "Sir";
        }
    }
}