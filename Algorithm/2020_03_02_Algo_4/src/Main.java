import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        char[] charArr = word.toCharArray();
        int[] castArr = new int[charArr.length];

        for(int i = 0 ; i < charArr.length ; i++)
        {
            if(charArr[i] >= (char)'A' && charArr[i] <= (char)'C' )
            {
                castArr[i] = 2;
            }
            else if(charArr[i] >= (char)'D' && charArr[i] <= (char)'F' )
            {
                castArr[i] = 3;
            }
            else if(charArr[i] >= (char)'G' && charArr[i] <= (char)'I' )
            {
                castArr[i] = 4;
            }
            else if(charArr[i] >= (char)'J' && charArr[i] <= (char)'L' )
            {
                castArr[i] = 5;
            }
            else if(charArr[i] >= (char)'M' && charArr[i] <= (char)'O' )
            {
                castArr[i] = 6;
            }
            else if(charArr[i] >= (char)'P' && charArr[i] <= (char)'S' )
            {
                castArr[i] = 7;
            }
            else if(charArr[i] >= (char)'T' && charArr[i] <= (char)'V' )
            {
                castArr[i] = 8;
            }
            else if(charArr[i] >= (char)'W' && charArr[i] <= (char)'Z' )
            {
                castArr[i] = 9;
            }
        }

        int sum = 0;

        for(int i = 0 ; i < castArr.length ; i++)
        {
            sum += castArr[i] + 1;
        }

        System.out.print(sum);

    }
}