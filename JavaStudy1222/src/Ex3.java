import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
				int point = sc.nextInt();
		if(point>=0 && point<=59) {
					System.out.println("��");
				}
		else if(point>=60 && point<=69){
					System.out.println("��");
				}
		else if(point>=70 && point<=79) {
					System.out.println("��");
				}
		else if(point>=80 && point<=89) {
					System.out.println("��");
				}
		else if(point>=90 && point<=100) {
					System.out.println("��");
				}
		else {
					System.out.println("�߸��� �����Դϴ�.");
				}

	}

}
