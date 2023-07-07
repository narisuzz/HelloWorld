package com.narisu.Set_;

public class HashSetStructure {
    public static void main(String[] args) {
        Node[] table = new Node[16];
        System.out.println("table=" + table);
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table=" + table);
    }
}

class Node {
    Object item; // 存放数据
    Node next; // 指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
