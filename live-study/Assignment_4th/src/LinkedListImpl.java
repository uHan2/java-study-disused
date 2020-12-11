public class LinkedListImpl implements LinkedList
{
    @Override
    public ListNode add(ListNode head, ListNode nodeToAdd, int position)
    {
        ListNode node = head;
        ListNode preNode = head;

        for (int i = 0; i < position - 1; i++)
        {
            preNode = node;
            node = node.next; // head를 마지막 노드까지 이동
        }

        nodeToAdd.next = node; //3
        preNode.next = nodeToAdd;

        return nodeToAdd;
    }

    @Override
    public ListNode remove(ListNode head, int positionToRemove)
    {
        ListNode node = head;
        ListNode preNode = head;

        for (int i = 0; i < positionToRemove - 1; i++)
        {
            preNode = node;
            node = node.next; // head를 삭제할 위치의 노드까지 이동
        }

        preNode.next = node.next;

        return head;
    }

    @Override
    public boolean contains(ListNode head, ListNode nodeTocheck)
    {
        while (head.next != null) // 끝까지 조회 중에
        {
            if(head.next == nodeTocheck) // nodeTocheck 가 있다면 return true
            {
                return true;
            }
            head = head.next;
        }

        return false;
    }
}