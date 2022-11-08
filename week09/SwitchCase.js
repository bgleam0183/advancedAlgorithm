var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

function toggleCase(str) {
    var result;

    for (let i=0; i < str.length; i++) {
        console.log(String.fromCharCode(str.charCodeAt(i)^32));
        result += String.fromCharCode(str.charCodeAt(i)^32);
    }

    return result;
}

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var value = input[0];

    var result = toggleCase(value);

    console.log(result);
});