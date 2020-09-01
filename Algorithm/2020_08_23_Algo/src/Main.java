import java.io.*;
import java.util.*;

public class Main
{
    static int[] arr;
    static int[] opArr;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int N;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        StringTokenizer st2 = new StringTokenizer(br.readLine());

        opArr = new int[4];

        for (int i = 0; i < opArr.length; i++)
        {
            opArr[i] = Integer.parseInt(st2.nextToken());

        }

        calMAX(1, arr[0]);

        bw.write(MAX + "\n" + MIN);

        bw.flush();
    }

    public static void calMAX(int cnt, int result)
    {
        if (cnt == N)
        {
            MAX = Math.max(MAX, result);
            MIN = Math.min(MIN, result);
            return;
        }

        if (opArr[0] > 0)
        {
            opArr[0] -= 1;
            calMAX(cnt + 1, result + arr[cnt]);
            opArr[0] += 1;
        }

        if (opArr[1] > 0)
        {
            opArr[1] -= 1;
            calMAX(cnt + 1, result - arr[cnt]);
            opArr[1] += 1;
        }

        if (opArr[2] > 0)
        {
            opArr[2] -= 1;
            calMAX(cnt + 1, result * arr[cnt]);
            opArr[2] += 1;
        }

        if (opArr[3] > 0)
        {
            opArr[3] -= 1;
            calMAX(cnt + 1, result / arr[cnt]);
            opArr[3] += 1;
        }
    }

}