const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;

const EMP_RATE_PER_HOUR = 20;

function getWorkingHours(empCheck) {

    switch(empCheck) {

        case IS_PART_TIME:

            return 4;

        case IS_FULL_TIME:

            return 8;

        default:

            return 0;
    }
}

let empCheck = Math.floor(Math.random() * 3);

let empHrs = getWorkingHours(empCheck);

let empWage = empHrs * EMP_RATE_PER_HOUR;

console.log("Employee Wage = " + empWage);