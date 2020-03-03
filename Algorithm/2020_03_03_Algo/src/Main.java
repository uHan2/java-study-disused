import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        String[] wordArr = new String[tc];
        char[] letterArr;
        int answerCount = 0;
        boolean flag = true;



        for(int i = 0; i < wordArr.length ; i++)
        {
            wordArr[i] = br.readLine();
            letterArr = wordArr[i].toCharArray();
            for(int k = 0 ; k < letterArr.length ; k++)
            {
                for(int j = k + 1 ; j < letterArr.length ; j++)
                {
                    if(letterArr[k] == letterArr[j] && letterArr[k] != letterArr[j-1])
                    {
                        flag = false;
                    }
                }

            }

            if(flag == true)
            {
                answerCount++;
            }

            flag = true;

        }


        System.out.print(answerCount);
    }
}