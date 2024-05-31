package Componentes;
import javax.swing.*;
import helpers.TypeDieta;
import modelo.ModeloPredict;
import modelo.ModeloDif;
public class PanelPrincipal extends JFrame {
    public PanelPrincipal() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        initComponents();


    }
    private void initComponents(){
        this.setLayout(null);

        ButtonGroup group = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("Normal");
        JRadioButton radio2 = new JRadioButton("Saludable");
        JRadioButton radio3 = new JRadioButton("Poco saludable");


        this.add(new JLabel("Dieta:")).setBounds(10,10,100,30);
        this.add(radio1).setBounds(120,10,100,30);
        this.add(radio2).setBounds(220,10,100,30);
        this.add(radio3).setBounds(320,10,120,30);
   //     this.add(new JTextField()).setBounds(120,10,100,30);
        this.add(new JLabel("Colesterol:")).setBounds(10,50,100,30);
        this.add(new JTextField()).setBounds(120,50,100,30);
        this.add(new JLabel("Hors de ejercicio por semana:")).setBounds(10,90,160,30);
        this.add(new JTextField()).setBounds(190,90,100,30);

        //OPCIONES de dieta


        group.add(radio1);
        group.add(radio2);
        group.add(radio3);



        this.add(new JButton("Calcular modelo")).setBounds(10,130,150,30);
        this.add(new JButton("Sistema difuso")).setBounds(200,130,150,30);
        this.add(new JLabel("Resultado:")).setBounds(10,170,100,30);
        this.add(new JLabel()).setBounds(120,170,100,30);
    }
    public static void main(String[]args){
        ModeloDif modelo = new ModeloDif();

        new PanelPrincipal();
    }
}
