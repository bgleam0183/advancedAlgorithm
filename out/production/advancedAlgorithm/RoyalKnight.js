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

    var mvNum = [-1, 1, -2, 2];

    var result = 0;

    mvNum.map(a => {
        if ((a + x) > 0) {
            mvNum.map(b => {
                if ((b + y) > 0 && Math.abs(a * b) == 2) {
                    console.log(a + " " + b);
                    result++;
                }
            })
        }
    })
    console.log(result);


});