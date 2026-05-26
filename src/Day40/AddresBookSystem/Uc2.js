class Contact {
    constructor(firstName, lastName, address, city, state, zip, phone, email) {

        let nameRegex = /^[A-Z][a-zA-Z]{2,}$/;
        let addressRegex = /^[A-Za-z\s]{4,}$/;
        let zipRegex = /^[1-9][0-9]{5}$/;
        let phoneRegex = /^[6-9][0-9]{9}$/;
        let emailRegex = /^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$/;

        if (!nameRegex.test(firstName))
            throw "Invalid First Name";

        if (!nameRegex.test(lastName))
            throw "Invalid Last Name";

        if (!addressRegex.test(address))
            throw "Invalid Address";

        if (!addressRegex.test(city))
            throw "Invalid City";

        if (!addressRegex.test(state))
            throw "Invalid State";

        if (!zipRegex.test(zip))
            throw "Invalid Zip";

        if (!phoneRegex.test(phone))
            throw "Invalid Phone Number";

        if (!emailRegex.test(email))
            throw "Invalid Email";

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
}

try {
    let contact = new Contact(
        "Ranjith",
        "Kumar",
        "Anna Nagar",
        "Chennai",
        "TamilNadu",
        "600001",
        "9876543210",
        "ranjith@gmail.com"
    );

    console.log(contact);

} catch (e) {
    console.log(e);
}