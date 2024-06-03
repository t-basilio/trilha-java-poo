package dispositivos.smartphone;

import dispositivos.navegador.NavegadorInternet;
import dispositivos.telefone.AparelhoTelefonico;
import dispositivos.tocador_musica.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o n° (" + numero + ") pelo IPhone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo IPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz pelo IPhone...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo o site (" + url + ") pelo IPhone...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma aba na internet pelo IPhone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página pelo IPhone...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música (" + musica + ") pelo IPhone...");
    }

    @Override
    public void tocar() {
        System.out.println("tocando música pelo IPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música pelo IPhone...");
    }
}
