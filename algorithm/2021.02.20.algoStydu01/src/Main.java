
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Node
{
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public Node(String name, int korScore, int engScore, int mathScore)
    {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName()
    {
        return name;
    }

    public int getKorScore()
    {
        return korScore;
    }

    public int getEngScore()
    {
        return engScore;
    }

    public int getMathScore()
    {
        return mathScore;
    }
}

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Node> nodeList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korScore = Integer.parseInt(st.nextToken());
            int engScore = Integer.parseInt(st.nextToken());
            int mathScore = Integer.parseInt(st.nextToken());

            nodeList.add(new Node(name, korScore, engScore, mathScore));
        }

        Collections.sort(nodeList, new Comparator<Node>()
        {
            @Override
            public int compare(Node o1, Node o2)
            {
                if(o1.getKorScore() == o2.getKorScore() && o1.getEngScore() == o2.getEngScore() &&
                        o1.getMathScore() == o2.getMathScore())
                {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getKorScore() == o2.getKorScore() && o1.getEngScore() == o2.getEngScore())
                {
                    return Integer.compare(o2.getMathScore(), o1.getMathScore());
                }

                if (o1.getKorScore() == o2.getKorScore())
                {
                    return Integer.compare(o1.getEngScore(), o2.getEngScore());
                }

                return Integer.compare(o2.getKorScore(), o1.getKorScore());
            }
        });

        for (int i = 0; i < nodeList.size(); i++)
        {
            System.out.println(nodeList.get(i).getName());
        }
    }
}
