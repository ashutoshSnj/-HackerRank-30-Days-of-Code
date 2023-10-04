 public static  Node insert(Node head,int data) {
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node start = head;
        while(start.next != null){
            start = start.next;
        }
        start.next = new Node(data);
        return head;
    }
  