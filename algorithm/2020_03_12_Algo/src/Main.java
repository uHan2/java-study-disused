import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        int[] weight = new int[tc];
        int[] height = new int[tc];
        int[] rankArr = new int[tc];

        for(int i = 0 ; i < tc ; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(str.nextToken());
            height[i] = Integer.parseInt(str.nextToken());
        }

        for(int i = 0 ; i < tc ; i++)
        {
            rankArr[i] = 1;
            for(int j = 0 ; j < tc ; j ++)
            {
                if(weight[i] < weight[j] && height[i] < height[j])
                {

                    rankArr[i]++;
                }
            }
        }


        for(int i = 0 ; i < tc ; i++)
        {
            System.out.print(rankArr[i] + " ");
        }
    }
}