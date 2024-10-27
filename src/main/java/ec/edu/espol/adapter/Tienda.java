package ec.edu.espol.adapter;

public class Tienda {

    private PagosInternacionales pagosAdapter;

    public Tienda(PagosInternacionales pagosAdapter) {
        this.pagosAdapter = pagosAdapter;
    }

    public void realizarVentaEnUSD(double monto) {
        System.out.println("Realizando venta en la tienda por $" + monto + " USD.");
        pagosAdapter.pagoEnUSD(monto);
    }

    public void realizarVentaEnEUR(double monto) {
        System.out.println("Realizando venta en la tienda por € " + monto + ".");
        pagosAdapter.pagoEnEUR(monto);
    }

    public void realizarVentaEnBTC(double monto) {
        System.out.println("Realizando venta en la tienda por " + monto + " BTC.");
        pagosAdapter.pagoEnBtc(monto);
    }

    public static void main(String[] args) {

        CajaRegistradora cajaRegistradora = new CajaRegistradora();

        PagosInternacionales pagosAdapter = new AdaptadorCajaRegistradora(cajaRegistradora);

        Tienda tienda = new Tienda(pagosAdapter);

        tienda.realizarVentaEnUSD(100);  
        tienda.realizarVentaEnEUR(50);   
        tienda.realizarVentaEnBTC(0.002);
    }
}


