var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

var result = 0;

function fill(frm, i, j) {
    if (i < frm.length && j < frm[0].length && i >= 0 && j >= 0 && frm[i][j] != 1) { // i, j가 틀 안 + 1이 아닐 때만
        frm[i][j] = 1;

        fill(frm, i + 1, j);
        fill(frm, i - 1, j);
        fill(frm, i, j - 1);
        fill(frm, i, j + 1);
    }
}

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var N, M;
    var frm = [];

    input.map((row, idx) => {
        if (idx == 0) {
            var tmp = row.split(' ');
            N = tmp[0];
            M = tmp[1];
        }
        else {
            var tmp = [];
            row.split('').map(char => {
                tmp.push(parseInt(char));
            })
            frm.push(tmp);
        }
    })

    console.log(N+"/"+M);

    for (let i=0; i<N; i++) {
        for (let j=0; j<M; j++) {
            if(frm[i][j] == 0) {
                result++;
                fill(frm, i,j);
            }
        }
    }

    console.log(result);
});