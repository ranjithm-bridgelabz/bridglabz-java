class EmployeePayrollData {

    get name() {
        return this._name;
    }

    set name(name) {

        let nameRegex = RegExp('^[A-Z]{1}[a-z]{2,}$');

        if(nameRegex.test(name))
            this._name = name;
        else
            throw "Name Incorrect";
    }
}

let employee = new EmployeePayrollData();

try {
    employee.name = "Ranjith";
    console.log(employee.name);
}
catch(e) {
    console.error(e);
}