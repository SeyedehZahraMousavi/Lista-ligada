Os métodos que devem ser implementados são:
(25% da nota da atividade)
• public static void demiteFuncionarios(LinkedList<Trabalhador> func)
o Método da classe _Aula6_ED responsável por remover funcionários
demitidos da lista encadeada func, que armazena objetos do tipo
Trabalhador.
o
o
o
o
•
•
•
O método deve solicitar repetidamente o ID do funcionário a ser
demitido, até que o usuário decida parar.
Se o funcionário for encontrado, ele deve ser removido e a mensagem
“Funcionário ID encontrado e removido com sucesso!” deve ser
exibida.
Se o funcionário não for encontrado, a mensagem “Funcionário ID
não foi encontrado!” deve ser exibida.
Um exemplo de execução está disponível no material da atividade.
(25% da nota da atividade)
public void concatena(LinkedList<T> lista)
o Método da classe LinkedList responsável por concatenar a lista
passada como parâmetro ao final da LinkedList original.
(25% da nota da atividade)
public boolean atualizaSalario(int id, double novoSalario)
o Método da classe LinkedList responsável por buscar um funcionário
pelo ID e atualizar seu salário.
o Se o funcionário existir, exibe a mensagem “Salário atualizado com
sucesso!”. Caso contrário, exibe “Funcionário não encontrado!”.
(25% da nota da atividade)
public LinkedList filtrarPorCargo(String cargo)
o Método da classe LinkedList responsável por retornar uma nova lista
contendo apenas os funcionários que possuem o cargo informado.
Exemplo de Saída Esperada
Abaixo está um exemplo da saída do programa após a execução com todos os
métodos implementados:
Lista inicial de funcionários:
[Lista]
L: [
[Trabalhador] Id: 1, sexo: M, idade: 25, cargo: Analista Jr., salário: 5000.0
[Trabalhador] Id: 2, sexo: M, idade: 22, cargo: Auxiliar Administrativo., salário: 3000.0
[Trabalhador] Id: 3, sexo: F, idade: 27, cargo: Analista Jr., salário: 5000.0
[Trabalhador] Id: 4, sexo: M, idade: 35, cargo: Programador Sr., salário: 7000.0
[Trabalhador] Id: 5, sexo: F, idade: 45, cargo: Gerente Jr., salário: 7000.0
[Trabalhador] Id: 6, sexo: M, idade: 51, cargo: Gerente Pleno, salário: 7500.0
