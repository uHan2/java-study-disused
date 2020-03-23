import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int bigNum = 0;
        int smallNum = 0;
        int count = 1;
        int count2 = 1;

        List<Integer> yak = new ArrayList<>();

        if(n <= m)
        {
            bigNum = m;
            smallNum = n;
        }
        else if(n >= m)
        {
            bigNum = n;
            smallNum = m;
        }


        for(int i = 1; i <= bigNum ; i++)
        {
            if(bigNum % i == 0)
            {
                yak.add(i);
            }
        }

        for(int i = yak.size() - 1; i >= 0 ; i--)
        {
            if(smallNum % yak.get(i) == 0)
            {
                bw.write(yak.get(i) + "");
                break;
            }
        }

        bw.newLine();

        int add = bigNum;

        while(true)
        {
            if(bigNum % n == 0 && bigNum % m ==0)
            {
                bw.write(bigNum + "");
                break;
            }
            else
            {
                bigNum += add;
                count++;
            }

        }

        bw.flush();


    }
}