import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main
{
    public static List<Integer> list = new ArrayList<>();
    public static int people, result;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        people = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < people; i++)
        {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        int count = 0;

        for (int i = 0; i < list.size(); i++)
        {
            count++;

            if (count >= list.get(i))
            {
                result++;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
