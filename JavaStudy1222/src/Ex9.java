import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� A : ");
		int a = sc.nextInt();
		System.out.print("���� B : ");
		int b = sc.nextInt();
		System.out.print("���� C : ");
		int c = sc.nextInt();
		int min = a;
		if(b<min)	min = b;
		if(c<min)	min = c;
		System.out.println("�ּڰ��� " + min +"�Դϴ�.");
		
	}

}
