//this will allow a typed message to be translated into a code
//which will then be translated back into the original message using another program
import java.util.Scanner;
public class language {

	public static void main(String[] args) {
		String message;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your message here: ");
		
		message = scan.nextLine();
		
		  for(int i = 0;i<message.length();i++)
          {
             char letter = message.charAt(i);
             if(letter == 'a')
             {
            	 letter = 'g';
             }
             else if(letter == 'b')
             {
            	 letter = 'h';
             }
             else if(letter == 'c')
             {
            	 letter = 'i';
             }
             else if(letter == 'd')
             {
            	 letter = 'j';
             }
             else if(letter == 'e')
             {
            	 letter = 'k';
             }
             else if(letter == 'f')
             {
            	 letter = 'l';
             }
             else if(letter == 'g')
             {
            	 letter = 'm';
             }
             else if(letter == 'h')
             {
            	 letter = 'n';
             }
             else if(letter == 'i')
             {
            	 letter = 'o';
             }
             else if(letter == 'j')
             {
            	 letter = 'p';
             }
             else if(letter == 'k')
             {
            	 letter = 'q';
             }
             else if(letter == 'l')
             {
            	 letter = 'r';
             }
             else if(letter == 'm')
             {
            	 letter = 's';
             }
             else if(letter == 'n')
             {
            	 letter = 't';
             }
             else if(letter == 'o')
             {
            	 letter = 'u';
             }
             else if(letter == 'p')
             {
            	 letter = 'v';
             }
             else if(letter == 'q')
             {
            	 letter = 'w';
             }
             else if(letter == 'r')
             {
            	 letter = 'x';
             }
             else if(letter == 's')
             {
            	 letter = 'y';
             }
             else if(letter == 't')
             {
            	 letter = 'z';
             }
             else if(letter == 'u')
             {
            	 letter = 'a';
             }
             else if(letter == 'v')
             {
            	 letter = 'b';
             }
             else if(letter == 'w')
             {
            	 letter = 'c';
             }
             else if(letter == 'x')
             {
            	 letter = 'd';
             }
             else if(letter == 'y')
             {
            	 letter = 'e';
             }
             else if(letter == 'z')
             {
            	 letter = 'f';
             }
             if(letter == ' ' )
             {
              System.out.println("");
             }
             System.out.println(letter);
          }
	}
}
