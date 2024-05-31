package modelo;

import net.sourceforge.jFuzzyLogic.FIS;

public class ModeloDif {
    private String url = "src/Reglas.fcl";
    private FIS fis;

    public ModeloDif(){
        fis = FIS.load(url, true);
    }

    public void evaluarSistemaDifuso(double chol, int obesity){
        if(fis == null){
            System.err.println("Error al cargar el archivo de reglas");
            return;
        }

        // Configurar las variables de entrada
        fis.setVariable("chol", chol);
        fis.setVariable("obesity", obesity);

        // Evaluar el sistema difuso
        fis.evaluate();

        // Obtener el resultado
        double risk = fis.getVariable("risk").getValue();

        // Imprimir el resultado
        System.out.println("Resultado de la evaluación del sistema difuso:");
        System.out.println("Riesgo de ataque cardíaco: " + risk);
    }
}
