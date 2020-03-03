import java.util.Scanner;

public class ChallengeOne {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the sentences:");
		String inputstr = in.nextLine();
		
		System.out.print("" + countWords(inputstr));
		
	}

	private static int countWords(String inputstr) {
		// TODO Auto-generated method stub
		return inputstr.trim().split("").length + 1;
	}
	
}


