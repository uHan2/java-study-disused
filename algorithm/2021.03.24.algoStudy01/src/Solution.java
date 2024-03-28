import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution
{
    public int solution(String skill, String[] skill_trees)
    {
        int answer = 0;

        char[] skillArr = skill.toCharArray();

        for (String skill_tree : skill_trees)
        {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < skillArr.length; i++)
            {
                char c = skillArr[i];
                int index = skill_tree.indexOf(c);

                if (index == -1) list.add(100);
                else list.add(index);
            }

            // System.out.println(Arrays.toString(list.toArray()));

            if (check(list))
            {
                answer++;
            }
        }

        return answer;
    }

    public boolean check(List<Integer> list)
    {
        List<Integer> tmp = new ArrayList<>(list);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++)
        {
            if (!list.get(i).equals(tmp.get(i)))
            {
                return false;
            }
        }

        return true;
    }
}