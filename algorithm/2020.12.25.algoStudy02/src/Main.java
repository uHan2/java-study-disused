import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {

            nArr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] mArr = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
        {

            mArr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++)
        {
            if (binarySearch(nArr, mArr[i], 0, N - 1) == -1)
            {
                System.out.print("no ");
            } else
            {
                System.out.print("yes ");
            }
        }

    }

    // 이진 탐색 소스코드 구현(반복문)
    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        while (start <= end)
        {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) return mid;
                // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;
                // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else start = mid + 1;
        }
        return -1;
    }
}
