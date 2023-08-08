package task;

import java.util.Scanner;

class Dash{
String registrationNumber;
String fullName;
int courseNo;
String courseName;
int credits;
String teacher;
int attendanceSummary;

static void display(String registrationNumber ,
String fullName ,
int courseNo ,
String courseName ,
int credits ,
String teacher ,
int attendanceSummary
){
    registrationNumber = "026";
    fullName ="M.Umer Saleem";
    courseNo = 2345;
    courseName = "OOSE";
    credits = 4;
    teacher = "Mam Rabail";
    attendanceSummary = 90;
}
}

class Profile{
    String registrationNumber;
    String fullName;
    String fatherName;
    String Nationality;
    String dateofBirth;
    String email;
    int contactNo; 
}

class fee{
     String registrationNumber;
     String fullName;
     String semesterDetails;
     int challanNo;
     int dueDate;
     int amountDue;
     int firstdueDate;
     int secondDue;
}

    public class Task{
        static void show(){
        String registrationNumber = "026";
        String fullName = "Umer";
        int courseNo = 123;
        String courseName = "OOSE";
        int credits = 4;
        String teacher = "Mam Rabail";
        int attendanceSummary = 90;
        
        }
    public static void main(String[] args) {
        Dash obj = new Dash();
        fee obj2 = new fee();
        Profile obj3 = new Profile();
        Scanner s = new Scanner(System.in);
        boolean a = false;
        String name[] = new String[5];  
        String dep[] = new String[5];  
        String profile[] = new String[5];
        String fee[] = new String[5];
        System.out.println("Students Data:");
        
        for(int i = 0; i<1; i++){
        System.out.print("Enter the Total number of the student :");
	name[i] = s.nextLine();
        }
        
        for(int i = 0; i<1; i++){
        System.out.print("Enter the name of Dashboard :");
	dep[i] = s.nextLine();
        }
        
        for(int i = 0; i<1; i++){
        System.out.print("Enter the name of Profile :");
	profile[i] = s.nextLine();
        }
        
        for(int i = 0; i<1; i++){
        System.out.print("Enter the name of Student fee Details :");
	fee[i] = s.nextLine();
        a=true;
        }
      }
    }
