package LinkedList;

public interface ListNode
{
    ListNodeImpl add(ListNodeImpl head, ListNodeImpl nodeToAdd, int position);

    ListNodeImpl remove(ListNodeImpl head, int positionToRemove);

    boolean contains(ListNodeImpl head, ListNodeImpl nodeTocheck);
}
