import java.util.Scanner;

public class GradeConvertApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int gradeScore;

		System.out.print("Please enter a whole number that you'd like to convert to a letter grade: ");
		gradeScore = scanner.nextInt();

		if (gradeScore > 101) {
			System.out.println("You're a liar! Your teacher isn't into bonus points.");
		}
		if (gradeScore > 88 && gradeScore < 100) {
			System.out.println("Sweet, you got an A.");
		}
		if (gradeScore > 80 && gradeScore < 87) {
			System.out.println("You got a B. Not bad!");
		}
		if (gradeScore > 67 && gradeScore < 79) {
			System.out.println("Meh. Looks like you got a C.");
		}
		if (gradeScore > 60 && gradeScore < 66) {
			System.out.println("Your mom is gonna be pissed, you got a D.");
		}
		if (gradeScore < 60) {
			System.out.println("Learn to flip burgers, you're stupid. You got a F, dummy.");
		}
		scanner.close();
	}
}