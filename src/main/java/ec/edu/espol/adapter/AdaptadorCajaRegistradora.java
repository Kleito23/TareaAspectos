package ec.edu.espol.adapter;

public class AdaptadorCajaRegistradora implements PagosInternacionales {
    private CajaRegistradora cajaRegistradora;


    public AdaptadorCajaRegistradora(CajaRegistradora cajaRegistradora) {
        this.cajaRegistradora = cajaRegistradora;
    }

    @Override
    public void pagoEnUSD(double amount) {
        cajaRegistradora.procesarPago(amount);
    }

    @Override
    public void pagoEnEUR(double amount) {
        double montoEnUSD = amount * 1.07; 
        System.out.println("Convirtiendo €" + amount + " a $" + montoEnUSD + " USD.");
        cajaRegistradora.procesarPago(montoEnUSD);
    }

    @Override
    public void pagoEnBtc(double amount) {
        
        double montoEnUSD = amount * 67156.33; 
        System.out.println("Convirtiendo " + amount + " BTC a $" + montoEnUSD + " USD.");
        cajaRegistradora.procesarPago(montoEnUSD);
    }

}
