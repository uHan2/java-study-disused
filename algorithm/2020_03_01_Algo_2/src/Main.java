import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        int count = 0;
        String[] word = new String[tc];
        int[] repeatCount = new int[tc];

        while(count < tc)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());

            repeatCount[count] = Integer.parseInt(str.nextToken());

            word[count] = str.nextToken();

            count++;
        }


        for(int i = 0 ; i < tc ; i++)
        {
            for(int j = 0 ; j < word[i].length() ; j++)
            {
                for(int k = 0 ; k < repeatCount[i] ; k++)
                {
                    System.out.print(word[i].charAt(j));

                }
            }
            System.out.println();

        }

    }
}