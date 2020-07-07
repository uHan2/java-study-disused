import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String num = "-1";
        while (Integer.parseInt(num) != 0)
        {
            num = br.readLine();
            if(Integer.parseInt(num) == 0)
            {
                break;
            }

            int[] temp = new int[num.length()];
            for (int i = 0; i < temp.length; i++)
            {
                temp[i] = num.charAt(i);
            }

            boolean flag = true;

            int tempIndex = temp.length;
            for (int i = 0; i < temp.length / 2; i++)
            {
                if (temp[i] != temp[tempIndex - 1])
                {
                    flag = false;
                    break;
                } else
                {
                    tempIndex--;
                }
            }
            if (flag)
            {
                bw.write("yes\n");
            } else
            {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
