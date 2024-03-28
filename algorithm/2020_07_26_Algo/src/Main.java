import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int[] time;
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        if(N > K)
        {
            System.out.print(N-K);
        }
        else
        {
            bfs(N, K);
        }
    }

    public static void bfs(int N, int K)
    {
        time = new int[100001];
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(N);

        while (!queue.isEmpty())
        {
            N = queue.poll();


            if (N == K)
            {
                break;
            }
            if (N + 1 <= 100000 && time[N + 1] == 0)
            {
                queue.offer(N + 1);
                time[N + 1] = time[N] + 1;
            }
            if (N - 1 > 0 && time[N - 1] == 0)
            {
                queue.offer(N - 1);
                time[N - 1] = time[N] + 1;
            }
            if (N * 2 <= 100000 && time[N * 2] == 0)
            {
                queue.offer(N * 2);
                time[N * 2] = time[N] + 1;
            }

        }
        System.out.println(time[N]);
    }
}