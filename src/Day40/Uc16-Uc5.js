let emailRegex =
RegExp('^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2})?$');

console.log(emailRegex.test("abc.xyz@bridgelabz.co.in"));
console.log(emailRegex.test("abc+100@gmail.com"));