let birthMonthMap = new Map();

// Initialize months
for(let i = 1; i <= 12; i++) {

    birthMonthMap.set(i, []);
}

// Generate birth months for 50 individuals
for(let person = 1; person <= 50; person++) {

    let month = Math.floor(Math.random() * 12) + 1;

    birthMonthMap.get(month).push(person);
}

// Display persons grouped by month
for(let [month, persons] of birthMonthMap) {

    console.log("Month " + month + " : ");

    console.log(persons);
}