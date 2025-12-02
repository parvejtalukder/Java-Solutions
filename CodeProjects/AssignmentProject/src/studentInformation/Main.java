package studentInformation;

public class Main {
    public static void main(String[] args) {
        Student pht = new Student();
        Student anther = new Student();
        pht.studentName = "Md Parvej Husen Talukder";
        pht.studentRoll = 48002;
        pht.studentDept = "CSE";
        anther.studentName = "Md Mamun Ur Rashid";
        anther.studentRoll = 48021;
        anther.studentDept = "CSE";
        pht.displayInfo();
        anther.displayInfo();
    }

}
