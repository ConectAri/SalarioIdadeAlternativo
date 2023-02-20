# SalarioIdadeAlternativo

<h1>Enunciado do projeto:</h1>

Faça um programa que peça para o usuário digitar a idade, o salário e o sexo de uma pessoa até que as entradas digitadas sejam válidas.

Idade: entre 0 e 150; Salário: maior que 0; Gênero: M, F ou Outro.

Por último imprima os dados recebidos do usuário.

<h2>Debugando o código:</h2>

O que significa:

while (!entradaValida) {

System.out.print("Digite a idade: ");

idade = input.nextInt();

if (idade >= 0 && idade <= 150) {

entradaValida = true;

} else {

 System.out.println("Idade inválida. Tente novamente.");
 }
 }
