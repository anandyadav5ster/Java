// function calling itself

function printNumber(number)
{
    console.log(number);
    newNumber = number-1;
    // base condition
    if(newNumber>0)
    {
        printNumber(newNumber);
    }
    
}
// printNumber(4)

function findFactorial(number)
{
    if(number===0)
    {
        return 1
    }
    else{
        return number * findFactorial(number-1);
    }
}

const n =5;
if(n>0)
{
    let fact= findFactorial(n);
    console.log(fact);
}