let addressBook = [
    {
        firstName: "Ranjith",
        city: "Chennai",
        state: "TamilNadu"
    },
    {
        firstName: "Arun",
        city: "Chennai",
        state: "TamilNadu"
    },
    {
        firstName: "Rahul",
        city: "Bangalore",
        state: "Karnataka"
    }
];

let personsByCity = addressBook
    .filter(person => person.city === "Chennai")
    .map(person => person.firstName);

console.log("Persons from Chennai");
console.log(personsByCity);

let personsByState = addressBook
    .filter(person => person.state === "TamilNadu")
    .map(person => person.firstName);

console.log("Persons from TamilNadu");
console.log(personsByState);