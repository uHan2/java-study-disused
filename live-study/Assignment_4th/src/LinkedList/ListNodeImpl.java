package LinkedList;

public class ListNodeImpl implements ListNode
{
    private Integer data;
    public ListNodeImpl next;

    public ListNodeImpl()
    {
        this.data = null;
        this.next = null;
    }

    public ListNodeImpl(Integer data)
    {
        this.data = data;
        this.next = null;
    }

    public ListNodeImpl(Integer data, ListNodeImpl next)
    {
        this.data = data;
        this.next = next;
    }


    @Override
    public ListNodeImpl add(ListNodeImpl head, ListNodeImpl nodeToAdd, int position)
    {
        ListNodeImpl node = head;
        ListNodeImpl preNode = head;

        for (int i = 0; i < position - 1; i++)
        {
            preNode = node;
            node = node.next; // head를 마지막 노드까지 이동
        }

        nodeToAdd.next = node;
        preNode.next = nodeToAdd;

        return nodeToAdd;
    }

    @Override
    public ListNodeImpl remove(ListNodeImpl head, int positionToRemove)
    {
        ListNodeImpl node = head;
        ListNodeImpl preNode = head;

        for (int i = 0; i < positionToRemove - 1; i++)
        {
            preNode = node;
            node = node.next; // head를 삭제할 위치의 노드까지 이동
        }

        preNode.next = node.next;
        node.next = null;

        return head;
    }

    @Override
    public boolean contains(ListNodeImpl head, ListNodeImpl nodeTocheck)
    {
        ListNodeImpl node = head;

        while (node.next != null) // 끝까지 조회
        {
            if (node.next == nodeTocheck) // nodeTocheck 가 있다면 return true
            {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public ListNodeImpl getNode(ListNodeImpl head, int index)
    {
        ListNodeImpl node = head;

        while (node.next != null) // 끝까지 조회
        {
            node = node.next;
        }

        return node;
    }

    public Integer getData()
    {
        return data;
    }

    public ListNodeImpl getNext()
    {
        return next;
    }
}