# SalarioIdadeAlternativo

<h1>Enunciado do projeto:</h1>

Faça um programa que peça para o usuário digitar a idade, o salário e o sexo de uma pessoa até que as entradas digitadas sejam válidas.

Idade: entre 0 e 150; Salário: maior que 0; Gênero: M, F ou Outro.

Por último imprima os dados recebidos do usuário.

<h2>Debugando o código:</h2>

<h2>O que significa:</h2>

while (!entradaValida) {

System.out.print("Digite a idade: ");

idade = input.nextInt();

if (idade >= 0 && idade <= 150) {

entradaValida = true;

} else {

 System.out.println("Idade inválida. Tente novamente.");
 }
 }
 
 
 Essa linha de código é uma estrutura de repetição while, que é usada para garantir que o valor da variável idade seja válido.

A condição !entradaValida é uma expressão booleana que verifica se a variável entradaValida é false. Quando a variável entradaValida é false, o bloco de código dentro do while é executado.

O operador ! é usado para negar a condição, ou seja, enquanto entradaValida for false, o bloco de código será executado.

Dentro do bloco de código, a mensagem "Digite a idade: " é exibida e o usuário é solicitado a digitar um valor para a variável idade. Se o valor digitado estiver dentro da faixa válida (entre 0 e 150, inclusos), a variável entradaValida é atribuída true, encerrando a repetição. Caso contrário, a mensagem "Idade inválida. Tente novamente." é exibida, a variável entradaValida permanece false, e a repetição é executada novamente, solicitando ao usuário que digite um novo valor para idade.

Essa estrutura de repetição garante que o valor digitado pelo usuário para a variável idade esteja dentro da faixa válida, evitando que valores inválidos sejam aceitos.



<h2>O que significa:</h2>

entradaValida = false;

 while (!entradaValida) {
 
 System.out.print("Digite o salário: ");
            
 salario = input.nextDouble();
            
 if (salario > 0) {
            
 entradaValida = true;
                
 } else {
            
 System.out.println("Salário inválido. Tente novamente.");
 }
 }
 
 Essas linhas de código são uma estrutura de repetição while, que é usada para garantir que o valor da variável salario seja válido.

A variável entradaValida é inicializada com o valor false. Essa variável será usada para controlar a repetição, garantindo que o bloco de código dentro do while seja executado até que um valor válido seja digitado pelo usuário.

Dentro do bloco de código, a mensagem "Digite o salário: " é exibida e o usuário é solicitado a digitar um valor para a variável salario. Se o valor digitado for maior que zero, a variável entradaValida é atribuída true, encerrando a repetição. Caso contrário, a mensagem "Salário inválido. Tente novamente." é exibida, a variável entradaValida permanece false, e a repetição é executada novamente, solicitando ao usuário que digite um novo valor para salario.

Essa estrutura de repetição garante que o valor digitado pelo usuário para a variável salario seja maior que zero, evitando que valores inválidos sejam aceitos.


<h2>O que significa:</h2>

 System.out.print("Digite o gênero (M/F/Outro): ");
 
 genero = input.next();
            
 if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("Outro")) {
            
 entradaValida = true;
                
 } else {
            
 System.out.println("Gênero inválido. Tente novamente.");
 }
 }
 
 
 Essas linhas de código são uma estrutura de repetição while, que é usada para garantir que o valor da variável genero seja válido.

A variável entradaValida é inicializada com o valor false. Essa variável será usada para controlar a repetição, garantindo que o bloco de código dentro do while seja executado até que um valor válido seja digitado pelo usuário.

Dentro do bloco de código, a mensagem "Digite o gênero (M/F/Outro): " é exibida e o usuário é solicitado a digitar um valor para a variável genero. Se o valor digitado for "M", "F" ou "Outro" (ignorando a diferença entre letras maiúsculas e minúsculas), a variável entradaValida é atribuída true, encerrando a repetição. Caso contrário, a mensagem "Gênero inválido. Tente novamente." é exibida, a variável entradaValida permanece false, e a repetição é executada novamente, solicitando ao usuário que digite um novo valor para genero.

Essa estrutura de repetição garante que o valor digitado pelo usuário para a variável genero seja válido, ou seja, "M", "F" ou "Outro", ignorando a diferença entre letras maiúsculas e minúsculas, evitando que valores inválidos sejam aceitos.


