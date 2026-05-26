let addressBook = [
    { firstName: "Ranjith" },
    { firstName: "Arun" },
    { firstName: "Karthik" }
];

let count = addressBook.reduce(
    (total, contact) => total + 1,
    0
);

console.log("Number of Contacts :", count);