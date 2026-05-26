const employees = [
    {
        id: 1,
        name: "Ranjith",
        salary: 50000
    },
    {
        id: 2,
        name: "Kumar",
        salary: 60000
    }
];

function getEmployeeList(callback){

    setTimeout(() => {

        callback(employees);

    }, 2000);
}

function createEmployee(employee, callback){

    setTimeout(() => {

        employees.push(employee);

        callback();

    }, 3000);
}

module.exports = {
    getEmployeeList,
    createEmployee
};