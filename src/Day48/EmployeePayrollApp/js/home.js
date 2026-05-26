function getEmployee() {

    makeServiceCall("GET", getURL, true)
        .then(responseText => {
            console.log("GET Success");
            console.log(JSON.parse(responseText));
        })
        .catch(error => {
            console.log("GET Error Status: " + JSON.stringify(error));
        });
}

function addEmployee() {

    let empData = {
        name: "Dhoni",
        salary: "80000",
        gender: "male",
        startDate: "2026-05-26"
    };

    makeServiceCall("POST", getURL, true, empData)
        .then(responseText => {
            console.log("POST Success");
            console.log(responseText);
        })
        .catch(error => {
            console.log("POST Error Status: " + JSON.stringify(error));
        });
}

function deleteEmployee(id) {

    makeServiceCall("DELETE", getURL + id, true)
        .then(responseText => {
            console.log("DELETE Success");
            console.log(responseText);
        })
        .catch(error => {
            console.log("DELETE Error Status: " + JSON.stringify(error));
        });
}