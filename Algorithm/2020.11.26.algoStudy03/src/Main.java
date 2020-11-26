import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[N];
        Integer[] arr2 = new Integer[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < K; i++)
        {
            if (arr1[i] < arr2[i])
            {
                arr1[i] = arr2[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            sum += arr1[i];
        }

        System.out.println(sum);
    }
}
