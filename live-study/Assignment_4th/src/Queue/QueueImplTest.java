package Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueImplTest
{
    @Test
    public void push() throws Exception
    {
        //given
        QueueImpl queue = new QueueImpl();

        //when
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        //then
        for(int i = 0; i < 5; i++)
        {
            assertEquals(i+1, queue.arr[i]);
        }
    }

    @Test
    public void pop() throws Exception
    {
        //given
        QueueImpl queue = new QueueImpl();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        //when
        int pop = queue.pop();
        int pop2 = queue.pop();
        int pop3 = queue.pop();
        int pop4 = queue.pop();
        int pop5 = queue.pop();

        //then
        assertEquals(1, pop);
        assertEquals(2, pop2);
        assertEquals(3, pop3);
        assertEquals(4, pop4);
        assertEquals(5, pop5);
    }

}