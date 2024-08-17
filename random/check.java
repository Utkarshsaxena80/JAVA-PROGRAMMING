class check{

    class Node{
        int data;
        Node next;
            Node prev;
          public Node(int d){
            data=d;
             next=null;
              prev=null;
        }
    }
    class doubleLink {
    Node head;
    Node tail;

    public doubleLink(){
        this.head=null;
        this.tail=null;
    }
   public void transverseForward(){
    Node current=head;
    while(head!=null){
        System.out.println(current.data+"");
        current=current.next;

    }

}
    public void transverseBackward(){
    Node current = tail;
    while(current!=null){
        System.out.println(current.data+"");
        current=current.prev;
    }
}

public  void insertBeg(){
    

}



    }




    }













