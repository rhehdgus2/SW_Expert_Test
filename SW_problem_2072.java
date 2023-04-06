import java.util.Scanner;

public class SW_problem_2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스 입력 받음
		
		for(int i = 0; i < t; i++) {	// 테스트 케이스만큼 반복문 실행
			int sum = 0;	// 총합 계산을 위한 변수 선언
			for(int j = 0; j < 10; j++) {	// 10개의 홀수 값을 더함
				int a = sc.nextInt();
				if(a%2==1) {
					sum += a;
				}
			}
			System.out.println("#" + (i + 1) + " " + sum);
		}
	}
}
