public class Viagem{
    private String cidade, estado;
    private double preco;
    private int quantVendidos = 0;
    private int quantMax;
    
    public Viagem(String cidade, String estado, double preco,int quantVendidos, 
    int quantMax){
        this.cidade = cidade;
        this.estado = estado;
        this.preco = preco;
        this.quantVendidos = quantVendidos;
        this.quantMax = quantMax;
    }
    
    public String getCidade(){
        return cidade;
    }
    public String getEstado(){
        return estado;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantVendidos(){
        return quantVendidos;
    }
    public int getQuantMax(){
        return quantMax;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantVendidos(int quantVendidos){
        this.quantVendidos = quantVendidos;
    }
    public void setQuantMax(int quantMax){
        this.quantMax = quantMax;
    }
    public void imprimeInfo(){
        System.out.println("Cidade destino: "+cidade);
        System.out.println("Estado destino: "+estado);
        System.out.println("Preço: R$ "+preco);
        System.out.println("Quantidade de lugares vendidos: "+quantVendidos);
        System.out.println("Quantidade máxima de lugares: "+quantMax);
    }
    public String toString(){
        return "Cidade destino: "+cidade+" | Estado destino: "+estado+" | Preço: R$ "+preco+
        " | Quantidade de lugares vendidos: "+quantVendidos+" | Quantidade máxima de lugares: "+quantMax;
    }
}
