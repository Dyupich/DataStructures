package com.Structures;

public class Stack
{

    private StackNode top;


    public Stack() {
        this.top = null;
    }

    public void add(int data)
    {
            StackNode temp = new StackNode(data);
            temp.next = top;
            top = temp;
    }

    public void remove()
    {
        top = top.next;
    }

    public void printStack()
    {
        if (top != null)
        {
            StackNode current = top;

            while (current != null)
            {
                System.out.println(current.data);
                current = current.next;
            }
        }
        else
        {
            System.out.println("Стэк пуст");
        }
    }

    private class StackNode {
        private int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
