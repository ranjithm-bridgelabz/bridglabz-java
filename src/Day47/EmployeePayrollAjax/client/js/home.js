const getEmployeeData = () => {

    const url =
        "https://jsonplaceholder.typicode.com/users";

    makeServiceCall("GET", url, true)

    .then(responseText => {

        let employeeData =
            JSON.parse(responseText);

        let output = "";

        employeeData.forEach(employee => {

            output += `
                <p>
                    ${employee.id}
                    -
                    ${employee.name}
                </p>
            `;
        });

        document.querySelector("#employeeData")
                .innerHTML = output;
    })

    .catch(error => {

        console.log(error);
    });
}