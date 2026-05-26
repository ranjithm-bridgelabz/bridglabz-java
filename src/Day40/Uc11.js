class EmployeePayrollData {

    id;
    salary;
    gender;
    startDate;

    constructor(id, salary, gender, startDate) {
        this.id = id;
        this.salary = salary;
        this.gender = gender;
        this.startDate = startDate;
    }

    toString() {
        return `Id=${this.id},
                Salary=${this.salary},
                Gender=${this.gender},
                StartDate=${this.startDate}`;
    }
}

let employeePayrollData =
    new EmployeePayrollData(
        1,
        50000,
        "M",
        new Date()
    );

console.log(employeePayrollData.toString());