const totalWage = empDailyWageArr.reduce(
    (total, wage) => total + wage, 0
);

console.log("Total Wage : " + totalWage);