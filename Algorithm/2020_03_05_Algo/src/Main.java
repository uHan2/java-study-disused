import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int tc = Integer.parseInt(br.readLine());
        int count = 0;

        while(count < tc)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int height = Integer.parseInt(str.nextToken());
            int weight = Integer.parseInt(str.nextToken());
            int passengerNum = Integer.parseInt(str.nextToken());

            int tmp = passengerNum;

            passengerNum %= height;
            tmp /= height;

            if(passengerNum == 0)
            {
                bw.write((height * 100) + (tmp) + "\n");
                count++;
            }
            else if(passengerNum < height)
            {
                bw.write((passengerNum * 100) + (tmp+1) + "\n");
                count++;
            }
        }

        bw.flush();
    }
}