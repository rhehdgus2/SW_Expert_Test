import java.util.Scanner;

public class SW_problem_2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스 입력 받음
		
		for(int i = 0; i < t; i++) {	// 테스트 케이스만큼 반복문 실행
			int sum = 0;			//
			double average = 0.0;	// 평균 계산을 위한 변수들을 선언
			
			for(int j = 0; j < 10; j++) {	// 10개의 값을 더함
				int a = sc.nextInt();
				sum += a;
			}
			
			average = (double)sum / 10.0;	// 평균 = 전부 더한거 / 10
			System.out.println("#" + (i + 1) + " " + Math.round(average));	// Math.round()로 반올림
		}
	}
}
