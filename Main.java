class Student
{
    int RollNo;
    String StudentName;
}

public class Main
{
    public static void main(String[] args)
    {
        Student obj1 = new Student();
        obj1.RollNo = 230101;
        obj1.StudentName = "Istiyak";
        System.out.print(obj1.RollNo + "   ");
        System.out.println(obj1.StudentName);

        Student obj2 = new Student();
        obj2.RollNo = 230102;
        obj2.StudentName = "Imran";
        System.out.print(obj2.RollNo + "   ");
        System.out.println(obj2.StudentName);
    }
}