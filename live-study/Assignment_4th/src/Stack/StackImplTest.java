package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest
{
    @Test
    public void push() throws Exception
    {
        //given
        StackImpl stack = new StackImpl();

        //when
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //then
        for(int i = 0; i < 5; i++)
        {
            assertEquals(i+1, stack.arr[i]);
        }
    }

    @Test
    public void pop() throws Exception
    {
        //given
        StackImpl stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //when
        int pop = stack.pop();
        int pop2 = stack.pop();
        int pop3 = stack.pop();
        int pop4 = stack.pop();
        int pop5 = stack.pop();

        //then
        assertEquals(5, pop);
        assertEquals(4, pop2);
        assertEquals(3, pop3);
        assertEquals(2, pop4);
        assertEquals(1, pop5);
    }

}