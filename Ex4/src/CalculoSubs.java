import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class CalculoSubs {
    JFrame janela;
    JTextField valorDonates, valorSubs;
    JLabel textoD, textoS, textoP;
    JRadioButton Twitch, Youtube;
    ButtonGroup btnG;
    JPanel p;
    JButton BtnEnviar;

    public CalculoSubs(){
        janela = new JFrame();
        janela.setSize(300,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Cálculo de Subs/Donates");

        textoD = new JLabel("Valor de Donates: ");
        valorDonates = new JTextField(25);

        textoS = new JLabel("Quantidade de Subs: ");
        valorSubs = new JTextField(25);

        textoP = new JLabel("Selencione a sua plataforma de stream: ");
        Youtube = new JRadioButton("Youtube");
        Twitch = new JRadioButton("Twitch");

        btnG = new ButtonGroup();
        btnG.add(Youtube);
        btnG.add(Twitch);

        BtnEnviar = new JButton("Enviar");
        BtnEnviar.addActionListener(e ->{
            double d = Double.parseDouble(valorDonates.getText());
            double s = Double.parseDouble(valorSubs.getText());

            double valorPorSub = 10;
            double valorLimpoSub;
            double valorBrutoSub = s * valorPorSub;

            if(Twitch.isSelected()){
                valorLimpoSub = valorBrutoSub * 0.5;
            }
            else if(Youtube.isSelected()){
                valorLimpoSub = valorBrutoSub * 0.7;
            }

            double saldo = d +valorBrutoSub;

            if(saldo < 100){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque mínimo (R$ 100,00)\nSeu saldo: R$ "+ saldo);
            }
            else{
                JOptionPane.showMessageDialog(null, "Saldo disponível para saque!\nSeu saldo: R$ "+ saldo);
            }

        });

        p = new JPanel(new GridLayout(25, 25));
        p.add(textoD);
        p.add(valorDonates);
        p.add(textoS);
        p.add(valorSubs);
        p.add(textoP);
        p.add(Youtube);
        p.add(Twitch);
        p.add(BtnEnviar);

        janela.setResizable(false);
        janela.add(p);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());
        janela.setVisible(true);
    }
}
