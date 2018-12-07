class Queue {
  constructor() {
    this.data = [];
  }

  enQueue(val) {
    this.data.unshift(val);
  }

  deQueue() {
    return this.data.pop();
  }

  printQueue() {
    console.log(this.data);
  }
}

const q = new Queue();
q.enQueue(11);
q.enQueue(2);
q.enQueue(10);
q.enQueue(5);
q.printQueue();
q.deQueue();
q.printQueue();
