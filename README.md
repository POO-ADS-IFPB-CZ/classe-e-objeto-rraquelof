[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/4j22Em04)
## Questão 1
A imagem abaixo representa o modelo pensado para representar um lâmpada em um supermercado.

A lâmpada possui os atributos: potência, marca, quantidade e preço.

A lâmpada possui os métodos: acende e apaga.

![image](https://github.com/user-attachments/assets/5b1dc5d1-a595-465d-b0c8-bfa87024e554)

## Questão 7
**Erros**:
- Não é possível criar uma classe em Java com espaços no nome, por convenção o nome deve seguir o padrão _camel case_, o nome da classe deveria ser "RegistroDeEleitor".
- Ausência de encapsulamento: quando os atributos não possuem modificadores de acesso o java utiliza o modificador padrão que permite acesso apenas por outras classes no mesmo pacote.
- Ausência de um construtor: o java utilizará o construtor padrão porém é recomendado declarar construtores.

## Questão 8
**Erros**:
- Nome da classe: Tecnicamente não há nada errado com o nome "Teste2" porém é recomendado usar nomes significativos, por exemplo, "ComparadorNumeros".
- Ausência de encapsulamento: não possuem modificadores de acesso, nem métodos getter e setter.
- Método "maior": O método foi declarado para retornar um valor do tipo int, porém está retornando um valor do tipo boolean.

  As duas opções abaixo funcionariam.

  Método "maior" retornando int:
    ```
    int maior() {
      if (num1 > num2)
          return num1;
      else 
          return num2;
    }
    ```

    Método "maior" retornando boolean:
  ```
  boolean maior() {
    return num1 > num2;
  }
  ```
- Método "menor": O método é declarado como void, porém retorna int.
  
     Opções para corrigir:
    
    Retornando int:
    ```
    int menor() {
      if (num1 < num2)
          return num1;
      else 
          return num2;
    }
    ```

    Retornando texto:
    ```
    void menor() {
    if (num1 < num2)
        System.out.println(num1);
    else 
        System.out.println(num2);
    } 
    ```

    ## Questão 14
    O encapsulamento tem a função de ocultar os detalhes internos de uma classe, isso é feito tanto para atributos quanto para métodos da classe através dos modificadores de acesso(private,protected,public,etc...).

  - Exemplo:
  Os atributos da classe lâmpada são somente acessíveis dentro da classe, isso ajuda a proteger informações sensíveis.

  
  ```
  public class Lampada {
    private int potencia;
    private String marca;
    private int quantidade;
    private double preco;
    private boolean aceso;
  }
  ```
  - Exemplo:
  No método abaixo há a verificação se a idade não é negativa.
  
  Dentro dos métodos getters e setters também é possível implementar validações.

  ```
   public void setIdade(int idade) {
      if (idade >= 0) { // Garantir que a idade não seja negativa
          this.idade = idade;
      } else {
          System.out.println("Idade inválida!");
      }
    }
  ```
