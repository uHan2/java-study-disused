import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();


        for (int i = 0; i < tc; i++)
        {
            numList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numList);

        for (int i = 0; i < numList.size(); i++)
        {
            System.out.println(numList.get(i));
        }
    }
}