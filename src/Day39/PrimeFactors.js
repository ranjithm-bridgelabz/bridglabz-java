let n = 84;

let factors = [];

for(let i = 2; i <= n; i++) {

    while(n % i == 0) {

        factors.push(i);

        n = n / i;
    }
}

console.log("Prime Factors:");

console.log(factors);