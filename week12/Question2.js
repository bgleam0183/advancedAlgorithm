var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var str = input[0];

    var regex = /[A-z]/;

    var alpha = [];
    var num = 0;

    for (let i=0; i < str.length; i++) {
        if (regex.test(str[i])) {
            alpha.push(str[i]);
        }
        else {
            num += parseInt(str[i]);
        }
    }

    alpha = alpha.sort();

    num != 0 ? console.log(alpha.join('') + num) : console.log(alpha);
});