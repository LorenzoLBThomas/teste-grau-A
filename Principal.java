public class Principal{
    public static void main(String[] args){
    Aeroporto aero = new Aeroporto(Teclado.leString("Nome: "), Teclado.leDouble("Valor arrecadado: R$ "));
    Viagem viag = new Viagem("Florianópolis", "Santa Catarina", 5000.00, 0, 5);
    
    Passageiro pas1 = new Passageiro("Arthur", 36);
    Passageiro pas2 = new Passageiro("Bernardo", 11);
    Passageiro pas3 = new Passageiro("Cícero", 4);
    Passageiro pas4 = new Passageiro("Diogo", 61);
    Passageiro pas5 = new Passageiro("Eduardo", 18);
    Passageiro pas6 = new Passageiro("Fernando", 65);
    Passageiro pas7 = new Passageiro("Gustavo", 5);
    
    Passagem pass1 = aero.compraPassagem(pas1, viag);
    if (pass1 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass1.imprimeInfo();
    Passagem pass2 = aero.compraPassagem(pas2, viag);
    if (pass2 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass2.imprimeInfo();
    Passagem pass3 = aero.compraPassagem(pas3, viag);
    if (pass3 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass3.imprimeInfo();
    Passagem pass4 = aero.compraPassagem(pas4, viag);
    if (pass4 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass4.imprimeInfo();
    Passagem pass5 = aero.compraPassagem(pas5, viag);
        if (pass5 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass5.imprimeInfo();
    Passagem pass6 = aero.compraPassagem(pas6, viag);
        if (pass6 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass6.imprimeInfo();
    Passagem pass7 = aero.compraPassagem(pas7, viag);
        if (pass7 == null)
        System.out.println("ERRO! NÚMERO MÁXIMO DE PASSAGENS ATIGINDO!");
    else
        pass7.imprimeInfo();
    }
}