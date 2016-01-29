package mathQuiz;

public interface Operations {
	
	/**
	 * @param two integers 
	 */
	public int validResult(int firstNum, int secondNum) ;
	
	public String question();
	
	public String partialFailedMessage();
	
	public String finalFailedMessage(int validResult);
	
	public String successMessage();
	
}


