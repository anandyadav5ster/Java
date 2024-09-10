// currying is a advance technique to transfrom one function of n arguments to n function with one or fewer arguments
// Currying is a transformation of functions that translates a function from callable as f(a, b, c) into callable as f(a)(b)(c).
function add(a)
{
    return function(b)
    {
        return a+b;
    }
}
let res = add(2)(5);
console.log(res);