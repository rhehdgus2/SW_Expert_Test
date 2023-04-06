import java.util.Scanner;

public class SW_problem_2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스 입력 받음
		for (int i = 0; i < t; i++) {	// 테스트 케이스만큼 반복 실행
			int a = sc.nextInt();	// 변수 a 입력 받음
			int b = sc.nextInt();	// 변수 b 입력 받음
			
			if(a < b) System.out.println("#" + (i + 1) + " " + "<");	// 조건문 실행
			else if(a == b) System.out.println("#" + (i + 1) + " " + "=");
			else System.out.println("#" + (i + 1) + " " + ">");
		}
	}
}
