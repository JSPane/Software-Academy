let temperature;
let condition;
let goToWork;

temperature = prompt(`What is the temperature? Please give your answer in degrees celcius.`);
console.log(`The temperature is currently ${temperature} degrees celcius!`);
condition = prompt(`What is the condition? Sunny, Cloudy, Raining, Snowing or Thunder?`);
    
switch(condition) {
    case `Sunny`:
        console.log(`It's Sunny!`);
        break;
    case `Cloudy`:
        console.log(`It's Cloudy!`);
        break;
    case `Raining`:
        console.log(`It's Raining!`);
        break;
    case `Snowing`:
        console.log(`It's Snowing!`);
        break;
    case `Thunder`:
        console.log(`It's Thundering!`);
        break;
    default:
        console.log(`Whoops, not a condition.`);
}

if (temperature >= 10) {
    switch(condition) {
        case `Sunny`:
            console.log(`Conditions look good!`);
            goToWork = true;
            break;
        case `Cloudy`:
            console.log(`Conditions look good!`);
            goToWork = true;
            break;
        case `Raining`:
            console.log(`No-one likes being wet and cold!`);
            goToWork = false;
            break;
        case `Snowing`:
            console.log(`Perhaps make yourself some hot chocolate instead?`);
            goToWork = false;
            break;
        case `Thunder`:
            console.log(`Not advisable whilst you're working with metal!`);
            goToWork = false;
            break;
        default:
            console.log(`Please restart and try again!`);
    }
} else if (temperature > 20) {
    switch(condition) {
        case `Sunny`:
            console.log(`Perfect weather!`);
            goToWork = true;
            break;
        case `Cloudy`:
            console.log(`Perfect weather!`);
            goToWork = true;
            break;
        case `Raining`:
            console.log(`Consider taking a coat!`);
            goToWork = true;
            break;
        case `Snowing`:
            console.log(`Huh, really? That's pretty weird.`);
            goToWork = false;
            break;
        case `Thunder`:
            console.log(`Not advisable whilst you're working with metal!`);
            goToWork = false;
            break;
        default:
            console.log(`Please restart and try again!`);
    }
} else if (temperature > 30) {
    switch(condition) {
        case `Sunny`:
            console.log(`Damn, that's hot!`);
            goToWork = false;
            break;
        case `Cloudy`:
            console.log(`Damn, that's hot!`);
            goToWork = false;
            break;
        case `Raining`:
            console.log(`Damn, that's hot!`);
            goToWork = false;
            break;
        case `Snowing`:
            console.log(`Huh, you're sure a volcano hasn't erupted near you??`);
            goToWork = false;
            break;
        case `Thunder`:
            console.log(`Not advisable, sounds like an incoming thunderstorm!`);
            goToWork = false;
            break;
        default:
            console.log(`Please restart and try again!`);
    }
} else if (temperature < 10) {
    switch(condition) {
        case `Sunny`:
            console.log(`Phew, that's cold!`);
            goToWork = false;
            break;
        case `Cloudy`:
            console.log(`Phew, that's cold!`);
            goToWork = false;
            break;
        case `Raining`:
            console.log(`Phew, that's cold! And wet!`);
            goToWork = false;
            break;
        case `Snowing`:
            console.log(`Time to build yourself a snowman instead!`);
            goToWork = false;
            break;
        case `Thunder`:
            console.log(`Not advisable whilst you're working with metal!`);
            goToWork = false;
            break;
        default:
            console.log(`Please restart and try again!`);
    }
} else {
    console.log(`Please restart and try again!`);
    console.log(`Do make sure you've used numbers for degrees celcius!`);
}

if (goToWork == true) {
    console.log(`Should you go to work? Of course!`);
} else if (goToWork == false) {
    console.log(`Should you go to work? Nope, stay inside this time!`);
} else {
    console.log(`Do note, conditions from the list are case sensitive!`);
}