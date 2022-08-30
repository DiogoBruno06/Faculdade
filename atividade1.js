///CRIAÇÃO DAS VARIAVEIS
var totalPessoas = 0;
var alturaF = 0;
var alturaM = 0;
var pessoasF = 0;
var pessoasM = 0;
var qtdAlturas = [];

///ESTRUTURA DE REPETIÇÃO PARA 15 PESSOAS
while(totalPessoas < 15) {

	var sexo = prompt("Digite o SEXO a pessoa " + (totalPessoas + 1));
	var altura = parseFloat(prompt("Digite a ALTURA da Pessoa " + (totalPessoas + 1)));

///ESTRUTURA DE SELEÇÃO A PARTIR DO SEXO
	if(sexo == "F" || sexo == "f") {

		qtdAlturas.push(altura);
		alturaF = alturaF + altura;
		console.log(alturaF);
		pessoasF++;
		console.log(pessoasF);
		
	} else {

		if(sexo == "M" || sexo == "m") {

			qtdAlturas.push(altura);
			alturaM = alturaM + altura;
			console.log(alturaM);
			pessoasM++;
			console.log(pessoasM);
			
		}
	}

	totalPessoas++;
}

var mediaAlturaM = parseFloat((alturaM / pessoasM.toFixed(15)));

document.write("Altura MÉDIA dos Homens: " + pessoasM + "<br><br>");

document.write("Quantidade de Mulheres: " + pessoasF + "<br><br>");

var maiorAltura = Math.max.apply(null, qtdAlturas);

document.write("A MAIOR altura é: " + maiorAltura + "<br><br>");

var menorAltura = Math.min.apply(null, qtdAlturas);

document.write("A MENOR altura é: " + menorAltura + "<br><br>");