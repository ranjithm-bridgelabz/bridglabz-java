function palindrome(num) {

    let reverse = 0;
    let temp = num;

    while(temp > 0) {
        let rem = temp % 10;
        reverse = reverse * 10 + rem;
        temp = Math.floor(temp / 10);
    }

    if(reverse == num)
        console.log("Palindrome");
    else
        console.log("Not Palindrome");
}

palindrome(121);