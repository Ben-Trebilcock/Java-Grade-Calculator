import java.text.DecimalFormat;
import java.util.Scanner;

public class gradeCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello, what is your first name?");
		String firstName = scanner.next();
		
		System.out.println("What is your last name?");
		String lastName = scanner.next();
		
		System.out.println("How many points did you score on the last assignment?");
		double points = scanner.nextInt();
		
		System.out.println("How many points were possible?");
		double possiblePoints = scanner.nextInt();
		
		double score = points / possiblePoints * 100;
		
		String grade;
		
		if (score >= 94) {
			grade = "A";
		} else if (score >= 90) {
			grade = "A-";
		} else if (score >= 87) {
			grade = "B+";
		} else if (score >= 84) {
			grade = "B";
		} else if (score >= 80) {
			grade = "B-";
		} else if (score >= 75) {
			grade = "C+";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 65) {
			grade = "C-";
		} else {
			grade = "F";
		}
		
		DecimalFormat df = new DecimalFormat("#.##");
		score = Double.valueOf(df.format(score));
		
		
		System.out.println(firstName + " " + lastName + ", your letter grade is " + grade + "; your score was " + score);
		
		scanner.close();
	}

}
