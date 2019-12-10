# Estrutura de dados e algoritmos

##### O objetivo deste repositório é armazenar testes e exemplos de uso de algumas das estruturas de dados mais famosas e de alguns algoritmos comuns.

___

## Build && Tests

`mvn clean install`

___

## LinkedList
Diferentemente da matriz, um LinkedList possui uma cadeia de nós, formando uma lista.

Cada nó tem um objeto e a referência ao próximo nó.

O primeiro objeto da lista é chamado de cabeça e a última cauda (a cauda não tem referência ao próximo nó).

Por padrão, um LinkedList possui as seguintes características:

- Os métodos get e set usam um O (n)
- Os métodos de inserção e exclusão usam um O (1)
- Não permite acesso aleatório

##### Classe para os Testes

Para os testes foram abordado as seguintes condições seguindo a regra acima:

1. Adicionado 3 valores na lista e verificado se o valor foi o último ou o primeiro.
2. Apenas 1 valor de lista e verificado se ele corresponde ao primeiro.
3. Adicionar no final, verificado se ao adicionar a lista o valor adicionado no final está correto.
4. Tamanho dos valores: Vazio, adicionando um ou mais valores (Análise do valor limite).
5. Adicionando e depois removendo valores da lista.
6. Verificando se a lista contém o valor informado.
7. Apagado o valor da lista e verificado se ele existe.
8. Removido do primeiro e do último e verificado se está correto.

```$xslt
LinkedListTest.java
``` 

## HashTable

HashTable é um objeto que usa uma matriz de nós com chave e valor e uma referência ao próximo nó
(seguindo a lógica de uma LinkedList) para evitar conflitos de índice.

Quando há um conflito de índice na inserção de um objeto em uma HashTable, por padrão,
o objeto com essa chave é recuperado e o novo objeto é inserido no **próximo** campo,
criando assim uma referência entre os objetos (padrão LinkedList).

Por padrão, a Fila possui as seguintes características:
- O método de inserção é chamado de colocar recebendo como parâmetros a chave e o valor
- O método de recuperação é chamado de get recebendo como parâmetro a chave

##### Classe para os Testes

Seguindo o padrão de *key:value* foi verificado as seguintes condições nos testes:

1. Adicionado os valores a essa lista e verificado se os obtém através da *key* com êxito.
2. Adicionado valores repetidos *colisão* e verificado se o retorno está correto.

```$xslt
HashTableTest.java
``` 

___

## Memoization (Fibonacci)

Memoização é uma estratégia usada para otimizar a recursão .

Essa estratégia consiste em criar uma matriz e indexar os resultados recursivos.

Por exemplo, um algoritmo de Fibonacci puramente recursivo foi criado e outro usando Memoization e um teste foi realizado comparando o tempo de execução de cada um.

##### Classe para os Testes

Como a sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
cada termo subsequente é obtido pela soma dos dois termos predecessores foi feito o seguinte:

- Análise do valor limite: Passado como parâmetro os valores para ambos os métodos (recursivo e de memorização)
e verificado se retornou o valor correto.

Ex: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

```$xslt
FibonacciTest.java
```
___

## Sorting Algorithms (Algoritmos de classificação)

Existem 3 algoritmos básicos para classificação e são eles:
- Tipo de bolha (Bubble Sort)
- Mesclar classificação (Merge Sort)
- Ordenação rápida (Quick Sort)

Abaixo vou explicar melhor cada um:

#### Bubble Sort (Tipo de bolha)
A estratégia usada pelo algoritmo de classificação de bolhas é comparar um objeto com o **próximo** na lista.

Essa abordagem é funcional, mas **não muito performática**, pois é um algoritmo com uma característica de tempo de execução **O(n^2)**

##### Classe para os Testes

Para os testes foram abordado as seguintes condições:

- Passado o array `{5, 1, 4, 2, 8}` e verificado se foi ordenado de forma sequencial e se o índice do array está correto.
- Verificado tempo de execução.

```$xslt
BubbleSortTest.java
``` 
___

#### Merge Sort (Mesclar classificação)

A estratégia usada pelo algoritmo Merge Sort consiste em **dividir a matriz em 2 partes**, até apenas em objetos isolados.

Os objetos isolados são comparados, ordenados e reagrupados em sequência (como uma mesclagem).

##### Classe para os Testes

