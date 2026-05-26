let employee = {
    id: 101,
    name: "Ranjith",
    salary: 50000,

    display() {
        console.log(
            `Id: ${this.id}, Name: ${this.name}, Salary: ${this.salary}`
        );
    }
};

employee.display();