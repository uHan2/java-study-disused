import java.util.*;

class Solution
{
    static class Node implements Comparable<Node>
    {

        private int x;
        private int y;
        private int stuff;

        public Node(int x, int y, int stuff)
        {
            this.x = x;
            this.y = y;
            this.stuff = stuff;
        }

        public int getX()
        {
            return this.x;
        }

        public int getY()
        {
            return this.y;
        }

        public int getStuff()
        {
            return this.stuff;
        }

        @Override
        public int compareTo(Node other)
        {
            if (this.x == other.x && this.y == other.y) return Integer.compare(this.stuff, other.stuff);
            if (this.x == other.x) return Integer.compare(this.y, other.y);
            return Integer.compare(this.x, other.x);
        }
    }

    public boolean check(ArrayList<ArrayList<Integer>> answer)
    {
        for (int i = 0; i < answer.size(); i++)
        {
            int x = answer.get(i).get(0);
            int y = answer.get(i).get(1);
            int stuff = answer.get(i).get(2);

            //기둥일 때
            if (stuff == 0)
            {
                boolean flag = false;

                if (y == 0) flag = true; // 바닥 위

                for (int j = 0; j < answer.size(); j++)
                {
                    // 설치 하려는 위치가 다른 보 좌 or 우 위일 경우
                    if (x - 1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2))
                        flag = true;
                    if (x == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2))
                        flag = true;

                    // 설치 하려는 위치가 다른 기둥 위일 경우
                    if (x == answer.get(j).get(0) && y - 1 == answer.get(j).get(1) && 0 == answer.get(j).get(2))
                        flag = true;

                }

//                return flag;
                if (!flag) return false;
            } else if (stuff == 1) // 보 를 설치할 때
            {
                boolean flag = false;
                boolean left = false;
                boolean right = false;

                for (int j = 0; j < answer.size(); j++)
                {
                    // 설치 하려는 보의 한쪽 끝이 기둥일 때
                    if (x == answer.get(j).get(0) && y - 1 == answer.get(j).get(1) && 0 == answer.get(j).get(2))
                        flag = true;
                    if (x + 1 == answer.get(j).get(0) && y - 1 == answer.get(j).get(1) && 0 == answer.get(j).get(2))
                        flag = true;

                    // 설치 하려는 왼쪽에 보가 있을 때
                    if (x - 1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2))
                        left = true;
                    // 설치 하려는 오른쪽에 보가 있을 때
                    if (x + 1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2))
                        right = true;
                }

                if (left && right) flag = true;

//                return flag;
                if (!flag) return false;
            }
        }

        return true;
    }

    public int[][] solution(int n, int[][] build_frame)
    {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < build_frame.length; i++)
        {
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int stuff = build_frame[i][2];
            int operate = build_frame[i][3];

            if (operate == 0) // 삭제
            {
                int index = 0;

                for (int j = 0; j < answer.size(); j++)
                {
                    if (x == answer.get(j).get(0) && y == answer.get(j).get(1) && stuff == answer.get(j).get(2))
                        index = j;
                }
                ArrayList<Integer> erase = answer.get(index);
                answer.remove(index);
                if (!check(answer)) answer.add(erase);
            } else if (operate == 1) // 설치
            {
                ArrayList<Integer> insert = new ArrayList<>();

                insert.add(x);
                insert.add(y);
                insert.add(stuff);

                answer.add(insert);

                if (!check(answer)) answer.remove(answer.size() - 1);
            }
        }

        ArrayList<Node> list = new ArrayList<>();

        for (int i = 0; i < answer.size(); i++)
        {
            list.add(new Node(answer.get(i).get(0), answer.get(i).get(1), answer.get(i).get(2)));
        }

        Collections.sort(list);

        int[][] result = new int[list.size()][3];

        for (int i = 0; i < list.size(); i++)
        {
            result[i][0] = list.get(i).getX();
            result[i][1] = list.get(i).getY();
            result[i][2] = list.get(i).getStuff();
        }

        return result;
    }
}