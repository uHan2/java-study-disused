import java.io.*;
import java.util.*;

public class Main
{
    static int N;
    static int M;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] nArr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < nArr.length; i++)
        {
            nArr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(nArr);

        int end = nArr[nArr.length-1];
        int result = binarySearch(nArr, M, 0, end);

        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        int result = 0;


        while (start <= end)
        {
            int total = 0;
            int mid = (start + end) / 2;

            for (int i = 0; i < N; i++)
            {
                if(arr[i] > mid)
                {
                    total += arr[i] - mid;
                }
            }

            if (total < M)
            {
                end = mid - 1;
            } else
            {
                result = mid;
                start = mid + 1;
            }
        }

        return result;
    }
}
