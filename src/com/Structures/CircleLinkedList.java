package com.Structures;

public class CircleLinkedList {
    private CircleLinkedListNode head;


    public CircleLinkedList() {
        this.head = null;
    }


    public boolean isEmpty()
    {
        return head == null;
    }

    public void add(int data)
    {
        if (head == null)
        {
            head = new CircleLinkedListNode(data);
            head.next = head;
        }
        else
        {
            CircleLinkedListNode current = head;
            CircleLinkedListNode temp = new CircleLinkedListNode(data);

            while (current.next != head)
            {
                current = current.next;
            }


            current.next = temp;
            temp.next = head;



        }
    }

    public void remove()
    {
        if (head.next != head)
        {
            CircleLinkedListNode current = head;

            while (current.next.next != head)
            {
                current = current.next;
            }

            current.next = head;
        }
        else
        {
            head = null;
        }
    }

    public void printCircleLinkedList()
    {
        CircleLinkedListNode current = head;

        if (current != null)
        {
            do
            {
                System.out.println(current.data);
                current = current.next;
            } while (current != head);
        }
        else
        {
            System.out.println("Односвязный циклический список пуст");
        }

    }

    private class CircleLinkedListNode {
        public int data;
        CircleLinkedListNode next;

        public CircleLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
