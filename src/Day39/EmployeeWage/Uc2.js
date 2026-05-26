const IS_PRESENT = 1;

const EMP_RATE_PER_HOUR = 20;

const FULL_DAY_HOUR = 8;

let empCheck = Math.floor(Math.random() * 2);

let empHrs = 0;

if(empCheck == IS_PRESENT) {

    empHrs = FULL_DAY_HOUR;
}

let empWage = empHrs * EMP_RATE_PER_HOUR;

console.log("Employee Wage = " + empWage);