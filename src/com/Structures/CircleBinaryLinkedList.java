package com.Structures;

public class CircleBinaryLinkedList {

    private CircleBinaryLinkedListNode head;
    private CircleBinaryLinkedListNode tail;

    public void add(int data)
    {
        if (head == null)
        {
            head = new CircleBinaryLinkedListNode(data);
            tail = head;

            head.next = head;
            tail.prev = head;

        }
        else
        {
            CircleBinaryLinkedListNode temp = new CircleBinaryLinkedListNode(data);
            CircleBinaryLinkedListNode current = tail;

            current.next = temp;
            tail = temp;
            tail.prev = current;
            tail.next = head;
            head.prev = tail;
        }
    }

    public void printForward()
    {


        if (head != null) {
            CircleBinaryLinkedListNode current = head;
            do {
                System.out.println(current.data);
                current = current.next;
            } while (current != head);
        }
        else {
            System.out.println("Циклический двусвязный список пуст");
        }
    }

    public void printBackward()
    {
        if (tail != null)
        {
            CircleBinaryLinkedListNode current = tail;
            do {
                System.out.println(current.data);
                current = current.prev;
            } while (current != tail);
        }
        else
        {
            System.out.println("Циклический двусвязный список пуст");
        }
    }

    private static class CircleBinaryLinkedListNode {
        public int data;
        public CircleBinaryLinkedListNode next;
        public CircleBinaryLinkedListNode prev;

        public CircleBinaryLinkedListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
}
