import entity.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho para o arquivo: ");
        String path = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            List<Produto> produtos = new ArrayList<>();

            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                produtos.add(new Produto(campos[0], Double.parseDouble(campos[1])));
                linha = bufferedReader.readLine();
            }

            Double media = produtos.stream()
                    .map(Produto::getPrice)
                    .reduce(0.0, Double::sum) / produtos.size();

            System.out.println("média de preço: " + String.format("%.2f", media));

            List<Produto> nomeProduto = produtos.stream()
                    .filter(produto -> produto.getPrice() < media)
                    .sorted(Comparator.comparing(Produto::getName).reversed())
                    .toList();

            for (Produto produto : nomeProduto) {
                System.out.println(produto.getName());
            }

        } catch (IOException e) {
            throw new RuntimeException(String.format("Erro: %s (o sistema não pode encontrar o arquivo especificado)", path));
        }
    }
}
