
public class HAQ3 {

	public static void main(String[] args) {
		int max = 12, min = 1, randomNum;
		randomNum = (int) (Math.random()*(max - min + 1)+min);
		switch (randomNum) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		default:
			System.out.println("Dec");
		}
	}

}
