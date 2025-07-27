package Assignment4_1;

public class UniversityApp {
    public static void main(String[] arg){
        Student Student1 = new Student("Mohamed",101,"Business");
        Student Student2 = new Student("Ahmed",102,"Accounting");

        Student1.displayStudentInfo();
        Student2.displayStudentInfo();

        Student1.UpdateGpa(3.8);
        Student1.displayStudentInfo();


    }
}
