# Teste de Performance 1

No Teste de Performance 1, você vai colocar em prática as seguintes habilidades desenvolvidas durante as etapas 1 e 2:

Instalar programas necessários para o ambiente de desenvolvimento Java no computador
Realizar configurações extras no ambiente de desenvolvimento
Conhecer a estrutura básica de um programa Java
Compilar um programa
Corrigir erros no código
Executar um programa
Implementar a estrutura de um programa básico em Java
Implementar o uso de váriáveis
Implementar o uso de estruturas condicionais
Implementar o uso de estruturas de repetição
Implementar o uso de vetores

Você deve construir um programa simples para o controle acadêmico de uma instituição de ensino.

Ao ser iniciado, o programa deve exibir um menu com as seguintes opções:

[1] Registrar as notas de um novo aluno.
[2] Consultar boletim de um aluno.
[3] Consultar notas da turma.
[4] Sair.
A estrutura de dados do programa consiste em três vetores com 100 posições cada. Isso quer dizer que o programa permite o registro de 100 alunos. Cada aluno possui um registro nos três vetores, acessados pelo mesmo índice.

Quando o primeiro aluno for registrado, a partir da opção 1 do menu, o programa deve solicitar ao usuário o nome, a nota da AV1 e a nota da AV2. Por exemplo, quando o primeiro registro for realizado, o nome “Fulano” pode ser armazenado na posição 0 do vetor de nome, a nota 9.5 pode ser armazenada na posição 0 do vetor da AV1 e a nota 7.5 pode ser armazenada na posição 0 do vetor da AV2. Após a gravação, o programa deve informar ao usuário que o registro foi feito com o código 0.

Quando um novo aluno for registrado, o programa deve verificar qual a próxima posição a ser ocupada nos vetores. Se todas as posições forem ocupadas, o programa deve informar ao usuário uma mensagem informando sobre a impossibilidade de inserir novo registro.

Caso a opção 2 seja escolhida, então o programa deve solicitar ao usuário o código informado no registro do aluno para que ele possa ser consultado. O programa deve exibir na tela o nome e as notas do aluno, além da média final e da situação do aluno. Se a média entre as notas da AV1 e da AV2 for:

Inferior a 4, imprimir a situação "Reprovado";
Igual ou superior a 4 e menor que 7, imprimir a situação "Prova final";
Igual ou superior a 7, imprimir a situação "Aprovado".
Por exemplo, se o programa for executado informando as notas 5.5 e 7.5, então o programa deverá imprimir na tela:

Nome do aluno: Beltrano

Nota da AV1: 5.5

Nota da AV2: 7.5

Média final: 6.5

Situação: Prova final

Se a opção 3 for escolhida no menu do programa, então o programa deverá imprimir na tela todos os alunos, seguindo as mesmas condições para impressão do boletim, exceto pelo fato de que o programa não deve solicitar o código, já que vai imprimir todos os registros.