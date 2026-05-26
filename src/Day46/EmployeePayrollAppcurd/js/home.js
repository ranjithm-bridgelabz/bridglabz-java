window.addEventListener('DOMContentLoaded', (event) => {

    let employeePayrollList =
        JSON.parse(localStorage.getItem("EmployeePayrollList"));

    if(employeePayrollList == undefined){
        employeePayrollList = [];
    }

    document.querySelector(".emp-count").textContent =
        employeePayrollList.length;

    createInnerHtml(employeePayrollList);
});

const createInnerHtml = (employeePayrollList) => {

    const headerHtml = `
    <tr>
        <th>Name</th>
        <th>Salary</th>
        <th>Start Date</th>
        <th>Actions</th>
    </tr>
    `;

    let innerHtml = `${headerHtml}`;

    for(const empPayrollData of employeePayrollList){

        innerHtml = `${innerHtml}

        <tr>

            <td>${empPayrollData._name}</td>

            <td>${empPayrollData._salary}</td>

            <td>${empPayrollData._startDate}</td>

            <td>

                <button onclick="remove(this)">
                    Delete
                </button>

                <button onclick="update(this)">
                    Edit
                </button>

            </td>

        </tr>
        `;
    }

    document.querySelector('#display').innerHTML = innerHtml;
}

const remove = (node) => {

    let employeePayrollList =
        JSON.parse(localStorage.getItem("EmployeePayrollList"));

    const row =
        node.parentNode.parentNode;

    const name =
        row.cells[0].textContent;

    employeePayrollList =
        employeePayrollList.filter(
            emp => emp._name != name
        );

    localStorage.setItem(
        "EmployeePayrollList",
        JSON.stringify(employeePayrollList)
    );

    location.reload();
}

const update = (node) => {

    const row =
        node.parentNode.parentNode;

    const name =
        row.cells[0].textContent;

    let employeePayrollList =
        JSON.parse(localStorage.getItem("EmployeePayrollList"));

    let employeeData =
        employeePayrollList.find(
            emp => emp._name == name
        );

    localStorage.setItem(
        "editEmp",
        JSON.stringify(employeeData)
    );

    window.location.replace(
        "../pages/payroll_form.html"
    );
}