import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

 class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

       
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i+1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;
        int highestGrade = Collections.max(grades);
        int lowestGrade = Collections.min(grades);

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
    }
}

