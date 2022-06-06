// Asks for then inputs the user's name:
let userName = prompt(`What is your name?`);

/* If field was entered, outputs + saves user's name,
else, if field was left blank simply moves on: */
if (userName != ``) {
    console.log(`Hello, ${userName}!`);
} else {
    console.log(`Hello!`);
}

// Asks the user to input their question:
let userQuestion = prompt(`What is your question?`);

/* If field was entered, outputs the user's name then their question,
else, if field was left blank simply outputs their question: */
if (userName != ``) {
    console.log(`${userName} asked: ${userQuestion}`);
} else {
    console.log(`Asked: ${userQuestion}`);
}

// Generates a random number between 0 and 7, AKA: 1 and 8!
let randomNumber = Math.floor(Math.random() * (7 - 0 + 1)) + 0;

// Simply declares the variable representing the eightball's result:
let eightBall = '';

// Generates the eightball's result in response to the user:
if (randomNumber == 0) {
    eightBall = `It is certain.`;
} else if (randomNumber == 1) {
    eightBall = `It is decidedly so.`
} else if (randomNumber == 2) {
    eightBall = `Reply hazy try again.`
} else if (randomNumber == 3) {
    eightBall = `Cannot predict now.`
} else if (randomNumber == 4) {
    eightBall = `Do not count on it.`
} else if (randomNumber == 5) {
    eightBall = `My sources say no.`
} else if (randomNumber == 6) {
    eightBall = `Outlook not so good.`
} else if (randomNumber == 7) {
    eightBall = `Signs point to yes.`
} else {
    eightBall = `I have been penetrated by cosmic rays.`
}

// Outputs the eightball's result, huzzah!
console.log(eightBall);