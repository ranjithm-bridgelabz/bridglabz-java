let addressBook = [
    {
        firstName: "Ranjith",
        lastName: "Kumar",
        city: "Chennai"
    },
    {
        firstName: "Arun",
        lastName: "Raj",
        city: "Madurai"
    }
];

let contact = addressBook.find(person => person.firstName === "Ranjith");

if (contact != undefined) {
    contact.city = "Coimbatore";
}

console.log(addressBook);