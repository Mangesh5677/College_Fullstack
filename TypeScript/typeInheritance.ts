/* const Poet = {
    name: "William Shakespeare",
    born: 2000,
}; */
/* const PoetLater:typeof Poet = {
    name: "John Doe",
    born: 2001,
};

const YetAnotherPoet:typeof Poet = {
    name: "Shreeman",
    born: 2010,
}; */

//Interface - custom type shape:
/* interface Poet {
    name: string;
    born: number;
} */
type Poet = {
    name: string;
    born: number;
};
const PoetLater: Poet = {
    name: "John Doe",
    born: 2001,
};

const YetAnotherPoet:Poet = {
    name: "Shreeman",
    born: 2010,
};

type x = string | number;
let firstName: x;
firstName = "John";
firstName = 500;


