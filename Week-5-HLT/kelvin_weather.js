/* The weather is forecast at 293 kelvin today, thus:
we'll use const in place of var/let so this remains constant: */
const kelvin = 293;

/* Celcius is 273 deegrees less than kelvin, thus:
we can work out kelvin's tempature in celcius by subtracting: */
const celcius = kelvin - 273;

/* The following equation is designed to work out fahrenheit from
celcius, but it's not complete. We have yet to round the number, thus:
we'll use let so we can change the value of fahrenheit later: */
let fahrenheit = celcius * (9/5) + 32;

/* Often when converting from celcius -> farenheit you get a decimal,
thus: we'll use the .floor() method from JS's built in Math object so
we can round this number down, saving it to the original farenheit: */
fahrenheit = Math.floor(fahrenheit);

/* The following console.log() should print out 68 degrees, whereas:
if we were to enter 0 kelvin we would get -460 degrees fahrenheit: */
console.log(`The temperature is ${fahrenheit} degrees Fahrenheit.`);