package ExamTrial.util;

@SuppressWarnings("serial")
public class IllegalParameterException extends Exception {

	public IllegalParameterException(String message) {
		super(message);
	}

	public IllegalParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}
