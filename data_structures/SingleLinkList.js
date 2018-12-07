class SNode {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

class SLL {
  constructor() {
    this.head = null;
  }

  // insert Node to the list
  insert(val) {
    // create a new node
    let newNode = new SNode(val);

    // check if the list is empty
    if (this.head == null) {
      this.head = newNode;
    } else {
      let run = this.head;
      while (run.next != null) {
        run = run.next;
      }
      run.next = newNode;
    }
  }

  // find an element in a linked list and move that element to the end of the list
  findAndMoveToTheEnd(val) {
    if (this.head == null) return false;

    let run = null;
    let temp = null;
    if (this.head == val) {
      temp = this.head;
      this.head = temp.next;
      run = temp.next;
    } else {
      run = this.head;
    }

    while (run.next != null) {
      if (run.next.val == val) {
        temp = run.next;
        run.next = temp.next;
      }
      run = run.next;
    }
    run.next = temp;
    temp.next = null;
  }

  // print all node in the list
  printSLL() {
    let out = "Root->";
    let run = this.head;
    while (run != null) {
      out += `${run.val}->`;
      run = run.next;
    }
    console.log(out);
  }
}

const sll = new SLL();
sll.insert(11);
sll.insert(3);
sll.insert(15);
sll.insert(35);
sll.insert(6);
sll.printSLL();
sll.findAndMoveToTheEnd(11);
sll.printSLL();
