package subject;

public class Subject {
    private String name;
    private String grade;
    private double credit;

    public Subject(String name, String grade, double credit) {
        this.name = name;
        this.grade = grade;
        this.credit = credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getCredit() {
        return credit;
    }
}