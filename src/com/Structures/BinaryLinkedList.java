package com.Structures;

public class BinaryLinkedList {

    private BinaryLinkedListNode head;
    private BinaryLinkedListNode tail;

    public BinaryLinkedList()
    {
        head = null;
        tail = head;
    }

    public void addElement(int data)
    {
        if (head == null)
        {
            BinaryLinkedListNode temp = new BinaryLinkedListNode(data);
            head = temp;
            tail = head;
        }
        else
        {
            BinaryLinkedListNode temp = new BinaryLinkedListNode(data);


            BinaryLinkedListNode current = tail;
            current.next = temp;
            tail = temp;
            tail.prev = current;

        }
    }

    public void removeHead()
    {
        head = head.next;
        head.prev = null;
    }

    public void removeTail()
    {
        tail = tail.prev;
        tail.next = null;
    }
    public void printForward()
    {
        BinaryLinkedListNode current = head;

        if(head != null) {


            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
        else
        {
            System.out.println("Двусвязный список пуст");
        }

    }

    public void printBackward()
    {
        BinaryLinkedListNode current = tail;

        while (current != null)
        {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    private class BinaryLinkedListNode
    {
        public int data;
        BinaryLinkedListNode next;
        BinaryLinkedListNode prev;

        public BinaryLinkedListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
