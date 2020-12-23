public class Queue {
    public Node head;
    public Node tail;
    public Queue(){};
    public void enqueue(int key){
        Node temp=new Node(key);
        if (head==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    public Node dequeue(){
        if (head==null)return null;
        Node temp=head;
            head=head.next;
            if (head==null){
                tail=null;
            }
            return temp;
    }

}
class Node{
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
    }
}
