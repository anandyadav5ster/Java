/*A module is just a file. One script is one module. As simple as that.
export keyword labels variables and functions that should be accessible from outside the current module.
import allows the import of functionality from other modules.*/

// import {sayHi} from "./basics.js";

// // alert (sayHi);
// sayHi('John');

// Dynamic import 

let {hello} = await import ('./basics.js')
