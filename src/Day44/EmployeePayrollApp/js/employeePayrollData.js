class EmployeePayrollData {

    constructor() {
        this.name = '';
        this.profilePic = '';
        this.gender = '';
        this.department = '';
        this.salary = '';
        this.note = '';
        this.startDate = '';
    }

    get name() {
        return this._name;
    }

    set name(name) {
        this._name = name;
    }

    toString() {
        return "name=" + this.name +
            ", salary=" + this.salary;
    }
}