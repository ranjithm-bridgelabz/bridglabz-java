const IS_FULL_TIME = 2;
const IS_PART_TIME = 1;
const EMP_RATE_PER_HOUR = 20;

const getWorkingHours = (empCheck) => {
    switch(empCheck) {
        case IS_FULL_TIME:
            return 8;
        case IS_PART_TIME:
            return 4;
        default:
            return 0;
    }
};

let empDailyWageArr = [];

for(let day = 1; day <= 10; day++) {

    let empCheck = Math.floor(Math.random() * 3);

    let empHours = getWorkingHours(empCheck);

    let dailyWage = empHours * EMP_RATE_PER_HOUR;

    empDailyWageArr.push(dailyWage);
}

console.log(empDailyWageArr);