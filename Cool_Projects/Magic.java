// Gp back to the code and change myNumber to any other integer. Witness magic.

public class Magic {
	public static void main(String[] args) {
		//This will be the original number
		int myNumber = 9;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
		System.out.println(stepSix);
	}
}