package Calculatrice;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 
public class MainCalculette {

  static JFrame frame = new JFrame("Calculatrice Java");
  static JTextField calculArea = new JTextField();
  static RoundButton btn1 = new RoundButton("1");
  static RoundButton btn2 = new RoundButton("2");
  static RoundButton btn3 = new RoundButton("3");
  static RoundButton btn4 = new RoundButton("4");
  static RoundButton btn5 = new RoundButton("5");
  static RoundButton btn6 = new RoundButton("6");
  static RoundButton btn7 = new RoundButton("7");
  static RoundButton btn8 = new RoundButton("8");
  static RoundButton btn9 = new RoundButton("9");
  static RoundButton btn0 = new RoundButton("0");
  static RoundButton btnMoins = new RoundButton("-");
  static RoundButton btnPlus = new RoundButton("+");
  static RoundButton btnFoix = new RoundButton("x");
  static RoundButton btnDiv = new RoundButton("/");
  static RoundButton btnEquals = new RoundButton("=");
  static RoundButton btnVirgule = new RoundButton(",");
  static RoundButton btnClear = new RoundButton("clear");
  static String calcul = "0";

  public static void main(String[] args) {
    paramètresBoutons();
    ajouterDesComposants();
  }

  public static void paramètresBoutons() {
    bouton1(btn1);
    bouton2(btn2);
    bouton3(btn3);
    bouton4(btn4);
    bouton5(btn5);
    bouton6(btn6);
    bouton7(btn7);
    bouton8(btn8);
    bouton9(btn9);
    bouton0(btn0);
    boutonPlus(btnPlus);
    boutonVirgule(btnVirgule);
    boutonMoins(btnMoins);
    boutonDiv(btnDiv);
    boutonFoix(btnFoix);
    boutonEquals(btnEquals);
    calculArea(calculArea);
    boutonClear(btnClear);
  }

