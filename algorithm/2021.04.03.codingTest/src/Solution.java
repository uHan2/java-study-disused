class Solution
{
    public int[] solution(int[] lottos, int[] win_nums)
    {
        int[] answer = new int[2];

        int count = 0;
        int zeroCount = 0;

        for (int i = 0; i < lottos.length; i++)
        {
            for (int j = 0; j < win_nums.length; j++)
            {
                if (lottos[i] == win_nums[j])
                {
                    count++;
                }
            }
        }

        for (int i = 0; i < lottos.length; i++)
        {
            if (lottos[i] == 0)
            {
                zeroCount++;
            }
        }

        System.out.println("count = " + count);
        System.out.println("zeroCount = " + zeroCount);

        //최저순위
        low(answer, count);

        if (zeroCount == 6)
        {
            answer[0] = 1;
        } else
        {
            switch (zeroCount)
            {
                case 0:
                    answer[0] = answer[1];
                case 1:
                    if (count == 0)
                    {
                        answer[0] = 6;
                        break;
                    } else
                    {
                        answer[0] = answer[1] - 1;
                        break;
                    }
                case 2:
                    if (count == 0)
                    {
                        answer[0] = 5;
                        break;
                    } else
                    {
                        answer[0] = answer[1] - 2;
                        break;
                    }
                case 3:
                    if (count == 0)
                    {
                        answer[0] = 4;
                        break;
                    } else
                    {
                        answer[0] = answer[1] - 3;
                        break;
                    }
                case 4:
                    if (count == 0)
                    {
                        answer[0] = 3;
                        break;
                    } else
                    {
                        answer[0] = answer[1] - 4;
                        break;
                    }
                case 5:
                    if (count == 0)
                    {
                        answer[0] = 2;
                        break;
                    } else
                    {
                        answer[0] = answer[1] - 5;
                        break;
                    }
            }
        }


        return answer;
    }

    private void low(int[] answer, int count)
    {
        if (count == 6)
        {
            answer[0] = 1;
            answer[1] = 1;
        } else if (count == 0)
        {
            answer[1] = 6;
        } else
        {
            switch (count)
            {
                case 1:
                    answer[1] = 6;
                    break;

                case 2:
                    answer[1] = 5;
                    break;

                case 3:
                    answer[1] = 4;
                    break;

                case 4:
                    answer[1] = 3;
                    break;

                case 5:
                    answer[1] = 2;
                    break;
            }
        }
    }
}