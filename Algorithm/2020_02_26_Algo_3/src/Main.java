import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        String[] strr = new String[testcase];

        for(int i = 0 ; i < strr.length ; i++)
        {
            strr[i] = br.readLine();
        }

        for(String str : strr)
        {

            int count = 0;
            int score = 0;

            for(int i = 0 ; i < str.length() ; i++)
            {

                if(str.substring(i , i + 1).equals("O"))
                {
                    ++count;
                    score += count;
                }

                else
                {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}