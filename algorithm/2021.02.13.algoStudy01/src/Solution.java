class Solution
{
    public int returnIndex(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(') count++;
            else count--;

            if (count == 0) return i;
        }

        return -1;
    }

    public boolean check(String answer)
    {
        int count = 0;
        for (int i = 0; i < answer.length(); i++)
        {
            if (answer.charAt(i) == '(') count++;
            else
            {
                if(count == 0) return false;
                count--;
            }
        }

        return true;
    }


    public String solution(String p)
    {
        String answer = "";

        if (p.equals("")) return answer;

        int index = returnIndex(p);
        String U = p.substring(0, index + 1);
        String V = p.substring(index + 1);

        if (check(U))
        {
            answer = U + solution(V);
        }else
        {
            answer += "(";
            answer += solution(V);
            answer += ")";

            U = U.substring(1, U.length() - 1);

            String temp = "";
            for (int i = 0; i < U.length(); i++)
            {
                if(U.charAt(i) == '(') temp += ")";
                else temp += "(";
            }

            answer += temp;
        }

        return answer;
    }

//    public static void main(String[] args)
//    {
//        Solution solution = new Solution();
//
//        System.out.println("solution= " + solution.solution("(()())()"));
//    }
}