import java.io.*;


public class Main
{

    //32

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        int[] charArr = new int[26];

        int MAX = 0;
        int index = 0;


        for(int i = 0; i < word.length() ; i++)
        {
            int alphaNum = word.charAt(i);
            charArr[alphaNum - 65]++;
        }


        for(int i = 0; i < charArr.length ; i++)
        {
            if(MAX < charArr[i])
            {
                MAX = charArr[i];
                index = i + 65;
            }
            else if(MAX == charArr[i])
            {
                MAX = charArr[i];
                index = '?';
            }
        }

        System.out.print((char) index);

    }
}