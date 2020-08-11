import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numList = new LinkedList<>();

        int tc = Integer.parseInt(br.readLine());
        int index = 0;

        for (int i = 0; i < tc; i++)
        {
            numList.add(i + 1);
        }

        while (numList.size() != 1)
        {
            numList.remove(index);
            numList.add(numList.size(), numList.get(index));
            numList.remove(index);
        }

        System.out.print(numList.get(index));
    }
}
