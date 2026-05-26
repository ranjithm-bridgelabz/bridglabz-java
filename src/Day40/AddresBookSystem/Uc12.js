let addressBook = [
    {
        firstName: "Ranjith",
        city: "Chennai",
        state: "TamilNadu",
        zip: "600001"
    },
    {
        firstName: "Arun",
        city: "Madurai",
        state: "TamilNadu",
        zip: "625001"
    },
    {
        firstName: "Rahul",
        city: "Bangalore",
        state: "Karnataka",
        zip: "560001"
    }
];

console.log("Sort by City");

let sortCity = [...addressBook].sort((a, b) =>
    a.city.localeCompare(b.city)
);

console.log(sortCity);

console.log("Sort by State");

let sortState = [...addressBook].sort((a, b) =>
    a.state.localeCompare(b.state)
);

console.log(sortState);

console.log("Sort by Zip");

let sortZip = [...addressBook].sort((a, b) =>
    a.zip.localeCompare(b.zip)
);

console.log(sortZip);