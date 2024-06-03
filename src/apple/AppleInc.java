package apple;

import dispositivos.navegador.Chrome;
import dispositivos.navegador.NavegadorInternet;
import dispositivos.smartphone.IPhone;
import dispositivos.telefone.AparelhoTelefonico;
import dispositivos.telefone.Nokia;
import dispositivos.tocador_musica.IPod;
import dispositivos.tocador_musica.ReprodutorMusical;

public class AppleInc {
    public static void main(String[] args) {

        IPhone iphone = new IPhone();

        Nokia nokia = new Nokia();
        Chrome chrome = new Chrome();
        IPod ipod = new IPod();

        AparelhoTelefonico celular = iphone; // pode ser um nokia
        NavegadorInternet browser = iphone; // pode ser um chrome
        ReprodutorMusical player = iphone; // pode ser um ipod

        celular.ligar("11 93210-1234");
        browser.exibirPagina("https://web.dio.me");
        player.selecionarMusica("November rain");
    }
}
