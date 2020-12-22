import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("실수 A : ");
		double a = sc.nextDouble();
		System.out.println("실수 B : ");
		double b = sc.nextDouble();
		double max;	//큰 값을 저장
		if(a>b)
			max = a;
		else
			max = b;
		System.out.println("큰 쪽의 값은 "+ max +"입니다.");

	}

}
