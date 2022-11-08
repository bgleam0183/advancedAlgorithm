var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var value = parseInt(input[0]);

    console.log("[2진수] "+((value+1)&(~value)).toString(2));
    console.log("[10진수] "+((value+1)&(~value)));
});