class Solution
{
    public int solution(int n)
    {
        int answer = 1;

        int[] num = new int[n + 1];
        num[1] = 1;

        for (int i = 2; i < n + 1; i++)
        {
            num[i] = i;
            for (int j = 1; j * j <= i; j++)
            {
                num[i] = Math.min(num[i], num[i - j * j] + 1);
            }
        }

        answer = num[n];
        return answer;
    }
}