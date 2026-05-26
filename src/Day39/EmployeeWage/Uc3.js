const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;

const EMP_RATE_PER_HOUR = 20;

const PART_TIME_HOUR = 4;
const FULL_TIME_HOUR = 8;

let empCheck = Math.floor(Math.random() * 3);

let empHrs = 0;

switch(empCheck) {

    case IS_PART_TIME:

        empHrs = PART_TIME_HOUR;

        break;

    case IS_FULL_TIME:

        empHrs = FULL_TIME_HOUR;

        break;

    default:

        empHrs = 0;
}

let empWage = empHrs * EMP_RATE_PER_HOUR;

console.log("Employee Wage = " + empWage);