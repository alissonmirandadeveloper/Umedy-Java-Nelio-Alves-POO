package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppAlturas_v2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AlturaService service = new AlturaService();

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadePessoas = sc.nextInt();

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(nome, idade, altura);
            service.adicionarPessoa(pessoa);
        }

        double alturaMedia = service.calcularAlturaMedia();
        double percentual = service.calcularPorcentagem16();

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);

        List<Pessoa> menoresDe16 = service.obterMenoresDe16Anos();
        for (Pessoa menor : menoresDe16) {
            System.out.println(menor.getNome());
        }

        sc.close();
    }

}

class Pessoa{
    private String nome;
    private int idade;
    private double altura;

    Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}

class AlturaService {
    private List<Pessoa> pessoas;

    public AlturaService(){
        pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public double calcularAlturaMedia() {
        double somaAlturas = 0;
        for (Pessoa pessoa : pessoas) {
            somaAlturas += pessoa.getAltura();
        }
        return somaAlturas / pessoas.size();
    }

    public List<Pessoa> obterMenoresDe16Anos() {
        List<Pessoa> menores = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if(p.getIdade() < 16){
                menores.add(p);
            }
        }
        return menores;
    }

    public double calcularPorcentagem16(){
        int nMenores = obterMenoresDe16Anos().size();
        return ((double) nMenores / pessoas.size()) * 100.0;
    }
}