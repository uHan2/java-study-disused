import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());
        int[] lineArr = new int[k];
        LinkedList<Integer> ansList = new LinkedList<Integer>();

        for(int i = 0; i < k; i++)
        {
            lineArr[i] = Integer.parseInt(br.readLine());
        }

        int tmp = 0;
        int sum = 0;

        for(int i = 0; i < k; i++)
        {
            sum += lineArr[i];
        }

        int tmpLen = sum / n;

        if(tmpLen > lineArr[0])
        {
            tmpLen = lineArr[0];
        }

        while(tmpLen != 0)
        {
            for(int j = 0; j < k; j++)
            {
                tmp += lineArr[j] / tmpLen;
            }

            if(tmp >= n)
            {
                ansList.add(tmpLen);
            }
            else
            {
                tmp = 0;
            }

            tmpLen--;
        }

        System.out.print(ansList.get(0));
    }
}