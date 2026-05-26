const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;

const PART_TIME_HOURS = 4;
const FULL_TIME_HOURS = 8;

const WAGE_PER_HOUR = 20;

const WORKING_DAYS = 20;

let empDailyWageArr = [];

function getWorkingHours(empCheck) {

    switch(empCheck) {

        case IS_PART_TIME:
            return PART_TIME_HOURS;

        case IS_FULL_TIME:
            return FULL_TIME_HOURS;

        default:
            return 0;
    }
}

// Store wages
for(let day = 1; day <= WORKING_DAYS; day++) {

    let empCheck = Math.floor(Math.random() * 3);

    let empHours = getWorkingHours(empCheck);

    let dailyWage = empHours * WAGE_PER_HOUR;

    empDailyWageArr.push(dailyWage);
}

console.log(empDailyWageArr);

// UC 7A - Total Wage
let totalWage = empDailyWageArr.reduce((total, wage) => total + wage, 0);

console.log("Total Wage = " + totalWage);

// UC 7B - Day with Wage
let dailyMap = empDailyWageArr.map((wage, index) => {

    return "Day " + (index + 1) + " = " + wage;
});

console.log(dailyMap);

// UC 7C - Full Time Wage Days
let fullTimeWage = empDailyWageArr.filter(wage => wage == 160);

console.log("Full Time Wage Days:");

console.log(fullTimeWage);

// UC 7D - First Full Time Wage
let firstFullTime = empDailyWageArr.find(wage => wage == 160);

console.log("First Full Time Wage = " + firstFullTime);

// UC 7E - Every Full Time Wage Check
let everyCheck = fullTimeWage.every(wage => wage == 160);

console.log("Every Full Time Wage = " + everyCheck);

// UC 7F - Any Part Time Wage
let anyPartTime = empDailyWageArr.some(wage => wage == 80);

console.log("Any Part Time Wage = " + anyPartTime);

// UC 7G - Number of Days Employee Worked
let workedDays = empDailyWageArr.filter(wage => wage > 0).length;

console.log("Employee Worked Days = " + workedDays);