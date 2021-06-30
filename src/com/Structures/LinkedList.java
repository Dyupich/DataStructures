package com.Structures;

public class LinkedList {
    private LinkedListNode head;


    // constructor
    public LinkedList() {
        head = null;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void addElement(int data, String text){ //  take data about the structure as parameters
        LinkedListNode temp = new LinkedListNode(data, text);// create new object with parameters

        if (head == null) //if head = null make it equal temp
        {
            head = temp;
        }
        else
        {
            LinkedListNode current = head; //iterator creation

            while (current.next != null) // moving to the next element while next element is not null
            {
                current = current.next;
            }

            current.next = temp; // now we are at (n-1) element. So we need to make equal current.next with temp
        }
    }

    public void remove()
    {

        if (head.next != null) // if we have more than 1 element
        {


            LinkedListNode current = head;//iterator creation


//             We need to find an element
//             that is two values from
//             the end of the linked list in
//             order to remove the ".NEXT" link
//             from the penultimate element to
//             the next element, thereby breaking
//             the link between the last element of
//             the linked list. All data about the
//             last item will be cleaned up thanks to
//             the garbage collector

            while (current.next.next != null) { // going to the n-1 element
                current = current.next;
            }
            current.next = null; //destroy last element
        }
        else
        {
            head = null; // if have 1 element in list - destroy head
        }

    }

    public boolean contains(String text)
    {
        LinkedListNode current = head;

        while (current.next != null)
        {
            if (current.text.equals(text))
            {
                return true;
            }
        }
        return false;
    }
    public int size()
    {
        int counter = 1;

        LinkedListNode current = head;

        if (current == null)
        {
            return 0;
        }

        while (current.next != null)
        {
            current = current.next;
            counter++;
        }
        return counter;
    }

    public void print(){
        LinkedListNode temp = head;
        if (temp == null)
        {
            System.out.println("Односвязный список пуст");
        }
        else
            {
            while (temp != null) {
                System.out.println(temp.data + " " + temp.text);
                temp = temp.next;
            }
        }
    }

    private class LinkedListNode
    {
        public int data;
        public String text;
        LinkedListNode next;//Ссылка на следующий элемент

        public LinkedListNode(int data, String text) {
            this.data = data;
            this.text = text;
            this.next = null;
        }

    }
}




