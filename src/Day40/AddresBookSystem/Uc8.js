let addressBook = [
    {
        firstName: "Ranjith",
        city: "Chennai",
        state: "TamilNadu"
    },
    {
        firstName: "Arun",
        city: "Madurai",
        state: "TamilNadu"
    },
    {
        firstName: "Rahul",
        city: "Bangalore",
        state: "Karnataka"
    }
];

let cityResult = addressBook.filter(
    person => person.city === "Chennai"
);

console.log("Persons in Chennai");
console.log(cityResult);

let stateResult = addressBook.filter(
    person => person.state === "TamilNadu"
);

console.log("Persons in TamilNadu");
console.log(stateResult);