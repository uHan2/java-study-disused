import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static int N;
    static int[] arr;
    static int[] operationArr = new int[4];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++)
        {
            operationArr[i] = Integer.parseInt(st2.nextToken());
        }

        cal(1, arr[0]);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void cal(int count, int result)
    {
        if (count == N)
        {
            MAX = Math.max(MAX, result);
            MIN = Math.min(MIN, result);
        }

        if (operationArr[0] > 0)
        {
            operationArr[0]--;
            cal(count + 1, result + arr[count]);
            operationArr[0]++;

        }
        if (operationArr[1] > 0)
        {
            operationArr[1]--;
            cal(count + 1, result - arr[count]);
            operationArr[1]++;

        }
        if (operationArr[2] > 0)
        {
            operationArr[2]--;
            cal(count + 1, result * arr[count]);
            operationArr[2]++;
        }
        if (operationArr[3] > 0)
        {
            operationArr[3]--;
            cal(count + 1, result / arr[count]);
            operationArr[3]++;
        }
    }
}
