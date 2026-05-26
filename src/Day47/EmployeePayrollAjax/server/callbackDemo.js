const employeeService =
    require('./employeeService');

console.log("Before Create Employee");

employeeService.createEmployee(
    {
        id: 3,
        name: "Raj",
        salary: 70000
    },

    () => {

        employeeService.getEmployeeList(
            (employees) => {

                console.log("Employee List");

                console.table(employees);
            }
        );
    }
);

console.log("After Create Employee");