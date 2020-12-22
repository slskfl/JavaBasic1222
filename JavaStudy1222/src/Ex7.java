import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		
		System.out.print("정수 B : ");
		int b = sc.nextInt();
		
		int diff = a>=b ? a-b : b-a;
		
		System.out.println("두 값의 차는 " + diff +"입니다.");

	}

}
