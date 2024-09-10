// bind() : used to bind the function and object and return new function

console.log('Bind function example');
var employee={
    firstname:'Anand',
    lastname:'yadav',
    getEmpName:function()
    {
        var fullname = this.firstname+' '+this.lastname;
        return fullname;
    }
}

var output1= function()
{
    console.log(this.getEmpName()+" Hi")
}

var output2 = output1.bind(employee);
output2();

console.log('call function example');
console.log('call is a inbuilt function in js ');

//  call() function will call a function with a given this value and arguments provided individually.
// accpet the parameter, execute the function it was called right away

var outputcall= function(p1,p2)
{
    console.log(this.getEmpName()+' '+p1+' '+p2+" Hi")
}
outputcall.call(employee,'Raj','Michael')

// apply() function
// difference between call and apply function is apply function will take arguments in array

outputcall.apply(employee,['Mango','Orange'])