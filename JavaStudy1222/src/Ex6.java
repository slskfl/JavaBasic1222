import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("�Ǽ� A : ");
		double a = sc.nextDouble();
		System.out.println("�Ǽ� B : ");
		double b = sc.nextDouble();
		double max;	//ū ���� ����
		if(a>b)
			max = a;
		else
			max = b;
		System.out.println("ū ���� ���� "+ max +"�Դϴ�.");

	}

}
