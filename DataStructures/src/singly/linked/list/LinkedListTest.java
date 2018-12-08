package singly.linked.list;

public class LinkedListTest {

    public static void main(String[] args){
        SLL sll = new SLL();
        sll.insert( 1 ).insert( 2 ).insert( 3).insert( 4 ).insert( 5 ).pintSLL();
//        sll.insert(1).insert( 2 ).pintSLL();
        sll.removeNthNodeFromEnd( 4 ).pintSLL();
    }
}
