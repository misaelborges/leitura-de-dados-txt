# Leitura de dados txt

Um projeto Java que lê dados de produtos a partir de um arquivo CSV, calcula a média de preços e exibe os nomes dos produtos com preços abaixo da média em ordem decrescente.

## Tabela de Conteúdos

- [Descrição](#descrição)
- [Instalação](#instalação)
- [Uso](#uso)
- [Exemplo de Arquivo](#exemplo-de-arquivo)
- [Saída Esperada](#saida-esperada)

## Descrição

Este projeto tem como objetivo demonstrar a leitura de dados de um arquivo, processamento de informações e filtragem de resultados com base em uma condição específica. Ele foi desenvolvido utilizando Java e suas bibliotecas padrão.

## Instalação

1. Clone este repositório:
    ```bash
    git clone https://github.com/misaelborges/leitura-de-dados-txt.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd leitura-de-dados-txt
    ```
3. Compile o projeto:
    ```bash
    javac Main.java
    ```

## Uso

1. Execute o projeto:
    ```bash
    java Main
    ```
2. Quando solicitado, insira o caminho do arquivo CSV contendo os dados dos produtos. Exemplo:
    ```
    C:\Users\User\Desktop\in.txt
    ```
## Exemplo de Arquivo

O arquivo CSV deve ter a seguinte estrutura:

```plaintext
Tv,900.00
Mouse,50.00
Tablet,350.50
HD Case,80.90
Computer,850.00
Monitor,290.00
```

## Saída Esperada

O programa calculará a média dos preços dos produtos e exibirá os nomes dos produtos cujo preço está abaixo da média, ordenados em ordem decrescente:
```plaintext
média de preço: 420,23
Tablet
Mouse
Monitor
HD Case
```

## Exception

Caso você passe um valor errado no caminho do arquivo, sera lançado uma exeção generica. Exemplo:
```plaintext
C:\Users\User\Desktop\in
```

Mesagem lançada: 
```plaintext
Erro: C:\Users\User\Desktop\in (o sistema não pode encontrar o arquivo especificado)
```
