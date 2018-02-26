import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println("Enter amount of operations: ");
		int n = input.nextInt();

		for(int i = 0; i<n; i++) {
			System.out.println("Enter a choice: \n1) “1 X” put X at the end of ArrayList\n"
					+ "2) “2 Y” remove all Y’s from ArrayList\n3) “3” print the size of ArrayList");
			choice = input.nextInt();
			switch(choice) {
			case(1):
				arrayList.add(input.nextInt());
				break;
			case(2):
				int temp = input.nextInt();
				for(int j = 0; j<arrayList.size(); j++) {
					if(arrayList.get(j) == temp) {
						arrayList.remove(j);
					}
				}
				break;
			case(3):
				System.out.println(arrayList.size());
				break;
			default:
				System.out.println("Invalid choice.");
				i--;
			}	
		}
		input.close();
	}

}
