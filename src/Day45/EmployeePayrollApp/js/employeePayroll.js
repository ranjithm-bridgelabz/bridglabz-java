window.addEventListener('DOMContentLoaded', (event) => {

    const employeePayrollList = [
        {
            name: "Ranjith",
            gender: "Male",
            department: ["HR", "Sales"],
            salary: "50000",
            startDate: "10 Oct 2025"
        },
        {
            name: "Kumar",
            gender: "Male",
            department: ["Finance"],
            salary: "60000",
            startDate: "15 Jan 2025"
        }
    ];

    document.querySelector(".emp-count").textContent =
        employeePayrollList.length;

    createInnerHtml(employeePayrollList);
});

const createInnerHtml = (employeePayrollList) => {

    const headerHtml = "<tr><th></th><th>Name</th><th>Gender</th><th>Department</th><th>Salary</th><th>Start Date</th><th>Actions</th></tr>";

    let innerHtml = `${headerHtml}`;

    for (const empPayrollData of employeePayrollList) {

        innerHtml = `${innerHtml}
        <tr>
            <td>
                <img class="profile" alt="" src="../assets/profile-images/Ellipse -1.png">
            </td>
            <td>${empPayrollData.name}</td>
            <td>${empPayrollData.gender}</td>

            <td>
                ${getDeptHtml(empPayrollData.department)}
            </td>

            <td>${empPayrollData.salary}</td>
            <td>${empPayrollData.startDate}</td>

            <td>
                <img class="icon" src="../assets/icons/delete-black-18dp.svg">
                <img class="icon" src="../assets/icons/create-black-18dp.svg">
            </td>
        </tr>
        `;
    }

    document.querySelector('#display').innerHTML = innerHtml;
}

const getDeptHtml = (deptList) => {

    let deptHtml = '';

    for(const dept of deptList){
        deptHtml = `${deptHtml}
            <div class='dept-label'>${dept}</div>
        `
    }

    return deptHtml;
}