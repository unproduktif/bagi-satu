public class Singly{
    Node head;
    public class Node{
        String nama;
        Node next;
        public Node(String nama){
            this.nama=nama;
            this.next=null;
        }
    }
    public void add(String nama){
        Node newNode=new Node(nama);
        if(head==null){
            head=newNode;
            return;
        }
        Node curreent=head;
        while(curreent.next!=null)
    }
}