package StudentDataBase;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Student {
    private int id=1000;
    private String name;
    private int year;
    private int courses;
    private int gradeLevel;
    private int balance;
    private String studentID;
    private final int courseFee=600;
   private String course;
    /*
    * Ask the user how many new students will be added to the database

 Each course costs $600 to enroll
 * */
    public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name");
        this.name=sc.nextLine();
        System.out.println("Enter Student year");
        this.year=sc.nextInt();



        System.out.println("Enter the grade level");
        this.gradeLevel=sc.nextInt();
        System.out.println(gradeLevel);
        sc.close();
        StudentId();
        System.out.println("Student Name: "+name+"\nYear: "+year+"\ngradeLevel: "+gradeLevel+"\nStudent ID is: "+studentID);

    }



    public void StudentId(){
        id++;
        this.studentID= gradeLevel+""+id;
    }


    public void enrollCourse(){
        do{
            System.out.println("Enter Course to enroll or Q for Quit");
            Scanner scan=new Scanner(System.in);

            this.course=scan.nextLine();
            if(this.course.equals("Q")){
                break;
            }
            else{
                System.out.println("Enter Course ID");
                System.out.println("Entered Course Name: "+course);
                balance=balance+courseFee;
            }

         }
        while(1!=0);
        System.out.println("Entered Course Name: "+course);
        System.out.println("Balance: "+balance);
    }

    public int checkBalance(){
        return balance;
    }

    public String checkStatus(){
        return name+id+course+balance;
    }
}
