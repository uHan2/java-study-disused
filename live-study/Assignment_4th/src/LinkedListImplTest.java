import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListImplTest
{
    @Test
    public void add() throws Exception
    {
        //given
        LinkedListImpl linkedList = new LinkedListImpl();
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);

        //when
        linkedList.firstAdd(firstNode);
        linkedList.add(firstNode, secondNode, 2);
        linkedList.add(firstNode, thirdNode, 3); // 1 -> 2 -> 3

        //then
        assertEquals(3, linkedList.getNode(firstNode, 3).getData());
    }

    @Test
    public void remove () throws Exception
    {
        //given
        LinkedListImpl linkedList = new LinkedListImpl();
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        linkedList.firstAdd(firstNode);
        linkedList.add(firstNode, secondNode, 2);
        linkedList.add(firstNode, thirdNode, 3); // 1 -> 2 -> 3

        //when
        linkedList.remove(firstNode, 2); // 1 -> remove(2) -> 3

        //then
        assertEquals(3, linkedList.getNode(firstNode, 2).getData());

    }

    @Test
    public void contains () throws Exception
    {
        //given
        LinkedListImpl linkedList = new LinkedListImpl();
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        linkedList.firstAdd(firstNode);
        linkedList.add(firstNode, secondNode, 2);
        linkedList.add(firstNode, thirdNode, 3); // 1 -> 2 -> 3

        //when
        boolean flag = linkedList.contains(firstNode, thirdNode);

        //then
        assertEquals(true, flag);
    }
}