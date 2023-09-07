package ReprodutorMusical;
public class ReprodutorMusical implements Reprodutor {
    
    public void tocar(){
        System.out.println("Reproduzindo musica");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(){
        System.out.println("Musica Selecionada");
    }
}
