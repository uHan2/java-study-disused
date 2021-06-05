class Solution2
{
    public int solution(String s)
    {
        int answer = 0;


        for (int i = 0; i < s.length(); i++)
        {
            if(check(s))
            {
                answer++;
            }

            char c = s.charAt(0);

            String substring = s.substring(1);

            substring += c;

            s = substring;
        }

        return answer;
    }

    private boolean check(String s)
    {
        int small = 0;
        int mid = 0;
        int large = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
            {
                return false;
            } else
            {
                if(s.charAt(i) == '(')
                {
                    small++;
                } else if(s.charAt(i) == ')')
                {
                    small--;
                }
                if(s.charAt(i) == '{')
                {
                    mid++;
                } else if(s.charAt(i) == '}')
                {
                    mid--;
                }
                if(s.charAt(i) == '[')
                {
                    large++;
                } else if(s.charAt(i) == ']')
                {
                    large--;
                }
            }
            if (small < 0 || mid < 0 || large < 0)
            {
                return false;
            }
        }

        if (small == 0 && mid == 0 && large == 0)
        {
            return true;
        }

        return false;
    }
}