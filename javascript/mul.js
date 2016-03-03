 
/*Description:

Define a function mul(a, b) that takes two non-negative integers a and b and returns their product.

You should only use the + and/or - operators. Using * is cheating!

You can do this iteratively or recursively.*/


Solution:
   function mul(a, b) {
  var solution = 0;
  for (var i = 0;i < b; i++) {
    solution += a;
  }
  return solution;
}
