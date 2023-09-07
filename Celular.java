import AparelhosTelefonicos.Aparelho;
import Navegadores.Navega;
import ReprodutorMusical.Reprodutor;

public class Celular implements Aparelho, Navega, Reprodutor {

    public void tocar() {
        System.out.println("Reproduzindo musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }

    public void exibirPagina() {
        System.out.println("Carregando pagina");
        System.out.println("Exibindo pagina");
    }

    public void adicionarAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPágina() {
        System.out.println("Carregando página atualizada");
        System.out.println("Mostrando página atualizada");
    }

    public void ligar() {
        System.out.println("Ligando para contato");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
