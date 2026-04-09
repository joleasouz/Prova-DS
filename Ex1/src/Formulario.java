import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario {
    JFrame janela;
    JPanel p;
    JLabel textoD, textoP, textoE;
    JTextField distancia, peso;
    JRadioButton expresso, normal;
    ButtonGroup BtnG;
    JButton BtnEnviar;

    public Formulario(){
        janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.setTitle("Logística Express");
        janela.setSize(500,600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        distancia = new JTextField(25);
        textoD = new JLabel();
        textoD.setText("Distancia (km): ");

        peso = new JTextField(25);
        textoP = new JLabel();
        textoP.setText("Peso (Kg): ");

        textoE = new JLabel("Qual é o tipo de envio?");
        expresso = new JRadioButton("Expresso");
        normal = new JRadioButton("Normal");

        BtnG = new ButtonGroup();
        BtnG.add(expresso);
        BtnG.add(normal);


        BtnEnviar = new JButton();
        BtnEnviar.setText("Enviar");

        p = new JPanel(new GridLayout(25, 25));
        p.add(textoD);
        p.add(distancia);
        p.add(textoP);
        p.add(peso);
        p.add(textoE);
        p.add(expresso);
        p.add(normal);
        p.add(BtnEnviar);

        BtnEnviar.addActionListener(e -> {
        double v = 10;
        v += Double.parseDouble(distancia.getText())*0.5;
        if(Double.parseDouble(peso.getText()) > 20){
            v += 30;
        }
        if(expresso.isSelected()){
                v += (v*0.2);
        }
        JOptionPane.showMessageDialog(null, "O valor do frete é: "+ v);
        });

        janela.setLocationRelativeTo(null);
        janela.add(p);
        janela.setVisible(true);   
    }
}