# Hello World e recursos de algumas linguagens funcionais

JS Funcional

Com ES5:

var greeting = function(greet) {
    return function(name) {
        return greet + ' ' + name;
    };
};

var hello = greeting('Hello');
hello('World'); // Hello World


Com ES6:

const greeting = greet => name => greet + ' ' + name;
const hello = greeting('Hello');

hello('World'); // Hello World


Funcional
Funções de primeira classe
No JavaScript as funções são de primeira classe, isto é, são objetos que possuem propriedades e métodos, e podem ser passados como argumentos, serem atribuídos a variáveis ou retornados como qualquer outro objeto.

Funções aninhadas
Funções 'internas' ou 'aninhadas' são funções definidas dentro de outras funções. São criadas cada vez que a função que as contém (externa) é invocada. Além disso, o escopo da função externa, incluindo constantes, variáveis locais e valores de argumento, se transforma parte do estado interno de cada objeto criado a partir da função interna, mesmo depois que a execução da função interna é concluída.

Fechamentos
JavaScript permite que funções aninhadas sejam criadas com o escopo léxico no momento de sua definição e possui o operador () para invocá-las em outro momento. Essa combinação de código pode ser executado fora do escopo no qual foi definido, com seu próprio escopo durante a execução.

_____________________________________________________________________
Pascal

program HelloWorld;

begin
  writeln('Hello World');
end.

_____________________________________________________________________
Haskell

Arquivo do tipo helloworld.hs

main = putStrLn "Hello World!"

É uma linguagem funcional baseada quase que totalmente no cálculo lambda

Portabilidade: trabalha em diversos tipos de arquiteturas e sistemas operacionais. Interpretadores ou compiladores Haskell "rodam" em quase todo hardware ou sistema operacional existente.

_____________________________________________________________________
Scheme

(define hello-world
  (lambda ()
    (begin
      (write 'Hello-World)
      (newline)
      (hello-world)))) 


Com loop:

(define hello-world
  (lambda ()
    (display "Hello, World!")
    (newline)
    (hello-world)))
(hello-world)

_____________________________________________________________________
Hello World em C

#include "stdio.h" //O include nos permite utilizar o printf e o scanf por exemplo, e o stdio.h é uma biblioteca que agrupa um conjunto de funções básicas.

int main() {

  printf("Hello World!!"); 
  return 0; //Nos retorna que o programa foi executado com sucesso.
}