import java.util.Scanner;

class Student {
    private int rollNo;
    private int marksSubject1;
    private int marksSubject2;
    private int marksSubject3;

    public Student(int rollNo, int marksSubject1, int marksSubject2, int marksSubject3) {
        this.rollNo = rollNo;
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
    }

    public double calculateAverageMarks() {
        return (marksSubject1 + marksSubject2 + marksSubject3) / 3.0;
    }

  public void checkResult() {
    if (marksSubject1 >= 35 && marksSubject2 >= 35 && marksSubject3 >= 35) {
        double averageMarks = calculateAverageMarks();
        System.out.println("Average Marks: " + averageMarks);
    } else {
        System.out.println("Fail");
    }
}
public class Marks5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks for Subject 1: ");
        int marksSubject1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int marksSubject2 = sc.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        int marksSubject3 = sc.nextInt();

        Student student = new Student(rollNo, marksSubject1, marksSubject2, marksSubject3);
        student.checkResult();
    }
}
