import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		System.out.print("정수 B : ");
		int b = sc.nextInt();
		System.out.print("정수 C : ");
		int c = sc.nextInt();
		int min = a;
		if(b<min)	min = b;
		if(c<min)	min = c;
		System.out.println("최솟값은 " + min +"입니다.");
		
	}

}
