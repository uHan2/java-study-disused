public class Solution
{
    public static int[][] rotate(int[][] a)
    {
        int n = a.length;
        int m = a[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                result[j][n - i - 1] = a[i][j];
            }
        }

        return result;
    }

    public static boolean check(int[][] newLock)
    {
        int length = newLock.length / 3;

        for (int i = length; i < length * 2; i++)
        {
            for (int j = length; j < length * 2; j++)
            {
                if (newLock[i][j] != 1) return false;
            }
        }

        return true;
    }

    public static boolean solution(int[][] key, int[][] lock)
    {
        int N = lock.length;
        int M = key.length;

        int[][] newLock = new int[3 * N][3 * N];

        for (int i = 0; i < lock.length; i++)
        {
            for (int j = 0; j < lock[i].length; j++)
            {
                newLock[i + N][j + N] = lock[i][j];
            }
        }

        for (int rotate = 0; rotate < 4; rotate++)
        {
            for (int row = 0; row < N * 2; row++)
            {
                for (int col = 0; col < N * 2; col++)
                {
                    for (int i = 0; i < M; i++)
                    {
                        for (int j = 0; j < M; j++)
                        {
                            newLock[row + i][col + j] += key[i][j];
                        }
                    }

                    if (check(newLock)) return true;
                    else
                    {
                        for (int i = 0; i < M; i++)
                        {
                            for (int j = 0; j < M; j++)
                            {
                                newLock[row + i][col + j] -= key[i][j];
                            }
                        }
                    }
                }
            }

            key = rotate(key);
        }

        return false;
    }

    public static void main(String[] args)
    {
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        System.out.println(solution(key, lock));
    }
}