class HashTable {
  constructor(storageLimit) {
    this.storageLimit = storageLimit;
    this.storage = [];
  }

  hash(str, maxSize) {
    var hash = 0;
    for (let i = 0; i < str.length; i++) {
      hash += str.charCodeAt(i);
    }
    return hash % maxSize;
  }

  insert(key, val) {
    let idx = this.hash(key, this.storageLimit);
    if (this.storage[idx] === undefined) {
      this.storage[idx] = [[key, val]];
    } else {
      var isInsert = false;
      for (let i = 0; i < this.storage[idx].length; i++) {
        if (this.storage[idx][i][0] === key) {
          this.storage[idx][i][1] = val;
          isInsert = true;
        }
      }

      if (isInsert === false) {
        this.storage[idx].push([key, val]);
      }
    }
  }

  print() {
    console.log(this.storage);
  }

  // remove
  remove(key) {
    const idx = this.hash(key, this.storageLimit);
    var isDelete = false;
    for (let i = 0; i < this.storage[idx].length; i++) {
      if (this.storage[idx][i][0] === key) {
        delete this.storage[idx][i];
        isDelete = true;
      }
    }
    if (isDelete === false) {
      console.log("No match Key");
    } else {
      console.log("Key value delete");
    }
  }

  // lookup
  lookup(key) {
    const idx = this.hash(key, this.storageLimit);
    if (this.storage[idx] === undefined) {
      return undefined;
    } else {
      for (let i = 0; i < this.storage[idx].length; i++) {
        if (this.storage[idx][i][0] === key) {
          return this.storage[idx][i][1];
        }
      }
    }
  }
}

const myhash = new HashTable(10);

myhash.insert("mo", 646204);
myhash.insert("med", 6116204);
myhash.insert("bass", 6404);
myhash.insert("m", 6111404);
myhash.print();
console.log(myhash.lookup("mo"));
