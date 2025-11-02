package OOPsEncapsulation.Packge1;

public class Teacher {

    public int teacherSchoolId;
    public String teacherName;

    private int teacherSalary;


    static void main() {
        Teacher teacher = new Teacher();
        teacher.teacherSalary = 200;

        System.out.println("Teacher Salary: $"+teacher.teacherSalary);
    }
}
