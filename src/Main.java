import modelo.ModeloDif;
import net.sourceforge.jFuzzyLogic.FIS;
import Reglas.EvaluacionReglas;
import helpers.ObesityValue;
public class Main {
    public static void main(String[] args) {
        //el constructor se hace crea enviando todos los valores ya preparados
        ModeloDif modelo = new ModeloDif();
        modelo.evaluarSistemaDifuso(300,1);

    }
}