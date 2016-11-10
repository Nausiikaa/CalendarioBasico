
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoBrian
{
    // Guarda el valor del atributo dia
    private DisplayDosDigitos dia;
    // Guarda el valor del atributo mes
    private DisplayDosDigitos mes;
    // Guarda el valor del atributo año
    private DisplayDosDigitos año;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasicoBrian()
    {
      dia = new DisplayDosDigitos(31);
      mes = new DisplayDosDigitos(13);
      año = new DisplayDosDigitos(100);
    }
    public void fijarFecha(int day,int month,int year)
    {
        dia.setValor(day);
        mes.setValor(month);
        año.setValor(year);
    }
    public void avanzarDia()
    {
        dia.incrementaValor();
        if(dia.getValor() == 1){
            //Si estamos aqui es que hay que hacer avanzar al mes
            mes.incrementaValor();
            if(mes.getValor() == 1){
                //Si estamos aqui hay que hacer cambiar el año
                año.incrementaValor();
            }
        }
    }
    public String mostrarFecha()
    {
        return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + año.getValorDelDisplay();
    }
}

