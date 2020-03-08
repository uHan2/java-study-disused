import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> primeNum = new ArrayList<>();

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        boolean flag;

        int sum = 0;

        for(int i = start ; i <= end ; i++)
        {
            flag = true;

            if(i == 1)
            {
                flag = false;
            }

            for(int j = 2; j <= (int) Math.sqrt(i) ; j++)
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

        if(primeNum.size() == 0)
        {
            bw.write("-1");
        }

        else
        {
            for(int i = 0 ; i < primeNum.size() ; i++)
            {
                sum += primeNum.get(i);
            }

            bw.write(sum + "\n");
            bw.write(primeNum.get(0) + "");

        }



        bw.flush();

    }
}