SaveTheRopa S.A é uma empresa que deseja implementar um sistema de vestiário computadorizado em todo o mundo. O sistema permite que uma pessoa guarde seus pertences no armário e os recupere facilmente, bastando apresentar o número de identificação que recebeu ao guardá-los.


Os pertences são representados no sistema por algo abstrato chamado de peça de roupa, que tem uma marca e um modelo, de modo que, se a pessoa perder o número, ela também poderá, em algum momento, reivindicá-lo com essas informações. No entanto, a reivindicação será modelada em outro momento. Para a primeira implementação do guarda-roupa, precisamos fazer o seguinte:



Crie a classe de roupa que contém os atributos marca e modelo.

Crie a classe GuardaRopa que contém como atributos um dicionário (ou MAP) e um contador a ser usado como identificador. As chaves do dicionário serão do tipo inteiro e, como valor, uma lista de roupas.

Crie o método public Integer guardarRoupas(List<Roupa> listaDeRoupas), na classe GuardaRopa, que recebe uma lista de peças de vestuário e retorna o número identificador ao qual as peças de vestuário foram atribuídas, ou seja, a chave do dicionário onde as peças de vestuário estão armazenadas.

Crie o método público void mostrarRoupas() na classe GuardaRopa que imprime na tela todas as roupas deixadas no guarda-roupa junto com o número correspondente.

Crie o método público List<Roupa> devolverRoupa (Integer number), na classe GuardaRoupa, que retorna a lista de roupas armazenadas sob esse número.

Crie um cenário na classe Main em que alguém salva duas peças de roupa, recebe o código e, em seguida, consulta as peças de roupa salvas.