import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++)
        {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;

        while (pq.size() != 1)
        {
            int fir = pq.poll();
            int sec = pq.poll();

            result += fir + sec;
            pq.offer(fir + sec);
        }

        System.out.println(result);
    }
}
