var readline = require('readline');
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var input = [];

const solution = function(str) {
    var len = str.length;
    var minLen = len;
    var pre = "", post = "";

    for(let i=1; i <= len/2; i++) {
        var cnt = 1;
        var result = "";
        pre = str.slice(0, i);
        for(let j=i; j < len; j++) {
            post = str.slice(j, j+i);
            // console.log("pre > " + pre);
            // console.log("post > " + post);
            if(pre == post) {
                cnt++;
            }
            else {
                if (cnt != 1) {
                    result += cnt + pre;
                }
                else {
                    result += pre;
                }
                pre = post;
                cnt = 1;
            }
        }
        console.log("before result : "+result);

        if (cnt == 1) result += pre;
        else { result += cnt += pre; }

        console.log("after result : "+result);

        minLen = Math.min(minLen, result.length);
    }

    return minLen;
};

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    var str = input[0];

    console.log(solution(str));
});