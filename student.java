import java.util.Scanner;

nnerimport java.util.Sca;
public class student {
    String name,branch;
    int age,rollno,prnno;
    Scanner sc=new Scanner(System.in);

    void get(){
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter branch:");
        branch=sc.next();
        System.out.println("Enter age:");
        age=sc.nextInt();
        System.out.println("Enter rollno:");
        rollno=sc.nextInt();
        System.out.println("Enter prnno:");
        prnno=sc.nextInt();

    }
   void info(){
    System.out.println("Name:"+name);
    System.out.println("Branch:"+branch);
    System.out.println("Age:"+age);
    System.out.println("Roll no:"+rollno);
    System.out.println("PRN no:"+prnno);
 } 
   public static void main(String[] args){
    student s=new student();
    s.get();
    s.info();
   }
}
