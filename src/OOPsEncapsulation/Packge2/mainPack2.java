package OOPsEncapsulation.Packge2;

import OOPsEncapsulation.Packge1.School;
import OOPsEncapsulation.Packge1.Teacher;

public class mainPack2 extends School{
    static void main() {

        School school = new School();
        school.schoolID = 101;
        school.schoolName = "Ebenezer Public School";
//      school.turnover = 960000; Its is private variable cannot be used in another class
//      school.SchoolAchievement = "Great"; default access modifier, cannot be used outside the package

        Teacher teacher = new Teacher();
        teacher.teacherName = "Mr. Aditya Paliwal";
        teacher.teacherSchoolId = 101;


        System.out.println("School ID: " + school.schoolID);
        System.out.println("School Name: " + school.schoolName);
        System.out.println("Teacher Name: " + teacher.teacherName);
        System.out.println("Teacher School Id: "+ teacher.teacherSchoolId);




        // I am going to use the Protected Acess modifer in to the another package of the subclass
        // so for that we have to extends the base class beacuse the base class protected can be access only in the subclass

        mainPack2 obj = new mainPack2();
        obj.schoolStudentCount = 100;

        System.out.println("schoolStudentCount: " + obj.schoolStudentCount);
    }
}
