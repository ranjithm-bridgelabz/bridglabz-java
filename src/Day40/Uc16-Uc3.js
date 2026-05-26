let emailRegex = RegExp('^[a-z]{3,}[@][a-z]{3,}[.][a-z]{2,}$');

console.log(emailRegex.test("abc@bridgelabz.co"));