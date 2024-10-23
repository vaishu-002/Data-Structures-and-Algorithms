public class LinkedList {

    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;

        }
        Node(int data , Node next){
            this.data= data;
            this.next =next;
        }

    }

    Node head;
    Node tail;
    int size;

    public void insertAtFirst(int data){


        Node node = new Node(data);

        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }

        node.next= head;
        head= node;
        size++;
        

    }

    public void insertAtEnd(int data){

        Node node = new Node(data);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }
        tail.next=node;
        tail=node;
        size++;

    }

    public void insert(int data, int index){
        

        if(index==0){

            insertAtFirst(data);
            return;

        }
        if(index==size){
            insertAtEnd(data);
            return;
        }
        Node temp=head;
       for(int i=1;i<index;i++){
        temp=temp.next;
       }

       Node node = new Node(data,temp.next);
       temp.next=node;
       size++;

    }

    public void deleteAtFirst(){
        head=head.next;
        size--;
    }

    public void delete(int index ){
        if(index==0){
            deleteAtFirst();
            return;
        }

        Node temp=head;

        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;


        
    }


    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;



        }
        System.out.print("END "+"Size = "+size);
    }
    
    
}
