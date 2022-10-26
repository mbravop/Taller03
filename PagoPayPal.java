public class PagoPayPal extends Pago{
    private boolean loggedIn; //conexion a cuenta PayPal
    @Override
    public void realizarCobro(double monto){
        logIn();
        //cargar el monton de compra al medio de pago
    }
    private void logIn(){
        loggedIn=true;
    }
}