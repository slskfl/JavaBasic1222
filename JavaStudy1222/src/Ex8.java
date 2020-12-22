import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수A: ");
		int num1 = scan.nextInt();
		System.out.print("점수B: ");
		int num2 = scan.nextInt();
		int diff;
		
		if(num1>num2) {
			diff=num1-num2;
			if(diff>=11) {
				System.out.println("두 값의 차는 11이상입니다.");
			} else if(diff<=10) {
				System.out.println("두 값의 차는 10이하입니다.");
			} else if(diff==0) {
				System.out.println("두 수가 같습니다.");
			}
		} else if(num1<num2) {
			diff=num2-num1;
			if(diff>=11) {
				System.out.println("두 값의 차는 11이상입니다.");
			} else if(diff<=10) {
				System.out.println("두 값의 차는 10이하입니다.");
			}else if(diff==0) {
				System.out.println("두 수가 같습니다.");
			}
		}
		/*System.out.print("정수 A : ");
		int a = sc.nextInt();
		
		System.out.print("정수 B : ");
		int b = sc.nextInt();
		
		int diff = a>=b ? a-b : b-a;

		System.out.println("두 값의 차는 "+ 
				(diff<=10 ? "10이하" : "11이상")+"입니다.");
		 */
	}

}
