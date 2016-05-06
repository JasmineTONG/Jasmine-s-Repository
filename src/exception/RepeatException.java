package exception;


public class RepeatException extends BaseException{

	private static final long serialVersionUID = 1L;

	public RepeatException(){
		reminder = new WarnReminder();
		reminder.setError_type(200);
		reminder.setError_message("repeat_error");
	}

	
}
