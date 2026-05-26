let min = 1000;
let max = 0;

for(let i = 1; i <= 5; i++) {
    let num = Math.floor(Math.random() * 900) + 100;

    console.log(num);

    if(num > max)
        max = num;

    if(num < min)
        min = num;
}

console.log("Maximum: " + max);
console.log("Minimum: " + min);