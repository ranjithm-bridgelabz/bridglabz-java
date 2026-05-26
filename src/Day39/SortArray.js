let numbers = [];

// Generate random numbers
for(let i = 0; i < 10; i++) {

    numbers[i] = Math.floor(Math.random() * 900) + 100;
}

console.log("Before Sorting:");
console.log(numbers);

// Sorting
numbers.sort((a, b) => a - b);

console.log("After Sorting:");
console.log(numbers);

console.log("Second Smallest = " + numbers[1]);

console.log("Second Largest = " + numbers[numbers.length - 2]);