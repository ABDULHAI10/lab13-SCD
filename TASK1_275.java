import java.util.Scanner;
public class TASK1_275 {

	public static void main(String[] args) {
		Scanner abdulhai = new Scanner(System.in);
		{
			try {
				int [] array = {253,255,260,266,267,272,275,279,286,291};
				System.out.println("ENTER ARRAY INDEX NUMBER : ");
				int index = abdulhai.nextInt();
				System.out.println("THE NUMBER IS : "+array[index]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ARRAY INDEX IS OUT OF BOUNDS");
			}
		}
	}
}