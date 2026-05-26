const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;

const PART_TIME_HOURS = 4;
const FULL_TIME_HOURS = 8;

const WAGE_PER_HOUR = 20;

const WORKING_DAYS = 20;

let empDailyWageMap = new Map();

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

for(let day = 1; day <= WORKING_DAYS; day++) {

    let empCheck = Math.floor(Math.random() * 3);

    let empHours = getWorkingHours(empCheck);

    let dailyWage = empHours * WAGE_PER_HOUR;

    empDailyWageMap.set(day, dailyWage);
}

console.log("Day Wise Wage:");

console.log(empDailyWageMap);

// Total Wage
let totalWage = 0;

for(let wage of empDailyWageMap.values()) {

    totalWage += wage;
}

console.log("Total Wage = " + totalWage);