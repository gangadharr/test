import java.util.ArrayList;
import java.util.List;

//Added some comment

public class Test {
	private static List<String> s = new ArrayList<String>();
	public static void main(String[] args) throws InterruptedException {
		while(true){
			//s.add(new TestPOJO());
			s.add("test this will break");
			System.out.println("true..");
		}
	}
	public static void testMethod(){
		System.out.println("test Method updated....");
	}
	
}
