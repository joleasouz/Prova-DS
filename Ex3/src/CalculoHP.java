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

public class CalculoHP {
    JFrame janela;
    JTextField xpAcumulado, nivelAtual;
    JLabel textoXpAcumulado, textoNivelAtual, nivMissao;
    JRadioButton facil, medio, dificil;
    ButtonGroup btnG;
    JPanel p;
    JButton BtnEnviar;

    public CalculoHP(){
        janela = new JFrame();
        janela.setSize(300,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Cálculo de HP - RPG");

        textoXpAcumulado = new JLabel("XP Acumulado: ");
        xpAcumulado = new JTextField(25);

        textoNivelAtual = new JLabel("Nivel Atual: ");
        nivelAtual = new JTextField(25);

        nivMissao = new JLabel("Selencione o nível da missão: ");
        facil = new JRadioButton("Facil");
        medio = new JRadioButton("Médio");
        dificil = new JRadioButton("Dificil");

        btnG = new ButtonGroup();
        btnG.add(facil);
        btnG.add(medio);
        btnG.add(dificil);

        BtnEnviar = new JButton("Enviar");
        BtnEnviar.addActionListener(e ->{
            int xpJuntado = Integer.parseInt(xpAcumulado.getText());
            int nAtual = Integer.parseInt(nivelAtual.getText());
            int xpBase = 100;
            double xpGanho;

            if(medio.isSelected()){
                xpGanho = xpBase * 1.5;
            }
            else if(dificil.isSelected()){
                xpGanho = xpBase * 2;
            }
            else{
                xpGanho = xpBase;
            }

            double novoXp = xpJuntado + xpGanho;

            if(novoXp >= 1000){
                int novoNivel = nAtual +1;
                JOptionPane.showMessageDialog(null, "PARABÉNS! Você subiu para o nível "+ novoNivel+"\n\nXp Ganho: "+xpGanho);
            }
            else{
                JOptionPane.showMessageDialog(null, "Falta pouco para você conseguir subir de nível.\n\nXp Ganho: "+xpGanho);
            }

        });

        p = new JPanel(new GridLayout(25, 25));
        p.add(textoXpAcumulado);
        p.add(xpAcumulado);
        p.add(textoNivelAtual);
        p.add(nivelAtual);
        p.add(nivMissao);
        p.add(facil);
        p.add(medio);
        p.add(dificil);
        p.add(BtnEnviar);

        janela.setResizable(false);
        janela.add(p);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());
        janela.setVisible(true);
    }
}
