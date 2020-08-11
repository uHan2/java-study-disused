import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int minute = input.nextInt();

        int setHour;
        int setMinute;

        if(minute < 45)
        {
            setMinute = minute + 60 - 45;
            if(hour == 0)
            {
                setHour = hour + 24 - 1;
                System.out.println(setHour + " " + setMinute);
            }
            else
            {
                setHour = hour - 1;
                System.out.println(setHour + " " + setMinute);
            }


        }
        else
        {
            setMinute = minute - 45;
            setHour = hour;
            System.out.println(setHour + " " + setMinute);
        }


    }
}
