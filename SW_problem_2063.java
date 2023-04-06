import java.util.Arrays;
import java.util.Scanner;

public class SW_problem_2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// N을 입력받음
		int[] arr = new int[N];	// 배열 선언
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);	// 배열을 정렬
		System.out.println(arr[N/2]);	// 배열의 중간값 출력
	}
}
