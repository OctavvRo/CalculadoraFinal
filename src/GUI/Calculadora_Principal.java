package GUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import Logica.*;
import com.intellij.uiDesigner.core.*;
public class Calculadora_Principal extends JFrame {

    //Creación de una varaible tipo eventoIGual
    public Evento_igual eventoIgual;
    public float num1, num2;
    public Calculadora_Principal() {

        setDefaultCloseOperation(3);
        initComponents();
        eventoIgual = new Evento_igual(num1, mostrar);
        b0.addActionListener(new EventoB0(mostrar));
        b1.addActionListener(new EventoB1(mostrar));
        b2.addActionListener(new EventoB2(mostrar));
        b3.addActionListener(new EventoB3(mostrar));
        b4.addActionListener(new EventoB4(mostrar));
        b5.addActionListener(new EventoB5(mostrar));
        b6.addActionListener(new EventoB6(mostrar));
        b7.addActionListener(new EventoB7(mostrar));
        b8.addActionListener(new EventoB8(mostrar));
        b9.addActionListener(new EventoB9(mostrar));
        b_clean.addActionListener(new Evento_limpiar(mostrar));
        b_suma.addActionListener(new Evento_sumar(eventoIgual, mostrar));
        b_resta.addActionListener(new Evento_restar(eventoIgual, mostrar));
        b_multiplicacion.addActionListener(new Evento_multiplicar(eventoIgual, mostrar));
        b_dividir.addActionListener(new Evento_dividir(eventoIgual, mostrar));
        b_igual.addActionListener(eventoIgual);

    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Octavio Rosales
        panel1 = new JPanel();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b_clean = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b_dividir = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b_resta = new JButton();
        b_suma = new JButton();
        b0 = new JButton();
        b_multiplicacion = new JButton();
        b_igual = new JButton();
        mostrar = new JTextField();

        //======== this ========
        setBackground(new Color(0xcccccc));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            panel1.setLayout(new GridLayoutManager(4, 4, new Insets(0, 0, 0, 0), -1, -1));

            //---- b1 ----
            b1.setText("1");
            b1.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b1.setForeground(Color.white);
            b1.setBackground(new Color(0x666666));
            panel1.add(b1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b2 ----
            b2.setText("2");
            b2.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b2.setForeground(Color.white);
            b2.setBackground(new Color(0x666666));
            panel1.add(b2, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b3 ----
            b3.setText("3");
            b3.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b3.setForeground(Color.white);
            b3.setBackground(new Color(0x666666));
            panel1.add(b3, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b_clean ----
            b_clean.setText("C");
            b_clean.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b_clean.setForeground(Color.white);
            b_clean.setBackground(new Color(0x666666));
            panel1.add(b_clean, new GridConstraints(0, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b4 ----
            b4.setText("4");
            b4.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b4.setForeground(Color.white);
            b4.setBackground(new Color(0x666666));
            panel1.add(b4, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b5 ----
            b5.setText("5");
            b5.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b5.setForeground(Color.white);
            b5.setBackground(new Color(0x666666));
            panel1.add(b5, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b6 ----
            b6.setText("6");
            b6.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b6.setForeground(Color.white);
            b6.setBackground(new Color(0x666666));
            panel1.add(b6, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b_dividir ----
            b_dividir.setText("/");
            b_dividir.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b_dividir.setForeground(Color.white);
            b_dividir.setBackground(new Color(0x666666));
            panel1.add(b_dividir, new GridConstraints(1, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b7 ----
            b7.setText("7");
            b7.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b7.setForeground(Color.white);
            b7.setBackground(new Color(0x666666));
            panel1.add(b7, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b8 ----
            b8.setText("8");
            b8.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b8.setForeground(Color.white);
            b8.setBackground(new Color(0x666666));
            panel1.add(b8, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b9 ----
            b9.setText("9");
            b9.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b9.setForeground(Color.white);
            b9.setBackground(new Color(0x666666));
            panel1.add(b9, new GridConstraints(2, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b_resta ----
            b_resta.setText("-");
            b_resta.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b_resta.setForeground(Color.white);
            b_resta.setBackground(new Color(0x666666));
            panel1.add(b_resta, new GridConstraints(2, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b_suma ----
            b_suma.setText("+");
            b_suma.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b_suma.setForeground(Color.white);
            b_suma.setBackground(new Color(0x666666));
            panel1.add(b_suma, new GridConstraints(3, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b0 ----
            b0.setText("0");
            b0.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b0.setForeground(Color.white);
            b0.setBackground(new Color(0x666666));
            panel1.add(b0, new GridConstraints(3, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b_multiplicacion ----
            b_multiplicacion.setText("*");
            b_multiplicacion.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b_multiplicacion.setForeground(Color.white);
            b_multiplicacion.setBackground(new Color(0x666666));
            panel1.add(b_multiplicacion, new GridConstraints(3, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- b_igual ----
            b_igual.setText("=");
            b_igual.setFont(new Font("Roboto Light", Font.BOLD, 14));
            b_igual.setForeground(Color.white);
            b_igual.setBackground(new Color(0x666666));
            panel1.add(b_igual, new GridConstraints(3, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }

        //---- mostrar ----
        mostrar.setFont(new Font("Roboto Light", Font.BOLD, 18));
        mostrar.setEditable(false);
        mostrar.setHorizontalAlignment(SwingConstants.RIGHT);
        mostrar.setBackground(new Color(0x999999));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addComponent(mostrar, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(mostrar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Octavio Rosales
    private JPanel panel1;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b_clean;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b_dividir;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b_resta;
    private JButton b_suma;
    private JButton b0;
    private JButton b_multiplicacion;
    private JButton b_igual;
    private JTextField mostrar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
