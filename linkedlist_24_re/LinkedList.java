package linkedlist_24_re;

public class LinkedList
{
    private Node head;




    // method to append the last element in the Linked List
    public  void appendLast(int x)
    {
        Node p = new Node(x);
        if(head == null) {
            head = p;
            return;
        }

        Node temp = head;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        temp.setNext(p);
    }





    // method to print elements
    public void printElements()
    {
        int count=0;
        Node temp = head;
        while(temp.getNext() != null)
        {
            count++;
            System.out.print(temp.getData()+" --> ");
            temp = temp.getNext();
        }
        System.out.print("\nTotal size is : "+count+"\n");
    }






    // method to prepend the elements in the given LinkedList
    public void prependElement(int x)
    {
        Node p = new Node(x);
        if(head ==  null)
        {
            head = p;
            return;
        }
        p.setNext(head);
        head = p;
    }



    // method to reverse the Linked list
    public Node reverseElements()
    {
        Node prev = null , curr = head , next = null;

        while(curr != null)
        {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        printReverseElements(prev);
       return prev;
    }





    // Method to print the reverse LinkedList
    public void printReverseElements(Node temp)
    {
        while (temp != null)
        {
            System.out.print(temp.getData()+" --> ");
            temp=temp.getNext();
        }
    }




    // method to find the middle node of the  linked list
    public Node middleNode()
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.getNext() != null)
        {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }




    // method to check hasCycle in a given linked list
    public boolean hasCycle()
    {
        if(head == null)
            return false;

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.getNext() != null)
        {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            // check if both pointers meet then cycle other not cycle
            if(slow == fast)
                return true;
        }
        return false;
    }

    // method to remove duplicate from the linked list
    public Node removeDuplicate()
    {
        if(head ==  null )
            return head;
        Node curr = head;
        while(curr != null && curr.getNext() != null)
        {
            // If the current node's value is the same as the next node's value
            if(curr.getData() == curr.getNext().getData())
            {
                curr = curr.getNext().getNext();
            }
            else {
                curr = curr.getNext();
            }
        }
        return curr;
    }





}
