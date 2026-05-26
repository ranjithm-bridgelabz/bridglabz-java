let diceMap = new Map();

// Initialize dictionary
for(let i = 1; i <= 6; i++) {

    diceMap.set(i, 0);
}

let reachedTen = false;

// Roll dice until any number reaches 10 times
while(!reachedTen) {

    let dice = Math.floor(Math.random() * 6) + 1;

    let count = diceMap.get(dice);

    diceMap.set(dice, count + 1);

    if(count + 1 == 10) {

        reachedTen = true;
    }
}

// Display dictionary
console.log("Dice Roll Counts:");

console.log(diceMap);

// Find maximum and minimum
let max = 0;
let min = Infinity;

let maxNumber;
let minNumber;

for(let [key, value] of diceMap) {

    if(value > max) {

        max = value;
        maxNumber = key;
    }

    if(value < min) {

        min = value;
        minNumber = key;
    }
}

console.log("Maximum Repeated Number = " + maxNumber);

console.log("Minimum Repeated Number = " + minNumber);