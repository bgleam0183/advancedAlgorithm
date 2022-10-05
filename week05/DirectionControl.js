var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var n = Int.parseInt(input[0]);
    var move = input[1].split(" ");

    var x = 1, y = 1;

    move.map(mv => {
        /**
         * 시간을 단축할 수 있는 방법은? (기존 방식x)
         * 1. LRUD 문자 인식
         * 2-1. 조건문 최소화
         * 2-2. 조건문 효율적 사용 (switch vs if)
         * 3. 계산 최소화[간결화]
         */
        // 범위 벗어나면 아예 판단 pass?
        switch (mv) {
            case "L":
            case "R":

        }
    })




    console.log(list);
});