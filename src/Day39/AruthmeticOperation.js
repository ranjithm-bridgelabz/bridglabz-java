let a = 10;
let b = 20;
let c = 30;

let result1 = a + b * c;
let result2 = a % b + c;
let result3 = c + a / b;
let result4 = a * b + c;

console.log(result1);
console.log(result2);
console.log(result3);
console.log(result4);

let max = Math.max(result1, result2, result3, result4);
let min = Math.min(result1, result2, result3, result4);

console.log("Maximum: " + max);
console.log("Minimum: " + min);