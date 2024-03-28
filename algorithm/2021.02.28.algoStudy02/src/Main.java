import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static int n;
    public static int[] arr;

    public static int binarySearch(int start, int end)
    {
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] == mid) return mid;
            else if(arr[mid] > mid) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int index = binarySearch(0, n - 1);

        System.out.println(index);
    }
}
