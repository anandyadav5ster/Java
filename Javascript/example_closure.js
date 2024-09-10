// A closure gives you access to an outer function scope from an inner function

// Example

function outerfunction()
{
    var name = "john";
     function innerfunction()
     {
        console.log(name);
     }
     innerfunction();
}

outerfunction();

function calculate(x) {
   function multiply(y) {
       return x * y;
   }
   return multiply;
}

const multiply3 = calculate(3);
console.log(multiply3)
console.log(multiply3(2)); 