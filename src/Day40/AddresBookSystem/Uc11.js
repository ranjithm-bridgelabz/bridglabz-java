let addressBook = [
    {
        firstName: "Karthik",
        city: "Chennai"
    },
    {
        firstName: "Arun",
        city: "Madurai"
    },
    {
        firstName: "Ranjith",
        city: "Coimbatore"
    }
];

addressBook.sort((a, b) =>
    a.firstName.localeCompare(b.firstName)
);

console.log(addressBook);