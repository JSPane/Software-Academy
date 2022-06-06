// Generates a random race number for the user:
let raceNumber = Math.floor(Math.random() * 1000);

// Declares the times the user registered as a boolean:
let regTime = true;

// Lets the user input whether they signed up early or late:
let userInput = prompt(`Did you register early or late? Please answer 1 or 0, respectively.`);

/* Assigns they user's input as the boolean's true or false result,
else, if a different result was input it inforns the user: */
if (userInput == 1) {
    regTime = true;
} else if (userInput == 0) {
    regTime = false;
} else {
    console.out(`Incorrect response received, please try again.`);
}

// Declares the age of the user as a number:
let runnerAge = 18;

/* If the runner's over 18 and registered late or early, assigns race number over 1000,
else, if the runner's under or equal to 18, assigns a race number below 1000: */
if (runnerAge > 18 && regTime == true) {
    raceNumber += 1000;
} else if (runnerAge > 18 && regTime == false) {
    raceNumber += 1000;
} else if (runnerage < 18) {
    racenumber /= 100;
} else {
    racenumber /= 100;
}
/* If the runner's over 18 and registered early, they will race at 9:30 am,
else, if the runner's over 18 and registered late, they will race at 11:00 am,
else, if the runner's below 18, they will race at 12:30 am, else, if the runner's
equal to 18 they will be told to see the resistration desk: in all cases save the
latter, the runner's race number is also confirmed: */
if (runnerAge > 18 && regTime == true) {
    console.out(`You will race at 9:30 am, your racenumber is ${raceNumber}.`);
} else if (runnerAge > 18 && regTime == false) {
    console.out(`You will race at 11:00 am, your racenumber is ${raceNumber}.`);
} else if (runnerAge < 18) {
    console.out(`You will race at 12:30 am, your racenumber is ${raceNumber}.`);
} else {
    console.out(`Please see the registration deck.`)
}