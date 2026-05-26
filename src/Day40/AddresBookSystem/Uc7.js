let addressBook = [];

function addContact(contact) {

    let duplicate = addressBook.find(
        person =>
            person.firstName === contact.firstName &&
            person.lastName === contact.lastName
    );

    if (duplicate) {
        console.log("Duplicate Contact Found");
    } else {
        addressBook.push(contact);
        console.log("Contact Added");
    }
}

addContact({
    firstName: "Ranjith",
    lastName: "Kumar"
});

addContact({
    firstName: "Ranjith",
    lastName: "Kumar"
});

console.log(addressBook);