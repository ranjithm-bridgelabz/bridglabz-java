let isAllFullTime = fullTimeDays.every(
    dayWage => dayWage.includes("160")
);

console.log(isAllFullTime);