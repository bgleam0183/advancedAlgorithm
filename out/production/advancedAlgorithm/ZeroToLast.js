var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var input = [];

rl.on("line", (line) => {
  input.push(line);
}).on("close", () => {
	var list = input[0].split('').map(item => parseInt(item));
	var a, b;
	
	for (let i = 0; i < list.length; i++) {
		if(list[i] == 0) {
			a = i;
			for(let j=a; j<list.length; j++) {
				if(list[j] != 0) {
					b = j;
					
					var tmp = list[b];
					list[b] = list[a];
					list[a] = tmp;
					
					break;
				}
			}
		}
	}
	
    console.log(list);
});