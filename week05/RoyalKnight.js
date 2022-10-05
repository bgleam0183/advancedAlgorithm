var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var list = input[0].split('');
    var x = list[0].charCodeAt(0) - 96;
    var y = parseInt(list[1]);

    console.log(x + " " + y);
});