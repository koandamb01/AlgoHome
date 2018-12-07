// Javascript Prototype Base Inheritance
let car = function(model) {
  this.model = model;
};
// make a prototype function for all its children
car.prototype.getModel = function() {
  return this.model;
};

// What is the difference between a function declaration and function expression
// You can call a function declaration before its declare but You can't call a function expression before its declaration
// because function expression behave like a variable.
// function declaration Can't pass as an argument
function foo1() {
  console.log("function declaration");
}

let foo2 = function() {
  console.log("function declaration");
};
