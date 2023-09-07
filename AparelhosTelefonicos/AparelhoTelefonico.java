package AparelhosTelefonicos;
public class AparelhoTelefonico implements Aparelho {
    
    public void ligar(){
        System.out.println("Ligando para contato");
    }

    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
