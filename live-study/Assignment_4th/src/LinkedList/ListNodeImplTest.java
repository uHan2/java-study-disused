package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeImplTest
{
    @Test
    public void add() throws Exception
    {
        //given
        ListNodeImpl linkedList = new ListNodeImpl();
        ListNodeImpl firstNode = new ListNodeImpl(1);
        ListNodeImpl secondNode = new ListNodeImpl(2);
        ListNodeImpl thirdNode = new ListNodeImpl(3);

        //when
        linkedList.add(firstNode, secondNode, 2);
        linkedList.add(firstNode, thirdNode, 3); // 1 -> 2 -> 3

        //then
        assertEquals(3, linkedList.getNode(firstNode, 3).getData());
    }

    @Test
    public void remove() throws Exception
    {
        //given
        ListNodeImpl linkedList = new ListNodeImpl();
        ListNodeImpl firstNode = new ListNodeImpl(1);
        ListNodeImpl secondNode = new ListNodeImpl(2);
        ListNodeImpl thirdNode = new ListNodeImpl(3);

        linkedList.add(firstNode, secondNode, 2);
        linkedList.add(firstNode, thirdNode, 3); // 1 -> 2 -> 3

        //when
        linkedList.remove(firstNode, 2); // 1 -> remove(2) -> 3

        //then
        assertEquals(3, linkedList.getNode(firstNode, 2).getData());

    }

    @Test
    public void contains() throws Exception
    {
        //given
        ListNodeImpl linkedList = new ListNodeImpl();
        ListNodeImpl firstNode = new ListNodeImpl(1);
        ListNodeImpl secondNode = new ListNodeImpl(2);
        ListNodeImpl thirdNode = new ListNodeImpl(3);

        linkedList.add(firstNode, secondNode, 2);
        linkedList.add(firstNode, thirdNode, 3); // 1 -> 2 -> 3

        //when
        boolean flag = linkedList.contains(firstNode, thirdNode);

        //then
        assertTrue(flag);
    }
}