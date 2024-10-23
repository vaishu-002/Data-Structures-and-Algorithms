class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(0);
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtEnd(-1);
        list.insertAtEnd(-2);
        list.insertAtEnd(-3);
        list.insert(4,3);
        list.insert(4,0);
        list.insert(4,9);
        list.insert(4,2);
        list.delete(5);
        list.deleteAtFirst();
        list.delete(1);
        list.delete(7);
        list.display();
    }
}