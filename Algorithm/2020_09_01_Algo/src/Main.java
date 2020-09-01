import java.util.*;
import java.io.*;

public class Main
{
    static int[][] map;
    static int N;
    static int[] teamStart;
    static int[] teamLink;
    static boolean[] visit;
    static int tmp = 0;
    static int teamStartSum;
    static int teamLinkSum;

    static List<Integer> result;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        teamStart = new int[N / 2];
        teamLink = new int[N / 2];
        visit = new boolean[N];
        result = new ArrayList<>();

        for (int i = 0; i < map.length; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        teamMatching(0, 0);

        Collections.sort(result);

        System.out.print(result.get(0));
    }

    public static void teamMatching(int idx, int cnt)
    {
        if (cnt == N / 2)
        {
            teamStartSum = 0;
            teamLinkSum = 0;
            tmp = 0;
            for (int i = 0; i < N; i++)
            {
                if (visit[i] == false)
                {
                    teamLink[tmp] = i;
                    tmp++;
                }
            }


            for (int i = 0; i < N / 2; i++)
            {
                for (int j = i + 1; j < cnt; j++)
                {
                    teamStartSum += map[teamStart[i]][teamStart[j]] + map[teamStart[j]][teamStart[i]];
                    teamLinkSum += map[teamLink[i]][teamLink[j]] + map[teamLink[j]][teamLink[i]];
                }
            }

            if (teamStartSum - teamLinkSum >= 0)
            {
                result.add(teamStartSum - teamLinkSum);
            }

            return;
        }

        for (int i = idx; i < N; i++)
        {
            if (visit[i] == false)
            {
                visit[i] = true;
                teamStart[cnt] = i;
                teamMatching(i, cnt + 1);
                visit[i] = false;
            }
        }
    }

}