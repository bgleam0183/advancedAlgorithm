var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var list = input[0].split('').map(item => parseInt(item));
    var a, b;



    console.log(list);
});