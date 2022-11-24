import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String student;
        int classes;
        System.out.println("Hello, what is your name?");
        student = scan.nextLine();
        System.out.println(student+", how many classes are you taking?");
        classes = scan.nextInt();
        StudentSchedule s1 = new StudentSchedule(student,classes);
        s1.buildSchedule();
       System.out.println(s1.getSchedule());
    }
}
