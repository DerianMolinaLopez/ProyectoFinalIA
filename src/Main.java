import net.sourceforge.jFuzzyLogic.FIS;
import Reglas.EvaluacionReglas;
import helpers.ObesityValue;
public class Main {
    public static void main(String[] args) {
        //el constructor se hace crea enviando todos los valores ya preparados
       EvaluacionReglas evaluacion = new EvaluacionReglas(20,200,ObesityValue.OBESITY_TRUE);
        System.out.println("El riesgo de enfermedad cardiaca es: "+evaluacion.evaluarValores());
    }
}