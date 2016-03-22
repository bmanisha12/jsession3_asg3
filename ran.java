import java.util.Random;


public class ran {
 public static void main(String args[])
 {
	 Random r = new Random();
	 
	 int i = r.nextInt(10)+1;
	 
	 System.out.println("\n random number generated is : "+i);
 }
}
