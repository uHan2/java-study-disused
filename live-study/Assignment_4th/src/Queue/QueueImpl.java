package Queue;

public class QueueImpl implements Queue
{
    public int[] arr = new int[5]; // 예시로 길이가 5인 배열 생성
    public int head, tail = 0;

    @Override
    public void push(int data)
    {
        arr[tail++] = data;
    }

    @Override
    public int pop()
    {
        return arr[head++];
    }
}
