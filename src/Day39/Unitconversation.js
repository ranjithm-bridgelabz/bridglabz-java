let inch = 42;
let feet = inch / 12;

console.log("42 inches = " + feet + " feet");


let lengthFeet = 60;
let widthFeet = 40;

let meterConversion = 0.3048;

let areaMeters = (lengthFeet * meterConversion) * (widthFeet * meterConversion);

console.log("Area in meters: " + areaMeters);

let areaOnePlot = 2400;
let totalArea = areaOnePlot * 25;

let acres = totalArea / 43560;

console.log("Area in Acres: " + acres);