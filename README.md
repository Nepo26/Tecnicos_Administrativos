# Técnicos-Administrativos
  Um repositório para o armazenamento de parte do projeto de AP2(Algoritmos e Programação 2).
  
## Intruções para o projeto
A classe *TecnicoAdministrativo* -que estende a classe *Empregado*- deve atender, dentre outras, às seguintes exigências:

* Não pode haver dois empregados técnico-administrativos que tenham a mesma
*matricula*;

* Os atributos *regimeEmprego*, *regimeRemuneracao*, *centroCusto*, *unidade* e
*departamento* devem estar entre os valores possíveis para cada um deles;

* O *NomeAbreviado* e o *NomeCompleto* de um técnico-administrativo não podem ser
vazios;

* Os valores valores máximos para os atributos *cargaHorariaDiaria*,
*cargaHorariaSemanal*, *cargaHorariaQuinzenal* e *cargaHorariaMensal* são, respectivamente:
10h, 44h, 100h e 250h. Pode-se preencher apenas um único deles, ou
seja, se for informada a carga horária mensal, então nenhum dos demais atributos
pode ser informado (ficarão com ZERO);

* Os atributos de remuneração são todos opcionais e, portanto, não há nenhuma restrição
aplicável a eles;

* O atributo *titulacaoMaxima* deve ter valor dentre um dos previstos na classe
*Titulacoes*;

* Há, obviamente, atributos e métodos adicionais que serão necessários, mas que não
foram inseridos pelo professor -cabe à equipe identificar quais são estes atributos
(e métodos), impondo-lhes as restrições necessárias.

## Dividimos o projeto nas seguintes partes :

  ### Implementação de **pesquisas** e dos métodos de **"controle"**
    Consta no pedido do trabalho :

    > Cada um dos módulos tem por objetivo principal realizar a completo
    > gerenciamento de seu ente. Portanto, o módulo deverá proporcionar funcionalidades que
    > permitam realizar operações como a inclusão (ou castramento), a alteração, a exclusão e a
    > consulta a objetos daquele ente.
    > A operação de pesquisa deve merecer especial atenção, pois normalmente os usuários
    > podem necessitar realizar pesquisa a partir de informações parciais. Explica-se: é frequente que
    > um usuário do sistema deseje realizar pesquisa num curso utilizando _"uma parte do nome do
    > curso"_, ou sabendo apenas que o curso está entre os cursos que já foram _"finalizados"_, ou seja,
    > que o curso não mais está sendo ofertado pela instituição.
    > Por consequência, cada equipe deverá preocupar-se , na medida do possível e razoável, em
    > ofertar ao usuário diferentes maneiras para realizar pesquisas.

    Fica dito que precisam de pessoas que implantem a questão relativa com os métodos de controle de objetos dos técnicos-administrativos, deve trabalhar em conjunto com o pessoal do **armazenamento de dados**

    **OBS.: Utilizar _regex_ não é má ideia**

  ### Armazenamento dos dados
    Pede-se que : 
    > Não é exigido que o módulo seja capaz de armazenar seus entes (acadêmicos,
    > cursos, disciplinas, ...) numa estrutura secundária de armazenamento (arquivos ou
    > bancos de dados). Portanto, todas as informações poderão ser armazenadas numa estrutura de
    > memória primária.

    Uma das possibilidades é armazenar os entes num objeto do tipo _ArrayList_. Seguindo esta
    sugestão, a declaração poderia ser realizada da seguinte maneira:

    ```java
    private static ArrayList <Curso> cursos;
    private static ArrayList <Academico> academicos;
    private static ArrayList <Docente> docentes;
    private static ArrayList <TecnicoAdministrativo> tecnicosAdministrativos;
    private static ArrayList <Disciplina> disciplinas;
    private static ArrayList <RegistroAcademico> historicos;
    ```
  ### Interface Gráfica & Tratamento de Eventos
     É dito que :
    > Quanto à interface a ser utilizada para interação usuário-SGA, não há nenhuma exigência
    > estabelecida, ou seja, a equipe poderá optar por desenvolver seu módulo utilizando uma interface
    > textual ou gráfica a critério exclusivo da opção da equipe.

    Portanto, ficando à escolha o que utilizar para a interface gráfica, seja _javaFX_, seja _Swing_, ou até mesmo ignorar a interface gráfica e fazer _CLI_.
    
  ### Conferir documentação
    Cabe a essa(s) pessoa(s) reverem o código de todos e conferirem a questão dos comentários, principalmente nos da documentação. Isso NÃO abstém os outros da tarefa de comentar e documentar. O responsável por essa área não poderá somente fazer isso, pois caso for feito isso corre o risco de o professor achar que fez de menos.

    SRecomendada a checagem do código diariamente.
    
  ### Testes e Tratamento de erros
    Cabe a essa(s) pessoa(s) a revisão de todo o código e promover rotinas de testes afim de encontrar exceções e possíveis erros. Caso os encontre, tentar resolvê-lo de forma imediata. Caso não os encontre, criar um issue, e marcá-lo como bug para que possamos todos tentar reproduzir o problema e encontrar uma solução.
