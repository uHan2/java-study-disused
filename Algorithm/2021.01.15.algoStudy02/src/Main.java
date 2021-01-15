import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        /**
         * 1 + 2 + 3 으로 1,2,3 의 경우의 수를 전부 체크 가능한가?
         */

        int result = 1;

        for (int i = 0; i < N; i++)
        {
            if (result < list.get(i)) break;
            result += list.get(i);
        }

        System.out.println(result);
    }
}
