import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Compra {
    JFrame janela;
    JTextField valorC, cupom;
    JLabel textoValor, textoCupom;
    JPanel p;
    JButton BtnEnviar;

    public Compra(){
        janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        janela.setSize(300, 400);
        janela.setLocationRelativeTo(null);
        janela.setTitle("Calculo de Desconto");
        
        textoValor = new JLabel("Valor da Compra: ");
        valorC = new JTextField(25);

        textoCupom = new JLabel("Cupom de Desconto: ");
        cupom = new JTextField(25);

        BtnEnviar = new JButton();
        BtnEnviar.setText("Enviar");

        BtnEnviar.addActionListener(e ->{
            double v = Double.parseDouble(valorC.getText());
            String c = cupom.getText();
            if(v > 500){
                v = v - (v*0.1);
            }
            if(c.trim().toUpperCase().equals("AMIGAO10")){
                v = v - 10;
            }
            JOptionPane.showMessageDialog(null, "O valor da sua compra é: "+ v);
        });
        
        p = new JPanel(new GridLayout(25,25));
        p.add(textoValor);
        p.add(valorC);
        p.add(textoCupom);
        p.add(cupom);
        p.add(BtnEnviar);

        janela.setResizable(false);
        janela.add(p);
        janela.setVisible(true);
    }


}
