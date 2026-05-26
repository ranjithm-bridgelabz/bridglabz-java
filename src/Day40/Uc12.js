class EmployeePayrollData {

    get name() {
        return this._name;
    }

    set name(name) {
        this._name = name;
    }

    constructor(name) {
        this.name = name;
    }
}

let employee = new EmployeePayrollData("Ranjith");

console.log(employee.name);