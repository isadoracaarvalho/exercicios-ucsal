const numbers = [10, 9, 3, 11, 58, 16, 102, 8, 30, 21];

let soma = 0;

for(let i = 0; i < numbers.length; i++){
    soma += numbers[i];
}

console.log(`A soma de todos os elementos do array é ${soma}`)