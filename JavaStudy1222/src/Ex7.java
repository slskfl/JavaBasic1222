import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� A : ");
		int a = sc.nextInt();
		
		System.out.print("���� B : ");
		int b = sc.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		
		System.out.println("�� ���� ���� " + diff +"�Դϴ�.");

	}

}
