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

let cityCount = addressBook.reduce((count, person) => {
    return person.city === "Chennai" ? count + 1 : count;
}, 0);

console.log("Chennai Count :", cityCount);

let stateCount = addressBook.reduce((count, person) => {
    return person.state === "TamilNadu" ? count + 1 : count;
}, 0);

console.log("TamilNadu Count :", stateCount);