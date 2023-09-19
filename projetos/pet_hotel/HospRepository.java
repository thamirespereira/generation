package projetos.pet_hotel;

public interface HospRepository {
    
    public void cadastrar (Hospedagem hospede);
    public void listar();
    public void buscar(int numero);
    public void pagar();
}
