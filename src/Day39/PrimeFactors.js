let n = 84;

for(let i = 2; i <= n; i++) {

    while(n % i == 0) {
        console.log(i);
        n = n / i;
    }
}