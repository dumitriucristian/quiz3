package mathQuiz;

public class Substraction implements Operations {

	@Override
	public int validResult(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return firstNum - secondNum;
	}

	@Override
	public String question() {
		// TODO Auto-generated method stub
		String question = "Calculate the difference of two numbers.";
		return question;
	}

	@Override
	public String partialFailedMessage() {
		// TODO Auto-generated method stub
		String partialFailed = "The answer is wrong try again";
		return partialFailed;
	}

	@Override
	public String finalFailedMessage(int validResult) {
		String finalFailedMessage ="Incorect answer. The difference is : "+validResult;
		return finalFailedMessage;
	}

	@Override
	public String successMessage() {
		String success = "Your calculus is ok. The difference is exactly that";
		return success;
	}

}
