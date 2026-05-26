let start = 10;
let end = 50;

for(let num = start; num <= end; num++) {

    let prime = true;

    for(let i = 2; i < num; i++) {
        if(num % i == 0) {
            prime = false;
            break;
        }
    }

    if(prime && num > 1)
        console.log(num);
}