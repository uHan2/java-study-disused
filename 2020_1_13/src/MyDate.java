public class MyDate
{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object object)
    {
        if (object instanceof MyDate)
        {
            MyDate mydate = (MyDate) object;

            if(mydate.day == this.day && mydate.month == this.month && mydate.year == this.year)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return this.year + this.month + this.day;
    }
}
