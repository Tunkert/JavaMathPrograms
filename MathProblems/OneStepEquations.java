import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OneStepEquations {
	public static void main(String[] args) {
		String problemString;
		String correctString;
		int upperbound = 10;
		int intRandom1;
		int intRandom2;
		Random rand = new Random();
		try {
			FileWriter myFile = new FileWriter("one-step-equations.html");
			FileWriter myFile2 = new FileWriter("one-step-equation-solutions.html");
			for (int i = 0; i < 100; i++) {
				intRandom1 = rand.nextInt(upperbound) + 1;
				intRandom2 = rand.nextInt(upperbound) + 1;
				problemString = Equation(intRandom1, intRandom2);
				correctString = Solution(intRandom1, intRandom2);
				myFile.write("<p>" + (i + 1) + ") " + problemString + "<p>\n");
				myFile2.write("<p>" + (i + 1) + ") " + correctString + "<p>\n");
			}
			myFile.close();
			myFile2.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static String Equation(int num1, int num2) {
		String equationString = String.format("Solve for x: x + %d = %d.", num1, num2);
		return equationString;
	}

	public static String Solution(int num1, int num2) {
		int solution = num2 - num1;
		String solutionString = String.format("The solution is: %d.", solution);
		return solutionString;
	}
}