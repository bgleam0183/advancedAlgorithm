var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var input = [];

rl.on("line", (line) => {
  input.push(line);
}).on("close", () => {
    var n = input[0];
	var list = input[1].split('');;
	var result = 0;
	
	
	list.map(item => {
		result += parseInt(item);
	})
	
    console.log(result);
});