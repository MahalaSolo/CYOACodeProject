
import java.util.*;

public class CYOADriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean con = true;
		
		while (con == true) {
			System.out.print("Please give me your name: ");
			String name = scan.next();
			System.out.print("Please tell me the name of the restaurant you like best: ");
			String restName = scan.next().toLowerCase();
			System.out.print("Tell me how old you are: ");
			int age = scan.nextInt();
		
			CYOCObject user = new CYOCObject(name, restName, age);
			System.out.println(user.beginning());
			System.out.print(user.scenario1());
		
			String choiceInput = scan.next().toLowerCase();
			
			if(choiceInput.equals("1") || choiceInput.equals("one")){
				
				System.out.println(user.oneOne());
				
			}else if(choiceInput.equals("2") || choiceInput.equals("two")){
				
				System.out.println(user.oneTwo());
				System.out.print(user.scenario2());;
				String secondChoice = scan.next().toLowerCase();
				
				if(secondChoice.equals("1") || secondChoice.equals("one")) {
					
					System.out.println(user.twoOne());
					
				}else if(secondChoice.equals("2") || secondChoice.equals("two")) {
					
					System.out.println(user.twoTwo());
					
				}else if(secondChoice.equals("3") || secondChoice.equals("three")) {
					
					System.out.println(user.twoThree());
					
				}else if(secondChoice.equals("4") || secondChoice.equals("four")) {
					
					System.out.println(user.twoFour());
				}
				
			}else if(choiceInput.equals("3") || choiceInput.equals("three")) {
				
				System.out.println(user.oneThree());
				
			}else if(choiceInput.equals("4") || choiceInput.equals("four")) {
				
				System.out.println(user.oneFour());
				
			}
			
			System.out.print("Would you like to play again?\n"
					+ "Type q to exit or type anything else to try again: ");
			
			String contCheck = scan.next();
			
			if(contCheck.equals("q")) {
				con = false;
			}
			
		}
		System.out.println("Thank you for playing!");
		scan.close();
	}

}
