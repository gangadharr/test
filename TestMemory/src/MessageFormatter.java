import java.text.MessageFormat;


public class MessageFormatter {
	public static void main(String[] args) {
		String m1 = "test long {0}";
		System.out.println(MessageFormat.format(m1, 12345678665L));
		
	}
}
