let num = 13;
let prime = true;

for(let i = 2; i < num; i++) {
    if(num % i == 0) {
        prime = false;
        break;
    }
}

if(prime)
    console.log("Prime");
else
    console.log("Not Prime");