public class Principal {
    public static void main(String[] args) {
        Televisor tv = new Televisor(0, 0, false);
        ControleRemoto controle = new ControleRemoto(tv);

        System.out.println(tv.toString());
        
        controle.ligar();
        controle.trocarCanal(12);
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.desligar();

        System.out.println(controle.toString());
    }
}
