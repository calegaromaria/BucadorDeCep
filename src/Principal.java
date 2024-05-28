import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("digite um número de CEP para a consulta");
        var cep = leitura.nextLine();


        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.SalvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("finalizando");
        }
    }
}