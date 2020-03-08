import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(str.nextToken());
        int end = Integer.parseInt(str.nextToken());

        boolean flag;

        ArrayList<Integer> primeNum = new ArrayList<>();

        for(int i = start ; i <= end ;i++)
        {
            flag = true;

            if(i == 1)
            {
                flag = false;
            }

            for(int j = 2 ; j <= (int) Math.sqrt(i) ; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                primeNum.add(i);
            }
        }

        for(int i = 0; i < primeNum.size() ; i++)
        {
            bw.write(primeNum.get(i) + "\n");
        }

        bw.flush();
    }
}