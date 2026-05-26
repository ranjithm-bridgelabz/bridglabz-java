let pinRegex = RegExp('^[1-9]{1}[0-9]{2}\\s?[0-9]{3}$');

console.log(pinRegex.test("400088"));
console.log(pinRegex.test("400 088"));