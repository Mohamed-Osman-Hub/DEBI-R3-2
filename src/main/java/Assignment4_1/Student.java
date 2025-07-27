package Assignment4_1;


public class Student {
        String Name;
        int StudentId;
        String Major;
        Double Gpa;

   public Student(String Name,int StudentId,String Major){
           this.Name=Name;
           this.StudentId=StudentId;
           this.Major=Major;
           this.Gpa=0.0;

   }

  public void displayStudentInfo (){
           System.out.println("Student Info :");
           System.out.println("Student Name : "+Name);
           System.out.println("Student ID : "+StudentId);
           System.out.println("Major : "+Major);
           System.out.println("GPA : "+Gpa);
           System.out.println("---------------------");

        }
    public void UpdateGpa (double NewGpa){
           System.out.println("Current GPA : "+Gpa);
           Gpa=NewGpa;
        System.out.println("New GPA : "+Gpa);
        System.out.println("---------------------");
    }

  }
