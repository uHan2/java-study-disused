import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        boolean flag1;
        boolean flag2;

        for(int i = 0; i < tc; i++)
        {

            int num = Integer.parseInt(br.readLine());

            int standard1 = num / 2;
            int standard2 = num / 2;

            while(true)
            {
                flag1 = true;
                flag2 = true;

                for(int j = 2; j <= (int)Math.sqrt(standard1); j++)
                {
                    if(standard1 % j == 0)
                    {
                        flag1 = false;
                        break;
                    }

                }
                for(int k = 2; k <= (int)Math.sqrt(standard2); k++)
                {
                    if(standard2 % k == 0)
                    {
                        flag2 = false;
                        break;
                    }

                }

                if(!flag1 || !flag2)
                {
                    standard1--;
                    standard2++;
                }
                else if(flag1 && flag2)
                {
                    bw.write(standard1 + " " + standard2 + "\n");
                    break;
                }


            }
        }

        bw.flush();
    }
}