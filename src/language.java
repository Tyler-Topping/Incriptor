
//this will allow a typed message to be translated into a code
//which will then be translated back into the original message using another program
import java.util.Scanner;

public class language {

	public static void main(String[] args) {
		String message;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your message here: ");

		message = scan.nextLine();
		int messageLength = message.length() - 1;
		
		char[] messageArray = new char[messageLength];
		
		for (int i=0; i < messageLength + 1; i++)
		{
			messageArray[i] = message.charAt(i);
		}
		
		int[] unicodeMessage = new int[messageLength];
				
		scan.close();
	}
}
