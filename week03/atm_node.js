var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var input = [];
var cnt = 0;

rl.on("line", (line) => {
  input.push(line);
}).on("close", () => {
    var num = input[0].split("");
    var result = num[0];

    num = num.slice(1);

    num.map(item => {
        if (item <= 1 || result == 0) {
            result += item;
        }
        else {
            result *= item;
        }
    })
    console.log(result);
});