package OOPsEncapsulation.Packge1;

public class School {

    public int schoolID;
    public String schoolName;
    private int turnover;
    String SchoolAchievement; //this is default package access modifier used in the package only

    static void main() {
        School school = new School();
        school.turnover = 9600;

        System.out.println("School Turnover: $"+school.turnover);
    }
}
