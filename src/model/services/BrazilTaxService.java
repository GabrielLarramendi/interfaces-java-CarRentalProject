package model.services;

public class BrazilTaxService {

    //Classe responsavel por calcular o imposto (No Brasil, por exemplo)

    public double tax(double amount) { //Esse amount é o valor básico do pagamento;
        if (amount <= 100.00) {
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}
