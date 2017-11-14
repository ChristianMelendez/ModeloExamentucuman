import javax.swing.JOptionPane;
public class ExamenTucuman {
    //Antiguedad
    double antiguedad;
    double val_ant=300;//Por año remanente
    double val_ant_5=800;//Por cada 5 años
    double total_ant;
    //Horas
    double hs;
    double valorhs=120;
    double valorhsx=150;
    double hsextras=0;
    double totalvalorhs=0;
    double totalvalorhsx=0;
    double total_hs;
    //Sueldo
    double sueldoneto;
    double sueldobruto;
    double retenciones;
    
    public void Ingreso_horas(){
        hs=Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas"));
    }
    public void Ingreso_antiguedad(){
        antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antiguedad"));
    }
    public void Calculo_antiguedad(){
        
            total_ant=(antiguedad/5)*val_ant_5+(antiguedad%5)*val_ant;
            System.out.println(total_ant);
    }
    public void Calculo_horas(){
        if(hs>160){
            hsextras=hs-160;
            hs=hs-hsextras;
        }
        totalvalorhs=hs*valorhs;
        totalvalorhsx=hsextras*valorhsx;
        total_hs=totalvalorhs+totalvalorhsx;
    }
    public void Calculo_sueldobruto(){
        sueldobruto=total_hs+total_ant;
    }
    public void Calculo_retenciones(){
        if(sueldobruto<=18000){
            
        retenciones=sueldobruto*0.2;
            
        }
        else{
            retenciones=sueldobruto*0.24;
        }
        System.out.println(sueldobruto);
        System.out.println(retenciones);
    }
    public void Calculo_sueldoneto(){
        sueldoneto=sueldobruto-retenciones;
    }
    public void Mostrar_sueldo(){
        JOptionPane.showMessageDialog(null, "Total años de antiguedad : "+antiguedad+"(Valor de: $"+total_ant+")\nTotal horas trabajadas : "+hs+"(Valor de: $"+total_hs+"\nTotal horas extras"+hsextras+"\nSueldo Bruto : "+sueldobruto+"\nRetenciones : "+retenciones+"\nSueldo Neto: "+sueldoneto);
    }
    public void Horas(){
        Ingreso_horas();
        Calculo_horas();
    }
    public void Antiguedad(){
        Ingreso_antiguedad();
        Calculo_antiguedad();
    }
    public void Sueldo(){
        Calculo_sueldobruto();
        Calculo_retenciones();
        Calculo_sueldoneto();
        Mostrar_sueldo();
    }
    public static void main (String []args){
        ExamenTucuman ob1=new ExamenTucuman();
        ob1.Horas();
        ob1.Antiguedad();
        ob1.Sueldo();
                
    }
    
}
