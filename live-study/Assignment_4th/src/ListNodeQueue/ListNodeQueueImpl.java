package ListNodeQueue;

import LinkedList.ListNodeImpl;
import Stack.Stack;

public class ListNodeQueueImpl implements Stack
{
    ListNodeImpl headNode;
    ListNodeImpl tailNode;
    ListNodeImpl pushedNode;
    ListNodeImpl poppedNode;

    @Override
    public void push(int data)
    {
        if(headNode == null)
        {
            headNode = new ListNodeImpl(data);
            tailNode = new ListNodeImpl(data);
        }else
        {
            ListNodeImpl tmpNode = tailNode;
            pushedNode = new ListNodeImpl(data);
            tailNode = pushedNode;
            pushedNode.next = tmpNode;
        }
    }


    @Override
    public int pop()
    {
        poppedNode = headNode;

        headNode = poppedNode.next;
        return poppedNode.getData();
    }
}
