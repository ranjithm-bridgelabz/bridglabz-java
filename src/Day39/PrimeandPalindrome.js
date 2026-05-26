function isPrime(num) {

    for(let i = 2; i < num; i++) {
        if(num % i == 0)
            return false;
    }

    return true;
}

function palindrome(num) {

    let reverse = 0;
    let temp = num;

    while(temp > 0) {
        let rem = temp % 10;
        reverse = reverse * 10 + rem;
        temp = Math.floor(temp / 10);
    }

    return reverse;
}

let number = 131;

if(isPrime(number)) {

    let pal = palindrome(number);

    if(isPrime(pal))
        console.log("Palindrome is also Prime");
    else
        console.log("Palindrome is not Prime");
}