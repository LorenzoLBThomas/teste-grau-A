public class Aeroporto{
    private String nome;
    private double valorArrecadado = 0;
    
    public Aeroporto(String nome, double valorArrecadado){
        this.nome = nome;
        this.valorArrecadado = valorArrecadado;
    }
    public String getNome(){
        return nome;
    }
    public double getValorArrecadado(){
        return valorArrecadado;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setValorArrecadado(double valorArrecadado){
        this.valorArrecadado = valorArrecadado;
    }
    public Passagem compraPassagem(Passageiro passageiro, Viagem viagem){
        Passagem nova_passagem = new Passagem(viagem, passageiro);
        if (viagem.getQuantVendidos() < viagem.getQuantMax()){
            if (passageiro.getIdade() <= 5)
                nova_passagem.setValorEfetivo(0.00);
            else if (passageiro.getIdade() <= 12)
                nova_passagem.setValorEfetivo(viagem.getPreco() /2);
            else if (passageiro.getIdade() >= 59)
                nova_passagem.setValorEfetivo(viagem.getPreco() / 3);
            else if (viagem.getEstado().equals("Rio Grande do Sul") || viagem.getEstado().equals("Santa Catarina") ||
            viagem.getEstado().equals("Paraná")){
                nova_passagem.setValorEfetivo(0.85 * viagem.getPreco());
            }
            else{
                nova_passagem.setValorEfetivo(viagem.getPreco());
            }
            
            viagem.setQuantVendidos(viagem.getQuantVendidos() + 1);
        }
        else
            return null;
        return nova_passagem;
        }
}
