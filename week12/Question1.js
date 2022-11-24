var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var list = input[0].split(", ").map(item => parseInt(item));

    var result = -1;
    var flag;

    for (let i=0; i < list.length; i++) {
        flag = false;

        for(let j=0; j < i; j++) {
            if (list[i] < list[j]) {
                flag = true;
                continue;
            }
        }
        for(let j=i; j < list.length; j++) {
            if (list[i] > list[j]) {
                flag = true;
                continue;
            }
        }

        if (!flag) {
            result = i;
        }
    }

    console.log(result);
});