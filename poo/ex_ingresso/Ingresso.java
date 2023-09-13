package poo.ex_ingresso;

public class Ingresso extends Evento implements Meia_entrada, Vip{

    public Ingresso(String artista, String data, String hora, String local, Float valor){
        super(artista, data, hora, local, valor);
        
    }

    @Override
    public void vender(){
        System.out.println("Vendendo ingresso");
    }

    @Override
    public void metade(){
        System.out.println("Pague metade do preco.");
    }

    @Override
    public void taxa(){
        System.out.println("Pague uma taxa.");
    }

    @Override
    public void Visualizar() {
        super.Visualizar();
    }

}
