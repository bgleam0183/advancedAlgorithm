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

    // 일반적인 방법
    var binaryStr = value.toString(2);

    if (binaryStr[binaryStr.length-1] == "1") {
     console.log("[1] value is Odd.");
    }
    else {
        console.log("[1] value is Even.");
    }

    // XOR 연산을 통한 결과 유추
    console.log((value^1).toString(2).at(-1) == "0" ? "[2] Odd" : "[2] Even");
});