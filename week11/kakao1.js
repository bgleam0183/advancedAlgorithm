var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var n = parseInt(input[0]);
    var arr1 = input[1].split(" ").map(item => parseInt(item).toString(2).padStart(n, '0'));
    var arr2 = input[2].split(' ').map(item => parseInt(item).toString(2).padStart(n, '0'));

    var final = [];

    for (let i=0; i < n; i++) {
        var str = "";
        for (let j=0; j < n; j++) {
            if (arr1[i][j] | arr2[i][j]) {
                str += "#";
            }
            else {
                str += " ";
            }
        }
        final.push(str);
    }

    final.map(item => {
        console.log(item);
    })
});