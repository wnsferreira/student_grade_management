# Testes de Performance 

#TP1

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

> Você deve construir um programa simples para o controle acadêmico de uma instituição de ensino.

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


#TP2

No Teste de Performance 2, você vai colocar em prática as seguintes habilidades desenvolvidas durante as etapas 3 e 4:

Construir classes, atributos e métodos
Criar instâncias e realizar chamadas de métodos
Escrever construtores
Implementar sobrecargas de construtores e métodos
Implementar encapsulamento
Implementar herança
Implementar polimorfismo
Você deve criar outro módulo do programa de controle acadêmico para uma instituição de ensino. Agora, você vai utilizar os recursos da orientação a objetos em Java.

Para que o programa seja construído, você deverá instalar e configurar no seu computador o Java Development Kit, além do NetBeans, que contém os recursos necessários para compilar e executar o seu programa Java.

Ao ser iniciado, o programa deve exibir um menu com as seguintes opções:

[1] Cadastrar professor
[2] Cadastrar aluno
[3] Consultar situação de um docente/discente.
[4] Sair.
A estrutura do programa é composta por um vetor com 100 posições, de objetos da classe Pessoa. No seu cadastro, uma pessoa pode ser um professor ou um aluno. Ambos devem herdar atributos da classe Pessoa, mas também devem ter os seus atributos específicos.

O cadastro de professor e de aluno (opções 1 e 2 do menu) deve tratar a entrada de dados. Ao cadastrar um professor ou um aluno, o programa deve informar o código gerado, que é o índice do vetor. Esse índice deve viabilizar a consulta da situação de um docente/discente (item 3 do menu).

Ao realizar a consulta, o programa deve perguntar o código, e retornar a informação sobre o docente/discente pesquisado. Essa informação deve ser retornada a partir da chamada de um método consultarSituacao() da classe Pessoa, que deve ser implementada em Aluno e Professor com o retorno dos atributos gerais de uma pessoa, e os atributos específicos de cada classe, através do conceito de polimorfismo.

Os dados de uma pessoa, comuns ao aluno e ao professor, e os dados específicos de aluno e de professor serão criados por você. Você também deve criar métodos específicos para Aluno e Professor. Desenvolva construtores para as classes. Crie sobrecargas de construtores e de métodos. Pense em dar mais opções ao cliente das classes.

Defina os atributos privados para cada classe, segundo a sua concepção, e métodos públicos get e set para todos os atributos, seguindo os padrões de encapsulamento. Fique atento à utilização de modificadores protected na classe Pessoa para que Aluno e Professor tenham acesso.

Finalmente, crie uma classe que deve conter o método main para a execução do programa e realize alguns testes para demonstrar o funcionamento dele, instanciando os objetos e realizando chamadas de métodos.


#TP3

No Teste de Performance 3, você vai colocar em prática as seguintes habilidades desenvolvidas durante as etapas 5 e 6:

Escrever o tratamento de exceções com try/catch/finally
Escrever o lançamento de exceções com throws/throw
Compreender e utilizar a hierarquia de exceções do Java
Utilizar os construtores com parâmetros da classe String
Utilizar os métodos da classe String
Compreender as principais diferenças entre as classes String e StringBuilder
Utilizar os métodos da classe StringBuilder
Você deve incrementar o programa de controle acadêmico para uma instituição de ensino que você construiu até aqui. Agora, você vai implementar o tratamento de erros e manipular strings em Java.

Para que o programa seja construído, você deverá instalar e configurar no seu computador o Java Development Kit, além do NetBeans, que contém os recursos necessários para compilar e executar o seu programa Java.

A estrutura do programa deve ser mantida. Percorra o código do seu programa, com o foco em possíveis erros que ele pode lançar. Por exemplo, suponha que uma opção acima da permitida no menu seja digitada, ou que o vetor exceda o limite, ou que uma string seja informada quando o valor solicitado é um inteiro.

Verifique e trate esses casos usando try, catch e finally. O finally é opcional, mas você deve utilizar pelo menos uma vez em seu programa. Escolha duas exceções não verificadas e trate em seu código. Além disso, crie sua própria classe de exceção e trate dentro do seu programa usando throws e throw.

Neste teste, você também deve tratar os nomes do professores e alunos que são informados no programa. Crie nos objetos atributos referentes a nome, nome do meio e último nome. Instancie objetos da classe String variando a utilização de seus construtores.

Você deve receber do usuário os nomes completos, mas separá-los para armazenar nas variáveis correspondentes. Você deve fazê-lo de duas formas no programa: a primeira utilizando os métodos substring e indexOf, e a segunda utilizando split. Implemente as duas formas nos métodos sets das classes e realize testes elas.

Para retornar as informações, implemente o uso da classe StringBuilder e seu método append para concatenar o nome completo e informar ao usuário quando o método consultarSituacao for chamado.

