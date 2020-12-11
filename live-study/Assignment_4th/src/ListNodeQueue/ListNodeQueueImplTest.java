package ListNodeQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeQueueImplTest
{
    @Test
    public void push() throws Exception
    {
        //given
        ListNodeQueueImpl linkedNodeQueue = new ListNodeQueueImpl();

        //when
        linkedNodeQueue.push(1);
        linkedNodeQueue.push(2);
        linkedNodeQueue.push(3);

        //then
        assertEquals(3, linkedNodeQueue.pushedNode.getData());
    }

    @Test
    public void pop() throws Exception
    {
        //given
        ListNodeQueueImpl linkedNodeQueue = new ListNodeQueueImpl();

        linkedNodeQueue.push(1);
        linkedNodeQueue.push(2);
        linkedNodeQueue.push(3);

        //when
        int pop = linkedNodeQueue.pop();
        int pop2 = linkedNodeQueue.pop();
        int pop3 = linkedNodeQueue.pop();


        //then
        assertEquals(1, pop);
        assertEquals(2, pop2);
        assertEquals(3, pop3);
    }

}