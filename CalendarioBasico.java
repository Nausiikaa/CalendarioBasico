
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Guarda el valor del atributo dia
    private int dia;
    // Guarda el valor del atributo mes
    private int mes;
    // Guarda el valor del atributo año
    private int año;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 01;
        mes = 01;
        año = 01;
        
    }
    public void introducirFecha(int day,int month,int year)
    {
        dia = day;
        mes = month;
        año = year;
    
    }
}