Para os testes foram abordado as seguintes condições:

- Passado o array `{4, 7, 14, 1, 3, 9, 17}` e verificado se foi ordenado de forma sequencial e se o índice do array está correto.
- Verificado tempo de execução.

```$xslt
MergeSortTest.java
``` 
___

#### Quick Sort (Ordenação rápida)
A estratégia usada pelo algoritmo de classificação rápida é determinar um ponto focal,
chamado **pivô** (geralmente o objeto do meio da matriz, **mas isso não é uma regra**),
recuperar o primeiro e o último objeto (chamando à esquerda à direita) e compare os valores com o valor de pivô.

Objetos maiores que o pivô **se moverão para a direita** e **objetos menores para a esquerda**.

No final desta comparação, o algoritmo separa a lista em 2 listas e repete o mesmo processo até que todos os objetos sejam classificados.

Esse algoritmo é bastante perfomático e é classificado com a característica de tempo de execução **O (n log n)** e dos
três tipos apresentados é o **mais performatico**.

###### Test Class

Para os testes foram abordado as seguintes condições:

- Passado o array `{15, 3, 2, 1, 9, 5, 7, 8, 6}` e verificado se foi ordenado de forma sequencial e se o índice do array está correto.
- Verificado tempo de execução.

```$xslt
QuickSortTest.java
``` 
___

## Stack (Pilha)
A pilha segue a mesma lógica de um LinkedList, mas eles têm algumas peculiaridades.

Por padrão, as pilhas têm o comportamento **LIFO ( último a entrar, primeiro a sair )**,
onde o último objeto inserido na pilha é o primeiro a sair.

Por padrão, o Stack tem as seguintes características:
- O método de inserção é chamado **push**
- O método para remoção é chamado **pop**
- O método para obter a ** cabeça ** (último objeto inserido) é chamado de espiada
___
    
## Queue (Fila)
A fila segue a mesma lógica que um LinkedList, mas eles têm algumas peculiaridades.

Por padrão, as pilhas têm o comportamento **FIFO (primeiro a entrar, primeiro a sair )**,
em que o primeiro objeto inserido na fila é o primeiro a sair.

Por padrão, a Fila possui as seguintes características:
- O método de inserção é chamado de **add**
- O método para remoção é chamado **remove**
- O método para obter a **head**  (primeiro objeto inserido) é chamado de espiar (**peek**)
    
___

## Retorno obtido:

```java
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running datastructure.linkedlist.LinkedListTest
Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.056 sec
Running datastructure.hashtable.HashTableTest

[0] = datastructure.hashtable.HashTable$HashEntry@7591083d -> datastructure.hashtable.HashTable$HashEntry@77a567e1
[1] = datastructure.hashtable.HashTable$HashEntry@736e9adb
[2] = datastructure.hashtable.HashTable$HashEntry@6d21714c
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec
Running algorithms.memoization.FibonacciTest
elapsedTime = 141
elapsedTime = 0
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 141.601 sec
Running algorithms.sort.BubbleSortTest

 --- BubbleSort array ---
1 2 4 5 8 Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec
Running algorithms.sort.QuickSortTest

 --- QuickSort array ---
1
2
3
5
6
7
8
9
15
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 sec
Running algorithms.sort.MergeSortTest

 --- MergeSort array ---
1 3 4 7 9 14 17 Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 sec

Tests run: 19, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ datastructure-algorithms ---
[INFO] Building jar: /home/christian/ECP/Engenharia de Software 2/data-structures-and-algorithms/target/datastructure-algorithms-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ datastructure-algorithms ---
[INFO] Installing /home/christian/ECP/Engenharia de Software 2/data-structures-and-algorithms/target/datastructure-algorithms-1.0-SNAPSHOT.jar to /home/christian/.m2/repository/com/christiantusset/datastructure-algorithms/1.0-SNAPSHOT/datastructure-algorithms-1.0-SNAPSHOT.jar
[INFO] Installing /home/christian/ECP/Engenharia de Software 2/data-structures-and-algorithms/pom.xml to /home/christian/.m2/repository/com/christiantusset/datastructure-algorithms/1.0-SNAPSHOT/datastructure-algorithms-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  02:27 min
[INFO] Finished at: 2019-12-10T20:38:10-03:00
[INFO] ------------------------------------------------------------------------
```

###### By [Christian Tusset]