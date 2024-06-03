package dispositivos.tocador_musica;

public class IPod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA...");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("SELECIONADO MÚSICA...(%s)%n", musica);
    }

}
