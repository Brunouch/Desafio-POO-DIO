import java.util.Scanner;

import AparelhosTelefonicos.Aparelho;
import AparelhosTelefonicos.AparelhoTelefonico;
import Navegadores.Navega;
import Navegadores.NavegadorInternet;
import ReprodutorMusical.Reprodutor;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone  {
    
    public static void main(String[] args) {
        Celular celular = new Celular();
        Reprodutor reprodutor = celular;
        Navega navega =celular;
        Aparelho aparelho = celular;
                
        int op = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja navegar em qual parte do celular");
        System.out.println("1->Reprodutor de música");
        System.out.println("2->Navegador de internet");
        System.out.println("3->Aparelho telefonicos");
        op = scan.nextInt();
        while(op!=0 && op <=3){ 
            if(op == 1){
                celular.selecionarMusica();
                celular.tocar();
                System.out.println("Quando acabar a musica, pausa automatica na reprodução");
                celular.pausar();
            }else if(op == 2){
                celular.adicionarAba();
                celular.exibirPagina();
                System.out.println("Erro Pagina travada");
                celular.atualizarPágina();
            }else if(op == 3){
                celular.ligar();
                celular.iniciarCorreioVoz();
                System.out.println("Chamada encerrada");
                System.out.println("Recebendo chamada");
                celular.atender();
            }else{
            System.out.println("Saindo");
            break;
            }
            System.out.println("Deseja navegar em qual parte do celular");
            System.out.println("1->Reprodutor de música");
            System.out.println("2->Navegador de internet");
            System.out.println("3->Aparelho telefonicos");
            op = scan.nextInt();
        }
       

        
    }
}
