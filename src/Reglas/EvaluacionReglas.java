package Reglas;
import helpers.ObesityValue;
import net.sourceforge.jFuzzyLogic.FIS;
import helpers.TypeDieta;
public class EvaluacionReglas {
    private String archivo = "src/ReglasFuz.fcl";
    private int age = 0;
    private int chol = 0;
    private FIS reglas;
   private TypeDieta dieta;
    //el constructor lo que haremos es que por defecto ya tenga
    //la ruta del archivo
    public EvaluacionReglas(int colesterol, int chol , TypeDieta dieta) {
        this.age = age;
        this.chol = chol;
        this.dieta = dieta;

    }
    public double evaluarValores(){

        return  0.0;

    }
}
