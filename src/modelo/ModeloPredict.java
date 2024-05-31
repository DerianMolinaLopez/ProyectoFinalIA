package modelo;
import helpers.TypeDieta;
public class ModeloPredict {
    private String url = "src/ReglasFuz.fcl";
    private int obesidad;
    private TypeDieta dieta;
    private int horasSemana;
    private int colesterol;

    public ModeloPredict(TypeDieta dieta, int horasSemana, int colesterol) {
        this.horasSemana = horasSemana;
        this.dieta = dieta;
        this.colesterol = colesterol;
    }
    //debe de regresar unanvalor matricial
    public void evaluacion(){
        //peticion http al servidor de flask
    }

}
