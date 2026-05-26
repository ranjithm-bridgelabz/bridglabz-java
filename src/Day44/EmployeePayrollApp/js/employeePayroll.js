window.addEventListener('DOMContentLoaded', (event) => {

    const salary = document.querySelector('#salary');

    const output = document.querySelector('.salary-output');

    output.textContent = salary.value;

    salary.addEventListener('input', function() {
        output.textContent = salary.value;
    });

});

const save = () => {

    try {

        let employeePayrollData = createEmployeePayroll();

        createAndUpdateStorage(employeePayrollData);

        alert("Data Added Successfully");

    } catch (e) {
        console.log(e);
    }
}

function createEmployeePayroll() {

    let employeePayrollData = new EmployeePayrollData();

    employeePayrollData.name =
        document.querySelector('#name').value;

    employeePayrollData.salary =
        document.querySelector('#salary').value;

    employeePayrollData.gender =
        document.querySelector('input[name=gender]:checked').value;

    employeePayrollData.note =
        document.querySelector('#notes').value;

    return employeePayrollData;
}

function createAndUpdateStorage(employeePayrollData) {

    let employeePayrollList =
        JSON.parse(localStorage.getItem("EmployeePayrollList"));

    if(employeePayrollList != undefined) {

        employeePayrollList.push(employeePayrollData);

    } else {

        employeePayrollList = [employeePayrollData];
    }

    localStorage.setItem(
        "EmployeePayrollList",
        JSON.stringify(employeePayrollList)
    );
}

const resetForm = () => {

    document.querySelector('#name').value = '';
    document.querySelector('#salary').value = '400000';
    document.querySelector('#notes').value = '';
}