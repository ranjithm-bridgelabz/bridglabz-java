let numbers = [];

// Generate 10 random 3 digit numbers
for(let i = 0; i < 10; i++) {

    numbers[i] = Math.floor(Math.random() * 900) + 100;
}

console.log("Array Elements:");
console.log(numbers);

let largest = -Infinity;
let secondLargest = -Infinity;

let smallest = Infinity;
let secondSmallest = Infinity;

// Find largest, second largest, smallest, second smallest
for(let num of numbers) {

    // Largest
    if(num > largest) {

        secondLargest = largest;
        largest = num;
    }
    else if(num > secondLargest && num != largest) {

        secondLargest = num;
    }

    // Smallest
    if(num < smallest) {

        secondSmallest = smallest;
        smallest = num;
    }
    else if(num < secondSmallest && num != smallest) {

        secondSmallest = num;
    }
}

console.log("Second Largest = " + secondLargest);

console.log("Second Smallest = " + secondSmallest);