import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        // 2배, 3배, 5배를 위한 인덱스
        int i2 = 0, i3 = 0, i5 = 0;
        // 처음에 곱셈 값을 초기화
        int next2 = 2, next3 = 3, next5 = 5;

        arr[0] = 1; // 첫 번째 못생긴 수는 1
        // 1부터 n까지의 못생긴 수들을 찾기
        for (int l = 1; l < n; l++)
        {
            // 가능한 곱셈 결과 중에서 가장 작은 수를 선택
            arr[l] = Math.min(next2, Math.min(next3, next5));
            // 인덱스에 따라서 곱셈 결과를 증가
            if (arr[l] == next2)
            {
                i2 += 1;
                next2 = arr[i2] * 2;
            }
            if (arr[l] == next3)
            {
                i3 += 1;
                next3 = arr[i3] * 3;
            }
            if (arr[l] == next5)
            {
                i5 += 1;
                next5 = arr[i5] * 5;
            }
        }

        // n번째 못생긴 수를 출력
        System.out.println(arr[n - 1]);
    }
}
