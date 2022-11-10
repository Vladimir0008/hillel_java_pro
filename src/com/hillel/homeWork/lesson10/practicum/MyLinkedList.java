package com.hillel.homeWork.lesson10.practicum;

public class MyLinkedList implements List {

    private MyNode firstNode;
    private MyNode lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new MyNode(null, firstNode, null);
        firstNode = new MyNode(null, null, lastNode);
        lastNode.setPrev(firstNode);
    }

    private MyNode getNextElement(MyNode current) {
        return current.getNext();
    }

    public void addLast(Object e) {
        MyNode prev = lastNode;
        prev.setItem(e);
        lastNode = new MyNode(null, prev, null);
        prev.setNext(lastNode);
        size++;
    }

    public void addFirst(Object e) {
        MyNode next = firstNode;
        next.setItem(e);
        firstNode = new MyNode(null, null, next);
        next.setPrev(firstNode);
        size++;
    }

    @Override
    public boolean add(Object e) {
        addLast(e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        MyNode target = firstNode.getNext();
        for (int i = 0; i < size; i++) {
            if (target.getItem().equals(o)) {
                target.getPrev().setNext(target.next);
                target.getNext().setPrev(target.prev);
                size--;
                return true;
            }
            target = getNextElement(target);
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result =  new Object[size];
        for (int i = 0; i < size; i++) {
            System.out.println(result[i] = get(i));
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = size -1 ; i >= 0 ; i--) {
            remove(get(i));
        }
    }

    @Override
    public Object get(int index) {
        MyNode target = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getItem();
    }

    public MyNode getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(MyNode firstNode) {
        this.firstNode = firstNode;
    }

    public MyNode getLastNode() {
        return lastNode;
    }

    public void setLastNode(MyNode lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private class MyNode {
        private Object item;
        private MyNode next;
        private MyNode prev;

        private MyNode(Object element, MyNode prev, MyNode next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public MyNode getPrev() {
            return prev;
        }

        public void setPrev(MyNode prev) {
            this.prev = prev;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }
    }
}

