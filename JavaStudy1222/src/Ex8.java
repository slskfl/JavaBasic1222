import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("����A: ");
		int num1 = scan.nextInt();
		System.out.print("����B: ");
		int num2 = scan.nextInt();
		int diff;
		
		if(num1>num2) {
			diff=num1-num2;
			if(diff>=11) {
				System.out.println("�� ���� ���� 11�̻��Դϴ�.");
			} else if(diff<=10) {
				System.out.println("�� ���� ���� 10�����Դϴ�.");
			} else if(diff==0) {
				System.out.println("�� ���� �����ϴ�.");
			}
		} else if(num1<num2) {
			diff=num2-num1;
			if(diff>=11) {
				System.out.println("�� ���� ���� 11�̻��Դϴ�.");
			} else if(diff<=10) {
				System.out.println("�� ���� ���� 10�����Դϴ�.");
			}else if(diff==0) {
				System.out.println("�� ���� �����ϴ�.");
			}
		}
		/*System.out.print("���� A : ");
		int a = sc.nextInt();
		
		System.out.print("���� B : ");
		int b = sc.nextInt();
		
		int diff = a>=b ? a-b : b-a;

		System.out.println("�� ���� ���� "+ 
				(diff<=10 ? "10����" : "11�̻�")+"�Դϴ�.");
		 */
	}

}
