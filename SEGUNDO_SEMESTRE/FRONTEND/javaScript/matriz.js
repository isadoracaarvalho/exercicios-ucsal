function imprimeQuadrado(n) {
    let linha = "*".repeat(n);

    for (let i = 0; i < n; i++) { 
        console.log(linha);
    }
}

imprimeQuadrado(5);
