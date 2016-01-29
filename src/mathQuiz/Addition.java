package mathQuiz;

public class Addition implements Operations {

	/**
	 * @return the sum of two numbers "firstNum + secondNum"
	 */
	public int validResult(int firstNum, int secondNum) {
			return firstNum + secondNum;
	}
	
	public String question(){
		String question = "What is the sum of two numbers ?" ;
		return question ;
	}
	
	public String partialFailedMessage(){
		 String failedMessage = "Your answer is wrong";
		 return failedMessage;
	}
	
	public String finalFailedMessage(int validResult){
		 String finalFailedMessage = "Your answer is wrong again."
		 		+ " The answer should be " + validResult;
		 
		 return finalFailedMessage;
	}
	
	public String successMessage(){
		String successMessage = "Your addition is good";
		return successMessage;
	}
	
	
	

}
