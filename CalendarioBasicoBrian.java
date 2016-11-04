
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoBrian
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
    public CalendarioBasicoBrian()
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
    public void avanzarDia()
    {
        if(dia >= 30){
            dia = 01;
            mes = mes + 1;
                if(mes >=12){
                    mes = 01;
                    año = año + 1;
                }
        }
        else{
            dia = dia + 1;
        
        }
    }
}

