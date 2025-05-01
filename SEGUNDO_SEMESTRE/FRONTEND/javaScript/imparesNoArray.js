const numbers = [10, 9, 3, 11, 58, 16, 102, 8, 30, 21];

let qntImpares = 0;

for(let i = 0; i < numbers.length; i++){
    if(numbers[i] % 2 != 0) {
        qntImpares++;
    }
}

if(qntImpares != 0) {
    console.log(qntImpares);
} else {
    console.log('Nenhum valor ímpar encontrado')
}
