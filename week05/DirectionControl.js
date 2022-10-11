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
    var move = input[1].split(" ");

    var x = 1, y = 1;

    move.map(mv => {
        switch (mv) {
            case "R":
                if (x<n) x++;
                break;
            case "L":
                if (x > 1) x--;
                break;
            case "U":
                if (y > 1) y--;
                break;
            case "D":
                if (y < n) y++;
                break;
            default:
                break;
        }
    })

    console.log(x + " " + y);
});