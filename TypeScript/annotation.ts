/* let name : string;
let heightInCentimeters : number;
let isActive : boolean;

const names:string[] = ["Alice", "Bob", "Charlie"];
console.log(names); */

let SayHello : (name: string) => string;

SayHello = (name) => {
    return 'some string';
};

SayHello('Hello');
