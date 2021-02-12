

public class JavaConsole 
{
    public static void main(String[] args) 
    {
        Student student = new Student("홍길동"
            , 20, 175, 70, "20170101", 1, 4.5);
        student.show();

        Teacher teacher1 = new Teacher("Jone Doe"
        ,25, 180, 120, "ABC201", 3000000, 5);

        teacher1.show();
    }
}