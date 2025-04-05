public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Object[] miArrayHeterogeneo  = new Object[5];
        //
        miArrayHeterogeneo[0] = 10;           // Integer (autoboxing)
        miArrayHeterogeneo[1] = "Hola";       // String
        miArrayHeterogeneo[2] = 3.14;         // Double (autoboxing)
        miArrayHeterogeneo[3] = true;         // Boolean (autoboxing)
        miArrayHeterogeneo[4] = new MiClase();//// Un objeto de una clase personalizada
        //
        for(Object elemento: miArrayHeterogeneo){
            System.out.println("Clase del Elemento: "+elemento.getClass().getName()+", Valor: "+elemento);
        }//
    }
}
class MiClase{
    @Override
    public String toString() {
        return "Objeto de MiClase...";
    }
}//