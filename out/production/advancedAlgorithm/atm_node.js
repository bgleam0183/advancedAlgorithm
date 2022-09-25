var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var input = [];

rl.on("line", (line) => {
  input.push(line);
}).on("close", () => {
    var num = input[1].split(" ");
    var realVal = 0;
    var result = 0;

    num.sort((a, b) => a-b).map((item, idx) => {
        realVal = realVal + parseInt(item);

        result += realVal;
    });

    console.log(result);
});