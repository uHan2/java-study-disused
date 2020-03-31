import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        List<Integer> numList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            numList.add(i);
        }

        int index = m;

        for (int i = 0; i < n; i++)
        {
            sortedList.add(numList.get(index - 1));
            int tmpIndex = numList.indexOf(numList.get(index - 1));

            numList.remove(index - 1);

            int tmpSize = numList.size();

            index = m;

            index += tmpIndex;


            while (index > numList.size())
            {
                if (numList.size() == 0)
                {
                    break;
                } else
                {
                    index -= tmpSize;
                }
            }
        }

        bw.write("<");

        for (int i = 0; i < sortedList.size(); i++)
        {
            bw.write(sortedList.get(i) + "");

            if (i != sortedList.size() - 1)
            {
                bw.write(", ");
            }
        }

        bw.write(">");

        bw.flush();

    }
}