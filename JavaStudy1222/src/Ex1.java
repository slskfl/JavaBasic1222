import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
				int num = sc.nextInt();
		if(num>0) {
					
		}else {
			System.out.println("음의 정숫값을 입력했습니다.");
		}
		if(num%5==0) {
			System.out.println("이 값은 5로 나누어집니다.");
		}else {
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}
		
	/*	if(num%5==0 && num>0) {
			System.out.println("이 값은 5로 나누어집니다.");
		}else if(num%5!=0 && num>0) {
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}else if(num<=0){
			System.out.println("이 값은 음수입니다.");
		}
------------
if(num<0){
			System.out.println("이 값은 음수입니다.");
		}else if(num%5==0) {
			System.out.println("이 값은 5로 나누어집니다.");
		}else if(num%5!=0) {
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}
------------
if(num<0){
			System.out.println("이 값은 음수입니다.");
		}else if(num%5==0) {
			System.out.println("이 값은 5로 나누어집니다.");
		}else {
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}
----------
if(num<0) {
			System.out.println("이 값은 음수입니다.");
		}else if(num%5!=0) {
			System.out.println("이 값은 5로 나누어지지 않습니다");
		}else if(num%5==0) {
			System.out.println("이 값은 5로 나누어 집니다.");
		}
----------
if(num<0) {
			System.out.println("이 값은 음수입니다.");
		}else if(num%5!=0) {
			System.out.println("이 값은 5로 나누어지지 않습니다");
		}else{
			System.out.println("이 값은 5로 나누어 집니다.");
*/

	}

}
