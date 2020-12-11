package ListNodeStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackImplTest
{
    @Test
    public void push() throws Exception
    {
        //given
        ListNodeStackImpl linkedNodeStack = new ListNodeStackImpl();

        //when
        linkedNodeStack.push(1);
        linkedNodeStack.push(2);
        linkedNodeStack.push(3);

        //then
        assertEquals(3, linkedNodeStack.pushedNode.getData());
        assertEquals(2, linkedNodeStack.pushedNode.getNext().getData());
    }

    @Test
    public void pop() throws Exception
    {
        //given
        ListNodeStackImpl linkedNodeStack = new ListNodeStackImpl();

        linkedNodeStack.push(1);
        linkedNodeStack.push(2);
        linkedNodeStack.push(3);

        //when
        int pop = linkedNodeStack.pop();
        int pop2 = linkedNodeStack.pop();
        int pop3 = linkedNodeStack.pop();
        //then
        assertEquals(3, pop);
        assertEquals(2, pop2);
        assertEquals(1, pop3);


    }

}