package poo.ex_ingresso;

public class Evento {
    public static void main(String[] args) {
        
    }
    String artista, data, hora, local;
    Float valor;

    public Evento(String artista, String data, String hora, String local, Float valor) {
        this.artista = artista;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.valor = valor;
    }

    public void Visualizar(){
        System.out.println("Artista: " + this.artista);
        System.out.println("\n Data: " + this.data);
        System.out.println("\n Hora: " + this.hora);
        System.out.println("\n Local: " + this.local);
        System.out.println("\n Preço R$: " + this.valor);
    }  

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
}


    