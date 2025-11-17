import java.util.Scanner;

public class ScannerClassExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name ;
        int rollno;
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the roll no");
        rollno = sc.nextInt();

        // print the name and roll number

        System.out.println("Name is: "+name);
        System.out.println("Roll number is "+rollno);
    }
    
}
