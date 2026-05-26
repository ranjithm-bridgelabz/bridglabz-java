class EmployeePayrollData {

    set id(id) {

        let idRegex = RegExp('^[1-9]{1}[0-9]*$');

        if(idRegex.test(id))
            this._id = id;
        else
            throw "Invalid ID";
    }

    set salary(salary) {

        let salaryRegex = RegExp('^[1-9]{1}[0-9]*$');

        if(salaryRegex.test(salary))
            this._salary = salary;
        else
            throw "Invalid Salary";
    }

    set gender(gender) {

        let genderRegex = RegExp('^[MF]{1}$');

        if(genderRegex.test(gender))
            this._gender = gender;
        else
            throw "Invalid Gender";
    }

    set startDate(startDate) {

        let now = new Date();

        if(startDate <= now)
            this._startDate = startDate;
        else
            throw "Date is Future Date";
    }
}

try {

    let employee = new EmployeePayrollData();

    employee.id = 1;
    employee.salary = 50000;
    employee.gender = "M";
    employee.startDate = new Date();

    console.log(employee);

} catch(e) {

    console.error(e);
}