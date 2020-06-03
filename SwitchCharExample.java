package TempCh4;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'S':
		case 's':
			System.out.println("Èæ¿ì");
			break;
		case 'A':
		case 'a':
			System.out.println("È£°»");
			break;
		case 'B':
		case 'b':
			System.out.println("ÀÏ¹ÝÈ¸¿ø");
			break;
		default:
			System.out.println("¼Õ³ð");
		}

	}

}
