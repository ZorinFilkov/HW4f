import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		String str1 = in.nextLine();
		switch (str1) {
		case "0":
			System.out.println("нула");
			break;
		case "1":
			System.out.println("едно");
			break;
		case "2":
			System.out.println("две");
			break;
		case "3":
			System.out.println("три");
			break;
		case "4":
			System.out.println("четири");
			break;
		case "5":
			System.out.println("пет");
			break;
		case "6":
			System.out.println("шест");
			break;
		case "7":
			System.out.println("седем");
			break;
		case "8":
			System.out.println("осем");
			break;
		case "9":
			System.out.println("девет");
			break;
	
		
			
			int score = in.nextInt();
			switch (score) {
			case 1:
			case 2:
			case 3:
				score = score * 5;
				break;
			case 4:
			case 5:
			case 6:
				score = score * 10;
				break;
			case 7:
			case 8:
			case 9:
				score = score * 50;
				break;
			}
			System.out.println(score);
		
		
			
			char card = in.next().charAt(0);
			if (card == '2' || card == '3' || card == '4' || card == '5'
					|| card == '6' || card == '7' || card == '8' || card == '9'
					|| card == 'T' || card == 'J' || card == 'Q' || card == 'K'
					|| card == 'A') {
				System.out.println("¬алидна карта!");
			} else {
				System.out.println("Ќевалидна карта!");
		}

}
}
}
