class Solution
{
    public String solution(int n)
    {
        StringBuilder answer = new StringBuilder();

        int[] arr = {4, 1, 2};

        while (n > 0)
        {
            answer.insert(0, arr[n % 3]);
            n = (n - 1) / 3;
        }

        return answer.toString();
    }
}