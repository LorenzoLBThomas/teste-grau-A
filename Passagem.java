public class Passagem{
    private Viagem viagem;
    private Passageiro passageiro;
    private double valorEfetivo;
    
    public Passagem(Viagem viagem, Passageiro passageiro){
        this.viagem = viagem;
        this.passageiro = passageiro;
    }
    
    public Viagem getViagem(){
        return viagem;
    }
    public Passageiro getPassageiro(){
        return passageiro;
    }
    public double getValorEfetivo(){
        return valorEfetivo;
    }
    public void setViagem(Viagem viagem){
        this.viagem = viagem;
    }
    public void setPassageiro(Passageiro passageiro){
        this.passageiro = passageiro;
    }
    public void setValorEfetivo(double valorEfetivo){
        this.valorEfetivo = valorEfetivo;
    }
    public void imprimeInfo(){
        System.out.println("Viagem: "+viagem);
        System.out.println("Passageiro: "+passageiro);
        System.out.println("Valor Efetivo: R$ "+valorEfetivo);
    }
}