import java.util.ArrayList;
import java.util.List;

public class Test {
	private static List<String> s = new ArrayList<String>();
	public static void main(String[] args) throws InterruptedException {
		while(true){
			//s.add(new TestPOJO());
			System.out.println("true..");
			s.add("test this will break");
		}
	}
	public static void testMethod(){
	}
}
