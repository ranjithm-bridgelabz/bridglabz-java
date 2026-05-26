let day = 15;
let month = 4;

if((month == 3 && day >= 20) ||
   (month == 4 || month == 5) ||
   (month == 6 && day <= 20)) {

    console.log("True");
} else {
    console.log("False");
}