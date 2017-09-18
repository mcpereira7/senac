package atividade03;

/**
 * Classe Pessoa usada no exercicio 1
 *
 */
public class Pessoa {

    String nome;
    String endereco;
    String telefone;

    void salvarDados(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
