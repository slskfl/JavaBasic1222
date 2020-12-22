import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
				int num = sc.nextInt();
		if(num>0) { //양수 일때 
					
				}else {	//음수 일때 
					
				}
		if(num%3==0) {
			System.out.println("이 값은 3으로 나누어집니다.");
		}else if(num%3==1) {
			System.out.println("이 값은 3으로 나눈  나머지는 1입니다.");
		}else {
			System.out.println("이 값은 3으로 나눈  나머지는 2입니다.");
		}

		/*if(num>0) { //양수 일때 
			if(num%3==0) {
				System.out.println("이 값은 3으로 나누어집니다.");
			}else if(num%3==1) {
				System.out.println("이 값은 3으로 나눈  나머지는 1입니다.");
			}else {
				System.out.println("이 값은 3으로 나눈  나머지는 2입니다.");
			}
		}else {	//음수 일때 
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}*/


	}

}