  public static void ajouterDesComposants() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);
    frame.add(btn4);
    frame.add(btn5);
    frame.add(btn6);
    frame.add(btn7);
    frame.add(btn8);
    frame.add(btn9);
    frame.add(btn0);
    frame.add(btnVirgule);
    frame.add(btnPlus);
    frame.add(btnMoins);
    frame.add(btnFoix);
    frame.add(btnDiv);
    frame.add(btnEquals);
    frame.add(calculArea);
    frame.add(btnClear);
    frame.setSize(470,780);
    frame.getContentPane().setBackground(new java.awt.Color(70,70,70));
    frame.setLayout(null);
    frame.setVisible(true);
  }

  public static void calculArea(JTextField calculArea) {
    calculArea.setBounds(40,65, 390,100);
    calculArea.setBackground(new java.awt.Color(40,40,40));
    calculArea.setFont(new Font("affichageCalcul", 1, 50));
    calculArea.setCaretColor(new java.awt.Color(255,255,255,0));
    calculArea.setForeground(new java.awt.Color(185,185,185,100));
    calculArea.setBorder(BorderFactory.createEmptyBorder(20, 10, 0, 10));
    calculArea.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        equalsOpperation();
      }
    });
  }

  public static void boutonClear(RoundButton btnClear) {
    btnClear.setBounds(40,170,390,25);
    btnClear.setFont(new Font("policeTouche", 1, 15));
    btnClear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText("");
          calculArea.setFont(new Font("affichageCalcul", 1, 50));
        }
    });
  }

  public static void bouton1(RoundButton btn1) {
    btn1.setBounds(40,200,90,90);
    btn1.setFont(new Font("policeTouche", 4, 40));
    btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "1");
        }
    });
  }

  public static void bouton2(JButton btn2) {
    btn2.setBounds(140,200,90,90);
    btn2.setFont(new Font("policeTouche", 4, 40));
    btn2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "2");
        }
    });
  }

  public static void bouton3(JButton btn3) {
    btn3.setBounds(240,200,90,90);
    btn3.setFont(new Font("policeTouche", 4, 40));
    btn3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "3");
        }
    });
  }

  public static void bouton4(JButton btn4) {
    btn4.setBounds(40,300,90,90);
    btn4.setFont(new Font("policeTouche", 4, 40));
    btn4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "4");
        }
    });
  }

  public static void bouton5(JButton btn5) {
    btn5.setBounds(140,300,90,90);
    btn5.setFont(new Font("policeTouche", 4, 40));
    btn5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "5");
        }
    });
  }

  public static void bouton6(JButton btn6) {
    btn6.setBounds(240,300,90,90);
    btn6.setFont(new Font("policeTouche", 4, 40));
    btn6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "6");
        }
    });
  }

  public static void bouton7(JButton btn7) {
    btn7.setBounds(40,400,90,90);
    btn7.setFont(new Font("policeTouche", 4, 40));
    btn7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "7");
        }
    });
  }

  public static void bouton8(JButton btn8) {
    btn8.setBounds(140,400,90,90);
    btn8.setFont(new Font("policeTouche", 4, 40));
    btn8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "8");
        }
    });
  }

  public static void bouton9(JButton btn9) {
    btn9.setBounds(240,400,90,90);
    btn9.setFont(new Font("policeTouche", 4, 40));
    btn9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "9");
        }
    });
  }

  public static void bouton0(JButton btn0) {
    btn0.setBounds(40,500,190,90);
    btn0.setFont(new Font("policeTouche", 4, 40));
    btn0.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "0");
        }
    });
  }

  public static void boutonVirgule(JButton btnVirgule) {
    btnVirgule.setBounds(240,500,90,90);
    btnVirgule.setFont(new Font("policeTouche", 4, 40));
    btnVirgule.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + ".");
        }
    });
  }

  public static void boutonMoins(JButton btnMoins) {
    btnMoins.setBounds(340,300,90,90);
    btnMoins.setFont(new Font("policeTouche", 4, 40));
    btnMoins.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "-");
        }
    });
  }

  public static void boutonPlus(JButton btnPlus) {
    btnPlus.setBounds(340,200,90,90);
    btnPlus.setFont(new Font("policeTouche", 4, 40));
    btnPlus.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "+");
        }
    });
  }

  public static void boutonFoix(JButton btnFoix) {
    btnFoix.setBounds(340,400,90,90);
    btnFoix.setFont(new Font("policeTouche", 4, 40));
    btnFoix.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "x");
        }
    });
  }

  public static void boutonDiv(JButton btnDiv) {
    btnDiv.setBounds(340,500,90,90);
    btnDiv.setFont(new Font("policeTouche", 4, 40));
    btnDiv.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          calculArea.setText(calculArea.getText() + "/");
        }
    });
  }

  public static void boutonEquals(JButton btnEquals) {
    btnEquals.setBounds(40,600,390,90);
    btnEquals.setFont(new Font("policeTouche", 4, 40));
    btnEquals.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          equalsOpperation();
        }
    });
  }


  public static void equalsOpperation() {
    calculArea.setFont(new Font("affichageCalcul", 1, 50));
    String calcul = calculArea.getText();
    System.out.println(calcul);
    String str = "([a-zA-Z])";
    Matcher matcher = Pattern.compile(str).matcher(calcul);
    if (calcul.contains("/")) {
      String[] opperante = calcul.split("/");
      String denominateur = opperante[1];
      if (denominateur.equals("0") || denominateur.equals("0.0")){
        calculArea.setFont(new Font("affichageErreur", 1, 20));
        calculArea.setText("impossible de diviser par 0");
      }
      else {
        Double res = Calculatrice.ProgrameAppCalculatrice.egal(calcul);
        calculArea.setText(Double.toString(res));
      }
    } 
    else if (matcher.matches()){
      calculArea.setFont(new Font("affichageNonValide", 1, 20));
      calculArea.setText("Valeurs saisis non valides");
    } 
    else {
      Double res = Calculatrice.ProgrameAppCalculatrice.egal(calcul);
      calculArea.setText(Double.toString(res));
    }
  }

  
}