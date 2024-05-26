package Reglas;
import helpers.ObesityValue;
import net.sourceforge.jFuzzyLogic.FIS;
public class EvaluacionReglas {
    private String archivo = "C:/Users/mderi/IdeaProjects/PoryectoMedina/src/Reglas.fcl";
    private int age = 0;
    private int chol = 0;
    private FIS reglas;
    private ObesityValue obesity = ObesityValue.OBESITY_FALSE;//por defecto sera falso
    //el constructor lo que haremos es que por defecto ya tenga
    //la ruta del archivo
    public EvaluacionReglas(int age, int chol ,ObesityValue obesity) {
        this.age = age;
        this.chol = chol;
        this.obesity = obesity;

    }
    public double evaluarValores(){
        reglas = FIS.load(archivo,true);
        if(reglas == null){
            System.err.println("No se pudo cargar el archivo de configuración");
            return -1;
        }
        reglas.setVariable("age",age);
        reglas.setVariable("chol",chol);
        reglas.setVariable("obesity",obesity.value);
        reglas.evaluate();
        return  reglas.getVariable("risk").getValue();

    }
}
