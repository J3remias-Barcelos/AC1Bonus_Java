package org.example;

public class Main {
    public static void main(String[] args) {

        // Crie um projeto chamado ed-ac1
        //
        //
        //O projeto não será entregue, mas você deverá copiar e colar partes do código para esta questão no Moodle.
        //
        //Não corrigirei código entregue no formato .zip de projeto.
        //
        //Apenas corrigirei os códigos copiados para o Moodle.
        //
        //Faça upload do print do diagrama de classes.
        //
        //Leia atentamente todo o enunciado antes de começar a codificar!
        //
        //Leia também os itens (a), (b), (c), (d) que descrevem o código a ser colado no Moodle, antes de começar a codificar!
        //
        //Atenção para o padrão de nomenclatura ao codificar!
        //
        //Imagine o seguinte cenário: uma empresa tem funcionários e acionistas. Os funcionários ganham um bônus da empresa, calculado sobre o valor do salário do funcionário. Os acionistas também ganham um bônus da empresa, calculado sobre o valor das ações que eles possuem.
        //
        //Nessa empresa, há 2 tipos de funcionários: o que ganha um salário mais hora extra e o que ganha por hora trabalhada.
        //
        //Suponha que no sistema da empresa deva ter uma classe FuncionarioHoraExtra, com atributos codigo, nome, salario, qtdHoraExtra, valorHoraExtra, um método getGanho() e um método getValorBonus(), que calcula e retorna o bônus do funcionário, que é 15% do seu ganho. O ganho desse funcionário é calculado somando o salário com o valor que ele ganha de hora extra (qtdHoraExtra multiplicado por valorHoraExtra).
        //
        //Nesse mesmo sistema deve ter uma classe FuncionarioHorista, com atributos codigo, nome, qtdHora, valorHora, um método getGanho() e um método getValorBonus(), que calcula e retorna o bônus desse funcionário, que é 10% do seu ganho. O ganho desse funcionário é calculado multiplicando-se qtdHora pelo valorHora.
        //
        //Suponha também, que neste mesmo sistema, deve haver uma classe Acionista, com atributos nome, quantidade de ações, preço da ação, e um método getValorBonus(), que calcula e retorna o bônus do acionista, que é 20% do valor total de suas ações.
        //
        //Neste sistema, também há uma classe ControleBonus, que controla quanto a empresa está gastando em bônus para os funcionários e os acionistas. Essa classe disponibiliza um método que retorna o total gasto em bônus com todos os funcionários e acionistas. Para fazer esse cálculo, essa classe deseja manter em ArrayList os objetos correspondentes a funcionários e acionistas.
        //
        //Pela regra da empresa, um Acionista não pode ser um Funcionario e um Funcionario não pode ser um Acionista.
        //
        //Pela descrição acima, as classes FuncionarioHoraExtra, FuncionarioHorista e Acionista apresentam um método de mesmo nome. Com base no que estudamos, qual a melhor forma de “forçar” que essas classes implementem o método getValorBonus() ? Interface ou classe abstrata?
        //
        //As classes FuncionarioHoraExtra e FuncionarioHorista apresentam um método getGanho(). Qual a melhor forma de "forçar" que essas 2 classes implementem o método getGanho()? Interface ou classe abstrata?
        //
        //Implemente a sua solução de acordo com a sua resposta e também de forma que demonstre a reutilização de código, grande vantagem da POO.
        //
        //Você deverá implementar as classes descritas acima com os atributos encapsulados, o construtor, e o toString(), sendo que o toString() deve retornar também o valor do bônus ganho. A classe ControleBonus não precisa ter o toString().
        //
        //Implemente também a classe abstrata e/ou interface que julgar necessário.
        //
        //Não se esqueça de implementar a classe ControleBonus, com os atributos e métodos que julgar necessário.
        //
        //A classe ControleBonus deve ter (esses métodos devem constar no diagrama):
        //-  o método que adiciona objetos na lista,
        //- o método que calcula e retorna o total gasto com bônus,
        //- e também o método que exibe todos os objetos que ganham bônus.
        //
        //Implemente também nesse projeto uma classe executável. Crie objetos das classes criadas e chame os seus métodos.
        //
        //Na verdade, não é necessário codificar todo o projeto, mas somente o código solicitado nos itens (a), (b), (c), (d). Só é necessário implementar tudo, se você quiser testar seu código.
        //
        //Desenhe o diagrama de classes correspondente a este projeto e entregue o  print do diagrama no link abaixo.
        //
        //Códigos solicitados. Devem ser copiados no quadro abaixo. Favor colocar (a), (b), etc antes do código copiado.
        //
        //(a) Se julgou que deve ter interface ou classe abstrata, copie e cole o código da interface ou classe abstrata no quadro abaixo. Se julgou que deve ter os 2, cole o código dos 2.
        //
        //(b) Escolha UMA (APENAS UMA) das classes concretas que implementa um ou 2 métodos abstratos e copie e cole seu código no quadro abaixo. (Classes concretas que implementam um ou 2 métodos abstratos: FuncionarioHoraExtra, FuncionarioHorista, Acionista. Escolha uma dessas 3 e cole o código inteiro dela)
        //
        //(c) Tirando a classe concreta do item (b), copie e cole as implementações dos métodos abstratos das outras 2 classes concretas. Coloque o nome da classe e em seguida o código do método ou dos métodos (que são implementação do método abstrato)
        //(d) Copie e cole o código da classe ControleBonus.
    }
}