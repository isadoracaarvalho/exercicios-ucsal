const numbers = [10, 9, 3, 11, 58, 16, 102, 8, 30, 21];

let maior = 0;

for(let i = 0; i < numbers.length; i++){
    if(numbers[i] > maior) {
        maior = numbers[i];
    }
}

console.log(maior);