import java.util.*;

class Solution
{
    public long solution(int[] a, int[][] edges)
    {
//        int length = a.length;
//
//        for (int i = 0; i < a.length; i++)
//        {
//            if (a[i] == 0)
//            {
//                continue;
//            }
//
//            int[] map = new int[length];
//
//            for (int k = 0; k < edges.length; k++)
//            {
//                int v1 = a[edges[k][0]];
//
//                if(v1 == a[i])
//                {
//                    int v3 = edges[k][1];
//                    map[v3] = 1;
//                }
//
//                int v2 = a[edges[k][1]];
//                if(v2 == a[i])
//                {
//                    int v3 = edges[k][0];
//                    map[v3] = 1;
//                }
//            }
//
////            System.out.println(Arrays.toString(map));
//
//            int num = a[i];
//            long ret = 0;
//
//            for (int j = 0; j < map.length; j++)
//            {
//                if(map[j] == 0)
//                {
//                    continue;
//                }
//
//                if (map[j] == 1)
//                {
//                    num += a[j];
//                    ret += Math.abs(a[j]);
//                }
//
//                if (num == 0)
//                {
//                    return ret;
//                }
//            }
//        }
//
//        return -1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++)
        {
            if(a[i] != 0) list.add(Math.abs(a[i]));
        }

        boolean flag = false;

        for (int i = 0; i < a.length; i++)
        {
            if(a[i] != 0)
            {
                flag = true;
                break;
            }
        }

        if(flag)
        {
            int num = 0;
            int total = 0;
            for (int i = 0; i < a.length; i++)
            {
                num += a[i];
                total += Math.abs(a[i]);
            }

            if (num == 0)
            {
                int x = Collections.min(list);
                return total - x;
            } else
            {
                return -1;
            }
        } else
        {
            return -1;
        }
    }
}