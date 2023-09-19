package projetos.pet_hotel;

import projetos.pet_hotel.Hospedagem;
import java.util.ArrayList;
import java.util.List;
import projetos.pet_hotel.HospRepository;

public class HospController implements HospRepository{

    private ArrayList <Hospedagem> listaHospedes = new ArrayList <Hospedagem>();
    int numero = 0;

    
    @Override
    public void cadastrar(Hospedagem hospede) {
        listaHospedes.add(hospede);
        System.out.println("\nHospede número " + hospede.getNumero() + " cadastrado com sucesso!");
       
    }

    @Override
    public void listar() {
        for (var hospede : listaHospedes) {
            hospede.visualizar();
            System.out.println("\n-------------------------");
        }
    }

    @Override
    public void buscar(int numero) {
        var hospede = buscarNaCollection(numero);

        if(hospede != null)
            hospede.visualizar();
        else
            System.out.println("\nO hospede número " + numero + " não foi encontrado!");
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com sucesso!");
    }

    public int gerarNumero(){
        return ++ numero;
    }
    
    public Hospedagem buscarNaCollection(int numero){
        for (var hospede : listaHospedes){
            if (hospede.getNumero() == numero){
                return hospede;
            }
        }
        return null;
    }
}