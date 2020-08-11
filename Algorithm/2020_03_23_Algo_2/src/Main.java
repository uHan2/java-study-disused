import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];

        StringTokenizer str = new StringTokenizer(br.readLine());

        for(int i = 0; i < nArr.length; i++)
        {
            nArr[i] = Integer.parseInt(str.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] mArr = new int[m];

        StringTokenizer str2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < mArr.length; i++)
        {
            mArr[i] = Integer.parseInt(str2.nextToken());
        }




        for(int i = 0; i < mArr.length; i++)
        {
            boolean flag = false;

            for(int j = 0; j < nArr.length; j++)
            {
                if(mArr[i] == nArr[j])
                {
                    flag = true;
                    break;
                }
            }

            if(flag == true)
            {
                bw.write("1");
                bw.newLine();
            }
            else
            {
                bw.write("0");
                bw.newLine();
            }
        }

        bw.flush();

    }
}