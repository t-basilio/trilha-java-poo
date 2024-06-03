package dispositivos.navegador;

public class Chrome implements NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("ABRIR PÁGINA DO SITE: " + url + "...");
    }
    @Override

    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA...");
    }

}
