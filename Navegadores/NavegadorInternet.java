package Navegadores;
public class NavegadorInternet implements Navega{
    
    public void exibirPagina(){
        System.out.println("Carregando pagina");
        System.out.println("Exibindo pagina");
    }

    public void adicionarAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPágina(){
        System.out.println("Carregando página atualizada");
        System.out.println("Mostrando página atualizada");
    }
}
