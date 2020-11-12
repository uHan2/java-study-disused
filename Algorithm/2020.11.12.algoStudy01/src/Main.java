import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        // 첫 풀이
        int count = 0;
        int sum = 0;

        for(int i = 0; i < M; i++)
        {
            int firstBig = arr[arr.length-1];
            int secondBig = arr[arr.length-2];
            count++;

            if( count % K == 0)
            {
                sum += secondBig;
            }else
            {
                sum+= firstBig;
            }
        }

        System.out.println(sum);

//        //해설 보고 수정한 풀이
//        int sum = 0;
//        int firstBig = arr[arr.length-1];
//        int secondBig = arr[arr.length-2];
//
//        sum = (((M / (K+1))) * (firstBig * K + secondBig))  + ((M % (K + 1)) * firstBig);
//
//        System.out.println(sum);
    }
}
