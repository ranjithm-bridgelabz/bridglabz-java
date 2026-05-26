const employees = [
    {
        id: 1,
        name: "Ranjith",
        salary: 50000
    }
];

function createEmployee(employee){

    return new Promise((resolve, reject) => {

        setTimeout(() => {

            employees.push(employee);

            const error = false;

            if(!error){

                resolve();

            }else{

                reject("Error : Something went wrong");
            }

        }, 2000);
    });
}

function getEmployees(){

    setTimeout(() => {

        console.table(employees);

    }, 1000);
}

createEmployee(
    {
        id: 2,
        name: "Kumar",
        salary: 60000
    }
)
.then(getEmployees)
.catch(err => console.log(err));