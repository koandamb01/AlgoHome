package singly.linked.list;

public class SLL {
    Node head;

    public SLL(){
        this.head = null;
    }

    // Insert a new node
    public SLL insert(int val){
        Node newNode = new Node(val);
        if(this.head == null){
            this.head = newNode;
            return this;
        }

        Node runner = this.head;
        while(runner.next != null){
            runner = runner.next;
        }
        runner.next = newNode;

        return this;
    }


    // print the list
    public void pintSLL(){
        StringBuilder out = new StringBuilder();
        Node runner = this.head;

        while(runner != null){
            out.append( runner.val + "->");
            runner = runner.next;
        }
        out.append("null");
        System.out.println(out.toString());
    }

    // removed nth element of the sll from the beginning
    public SLL removeNthNode(int n){
        // Case 1: No Node in the SLL
        if(this.head == null){
            return this;
        }

        // Case 2: Only one Node in the SLL
        if(this.head.next == null && n == 1){
            this.head = null;
            return this;
        }

        // Case 3: n = 1
        if(n == 1){
            this.head = this.head.next;
            return this;
        }

        // all case
        int count = 1;
        Node rNode = null;
        Node runner = this.head;

        while(runner != null){

            if(count == n - 1){
                rNode = runner.next;
                runner.next = rNode.next;
                rNode.next = null;
            }

            runner = runner.next;
            count = count + 1;
        }

        return this;
    }

    // Remove the nth node from SLL start from the end
    public SLL removeNthNodeFromEnd(int n){
        // case 1: No Node in SLL
        if(this.head == null){
            return this;
        }

        // case 2: Only one Node in the SLL
        if(this.head.next == null && n == 1){
            this.head = null;
            return this;
        }


        // get the size of the SLL
        int size = 0;
        Node runner = this.head;
        while(runner != null){
            size ++;
            runner = runner.next;
        }

        // update n to forward now
        n = size - n;

        if(n == 0){
            this.head = this.head.next;
            return this;
        }
        // all case
        int count = 1;
        Node rNode = null;
        runner = this.head;

        System.out.println( "N:" + n );
        while(runner != null){
            if(count == n){
                rNode = runner.next;
                runner.next = rNode.next;
                rNode.next = null;
            }

            runner = runner.next;
            count = count + 1;
        }
        return this;
    }


}
