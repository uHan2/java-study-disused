import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] horiArr = new int[3];
        int[] verArr = new int[3];


        for(int i = 0; i < 3 ; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            horiArr[i] = Integer.parseInt(str.nextToken());
            verArr[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(horiArr);
        Arrays.sort(verArr);


        int hori = horiArr[0]  + horiArr[2] - horiArr[1];
        int ver = verArr[0]  + verArr[2] - verArr[1];

        System.out.print(hori + " " + ver);


    }
}