const save = (event) => {

    event.preventDefault();

    let employeePayrollObj = createEmployeePayroll();

    createAndUpdateStorage(employeePayrollObj);

    window.location.replace(site_properties.home_page);
}

const createEmployeePayroll = () => {

    let employeePayrollObj = new EmployeePayrollData();

    employeePayrollObj.name = getInputValueById('#name');
    employeePayrollObj.salary = getInputValueById('#salary');
    employeePayrollObj.startDate = getInputValueById('#startDate');

    return employeePayrollObj;
}

const createAndUpdateStorage = (employeePayrollData) => {

    let employeePayrollList =
        JSON.parse(localStorage.getItem("EmployeePayrollList"));

    if(employeePayrollList != undefined){

        employeePayrollList.push(employeePayrollData);

    }else{

        employeePayrollList = [employeePayrollData];
    }

    localStorage.setItem(
        "EmployeePayrollList",
        JSON.stringify(employeePayrollList)
    );
}

window.addEventListener('DOMContentLoaded', (event) => {

    const employeeData =
        JSON.parse(localStorage.getItem("editEmp"));

    if(employeeData){

        document.querySelector('#name').value =
            employeeData._name;

        document.querySelector('#salary').value =
            employeeData._salary;

        document.querySelector('#startDate').value =
            employeeData._startDate;
    }
});