package TempCh4;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'S':
		case 's':
			System.out.println("���");
			break;
		case 'A':
		case 'a':
			System.out.println("ȣ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;
		default:
			System.out.println("�ճ�");
		}

	}

}
