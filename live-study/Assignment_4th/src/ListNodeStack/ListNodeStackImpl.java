package ListNodeStack;

import LinkedList.ListNodeImpl;
import Stack.Stack;

public class ListNodeStackImpl implements Stack
{
    ListNodeImpl posNode;
    ListNodeImpl pushedNode;
    ListNodeImpl poppedNode;

    @Override
    public void push(int data)
    {
        if(posNode == null)
        {
            posNode = new ListNodeImpl(data);
        }else
        {
            ListNodeImpl tmpNode = posNode;
            pushedNode = new ListNodeImpl(data);
            posNode = pushedNode;
            pushedNode.next = tmpNode;
        }
    }

    @Override
    public int pop()
    {
        poppedNode = pushedNode;
        pushedNode = pushedNode.next;

        return poppedNode.getData();
    }
}
