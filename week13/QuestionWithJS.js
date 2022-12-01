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
    var binary = parseInt(input[1]);

    var binaryStr = value.toString(binary);

    var list = binaryStr.split("0");
    var result = 0;

    list.map(item => {
        if (isPrime(item)) result++;
    });

    console.log(result);
});


const isPrime = function(n) {
    if (n == 2 || n == 3) return true;
    if (n == 1 || n % 2 == 0 ) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if(n%i == 0) return false;
        else return true;
    }
}