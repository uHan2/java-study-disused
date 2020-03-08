import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count;

        boolean flag;

        ArrayList<Integer> primeNum;

        while(true)
        {
            int num = Integer.parseInt(br.readLine());

            primeNum = new ArrayList<>();

            flag = true;

            if(num == 0)
            {
                break;
            }
            else
            {
                for(int i = num + 1 ; i <= 2 * num ; i++)
                {
                    flag = true;

                    for(int j = 2 ; j <= (int)Math.sqrt(i) ; j++)
                    {
                        if(i == 2)
                        {
                            continue;
                        }
                        else if(i % j == 0)
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
            }
            bw.write(primeNum.size() + "\n");
        }
        bw.flush();
    }
}