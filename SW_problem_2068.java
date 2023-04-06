import java.util.Arrays;
import java.util.Scanner;

public class SW_problem_2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스 입력 받음
		int [] array = new int[10];	// 변수 array 배열 선언
		
		for(int i = 0; i < t; i++) {	// 테스트 케이스만큼 반복
			for(int j = 0; j < 10; j++) {
				array[j] = sc.nextInt();	// 배열안에 들어갈 10개의 숫자 입력 받음					
			}
			Arrays.sort(array);	// 배열을 오름차순으로 정렬
			System.out.println("#" + (i + 1) + " " + array[9]);	// 배열은 0부터 시작해서 [9]면 10번째 숫자 출력
		}
	}
}
