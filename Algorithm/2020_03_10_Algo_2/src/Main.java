import java.io.*;

public class Main
{
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        move(num, 1, 2, 3);


        System.out.println(count);
        System.out.print(sb);
    }
    public static void move(int num, int from, int by, int to)
    {

        count++;

        if(num == 1)
        {
            sb.append(from).append(" ").append(to).append("\n");
        }
        else
        {
            move(num - 1, from, to, by);
            sb.append(from).append(" ").append(to).append("\n");
            move(num-1, by, from, to);
        }


    }


}