
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name = s.nextLine();
        System.out.println("Enter their Marks of m1,m2 and m3");
        int marks1= s.nextInt();
        int marks2= s.nextInt();
        int marks3= s.nextInt();
        int sum = marks1+marks2+marks3;
        System.out.println(name);
        System.out.println(sum/3);
    }
}
