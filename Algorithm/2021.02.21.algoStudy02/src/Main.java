import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] homeArr = new int[n];
//        int[] dirArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            homeArr[i] = Integer.parseInt(st.nextToken());
        }

//        for (int i = 0; i < homeArr.length; i++)
//        {
//            int num = homeArr[i];
//            int tmp = 0;
//
//            for (int j = 0; j < homeArr.length; j++)
//            {
//                tmp += Math.abs(num - homeArr[j]);
//            }
//
//            dirArr[i] = tmp;
//        }
//
//        for (int i = 0; i < dirArr.length; i++)
//        {
//            System.out.println(dirArr[i]);
//        }

        Arrays.sort(homeArr);

        System.out.println(homeArr[(n - 1) / 2]);
    }
}

