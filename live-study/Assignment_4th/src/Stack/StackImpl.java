package Stack;

public class StackImpl implements Stack
{
    public int[] arr = new int[5]; // 예시로 길이가 5인 배열 생성
    public int pos = 0;

    @Override
    public void push(int data)
    {
        arr[pos++] = data;
    }

    @Override
    public int pop()
    {
        if (pos == -1)
        {
            return -1;
        }
        return arr[--pos];
    }
}
