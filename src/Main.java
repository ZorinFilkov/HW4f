import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		String str1 = in.nextLine();
		switch (str1) {
		case "0":
			System.out.println("����");
			break;
		case "1":
			System.out.println("����");
			break;
		case "2":
			System.out.println("���");
			break;
		case "3":
			System.out.println("���");
			break;
		case "4":
			System.out.println("������");
			break;
		case "5":
			System.out.println("���");
			break;
		case "6":
			System.out.println("����");
			break;
		case "7":
			System.out.println("�����");
			break;
		case "8":
			System.out.println("����");
			break;
		case "9":
			System.out.println("�����");
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
				System.out.println("������� �����!");
			} else {
				System.out.println("��������� �����!");
		}

}
}
}
