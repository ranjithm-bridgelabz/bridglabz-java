let totalWorkingDays = empDailyWageArr.filter(
    wage => wage > 0
).length;

console.log("Days Worked : " + totalWorkingDays);