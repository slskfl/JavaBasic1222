import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int point = sc.nextInt();
		
		int score = sc.nextInt();
		
		if(score<=100 && score>=0) {
			if(score<=100 && score>=90) {
				System.out.println("수");
			}else if(score<90 && score>=80) {
				System.out.println("우");
			}else if(score<80 && score>=70) {
				System.out.println("미");
			}else if(score<70 && score>=60){
				System.out.println("양");
			}else if(score<60 && score>=0){
				System.out.println("가");
			}
		}else{
			System.out.println("잘못된 점수입니다.");
		}

		
	}

}
