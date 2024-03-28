import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static int[] arr;
    static int n, x;
    private static int rightBound(int target, int start, int end)
    {
        while (start < end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] > target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    private static int leftBound(int target, int start, int end)
    {
        while (start < end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    private static int getRange(int left, int right)
    {
        // 유의: rightBound와 leftBound는 end 변수의 값을 배열의 길이로 설정해야 한다고 한다. 왜지?
        int rightBound = rightBound(right, 0, n);
        int leftBound = leftBound(left, 0, n);
//        int rightBound = rightBound(right, 0, n - 1);
//        int leftBound = leftBound(left, 0, n - 1);

        return rightBound - leftBound;

    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int count = getRange(x, x);

        if (count == 0) System.out.println(-1);
        else System.out.println(count);
    }
}
