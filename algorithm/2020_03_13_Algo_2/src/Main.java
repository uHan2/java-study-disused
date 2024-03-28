import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int start = 666;

        ArrayList<Integer> devilNum = new ArrayList<>();

        while(true)
        {
            int count = 0;
            int tmp = start;
            String convertedStart = Integer.toString(start);
            int conditionCount = 0;

            while(tmp != 0)
            {
                tmp /= 10;
                count++;
            }

            char[] numArr = new char[count];

            for(int i = 0; i < numArr.length ; i++)
            {
                numArr[i] = convertedStart.charAt(i);
            }

            for(int i = 0; i < numArr.length - 2 ; i++)
            {
                if(numArr[i] == '6' && numArr[i+1] == '6' && numArr[i+2] == '6')
                {
                    conditionCount++;
                }
            }

            if(conditionCount != 0)
            {
                devilNum.add(start);
            }

            start++;

            if(devilNum.size() == num)
            {
                System.out.println(devilNum.get(num-1));
                break;
            }
        }
    }
}