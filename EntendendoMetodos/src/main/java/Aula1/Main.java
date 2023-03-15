package Aula1;

public class Main {
    public static void main(String[] args) {
    //Calculadora
    System.out.println("Exercicio calculadora");
    Calculadora.soma(3, 6);
    Calculadora.subtracao(9, 6);
    Calculadora.multiplicacao(7, 7);
    Calculadora.divisao(9, 3);
    
    //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        
    //Emprestimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
