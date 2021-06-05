//class Solution
//{
//    static int[][] map;
//    static int[][] clone;
//
//    public static void RotateCube(int r1, int r2, int c1, int c2)
//    {
//        int n = r2 - r1 + 1;
//        for (int i = r1; i < r2; i++)
//        {
//            for (int j = c1; j < c2; j++)
//            {
//                map[i][j] = clone[n - j - 1][i];
//            }
//        }
//    }
//
//    public int[] solution(int rows, int columns, int[][] queries)
//    {
//        int[] answer = {};
//        int num = 1;
//
//        map = new int[rows][columns];
//        clone = new int[rows][columns];
//
//        for (int i = 0; i < map.length; i++)
//        {
//            for (int j = 0; j < map[i].length; j++)
//            {
//                map[i][j] = num;
//                clone[i][j] = num;
//                num++;
//            }
//        }
//        //2 2 5 4
//
//        for (int i = 0; i < queries.length; i++)
//        {
//            RotateCube(queries[i][0]-1, queries[i][1]-1, queries[i][2]-1, queries[i][3]-1);
//        }
//
//        for (int i = 0; i < map.length; i++)
//        {
//            for (int j = 0; j < map[i].length; j++)
//            {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        return answer;
//    }
//}