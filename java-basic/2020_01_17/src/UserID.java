public class UserID
{
    private String userid;

    public void setUserid(String userid) throws IDFormatException
    {
        if (userid == null)
        {
            throw new IDFormatException("ID cannot be null");
        } else if (userid.length() < 8 || userid.length() > 20)
        {
            throw new IDFormatException("ID Length should me between 8 ~ 20");
        }

        this.userid = userid;
    }
}
