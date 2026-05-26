let addressBook = [
    {
        firstName: "Ranjith",
        lastName: "Kumar"
    },
    {
        firstName: "Arun",
        lastName: "Raj"
    }
];

let index = addressBook.findIndex(
    person => person.firstName === "Arun"
);

if (index != -1) {
    addressBook.splice(index, 1);
}

console.log(addressBook);