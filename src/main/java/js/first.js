// alert('hello,world');
let i = 1;

var ss = `
asd
asd
asd`

var person = {
    name: "zhangshan",
    age: 3,
    tags: ['js', 'java', 'web']
}

let sss = 12312;
console.log(`什么玩意${sss}`);

var map = new Map([['tom', 100], ['tom1', 100], ['tom3', 100]])
console.log(map.get('tom'))
map.set('lili', 123);

var arr = [3, 4, 5]
for (var x of arr) {
    console.log(x)
}
for (let x of  map) {
    console.log(x)
}