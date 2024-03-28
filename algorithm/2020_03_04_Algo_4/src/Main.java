import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int dayUp = Integer.parseInt(str.nextToken());
        int nightDown = Integer.parseInt(str.nextToken());
        int height = Integer.parseInt(str.nextToken());

        int count = 1;

        height -= dayUp;

        if( height - (height / ((dayUp - nightDown)) * (dayUp - nightDown)) <= 0)
        {
            count += (height / ((dayUp - nightDown)));
        }
        else
        {
            count += (height / ((dayUp - nightDown))) + 1;
        }

        System.out.print(count);

    }
}