public class Televisor {
    private String canal;
    private int volume;
    private boolean ligado;

    public Televisor(String canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = false;
    }

    // metodo

    public boolean ligar(){
        if(ligado = false){
            ligado = true;
            return true;
        }
        else{
            System.out.println("A televisão já está ligada");
        }
        return false;
    }

    public boolean desligar(){
        if(ligado = true){
            ligado = false;
            return false;
        }
        else{
            System.out.println("A televiãos já está desligada");
        }
        return false;
    }

    public void aumentarVolume(){
        if(volume < 100 && volume > 0){
            volume ++;
        }
    }

    public void diminuirVolume(){
        if(volume >= 100 && volume <= 0){
            volume --;
        }
    }

    public String toString(){
        return"A televião esta: "+ligado+
        " || No canal: "+canal+;
    }
}
