package dispositivos.telefone;

public class Nokia implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O N°: " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("ABRINDO CORREIO DE VOZ...");
    }


}
