import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento_multiplicar implements ActionListener {


    //Creacion de un evento igual dentro del evento sumar
    private Evento_igual eventoIgual;
    private JTextField caja;

    public Evento_multiplicar(Evento_igual eventoIgual, JTextField caja) {
        this.eventoIgual = eventoIgual;
        this.caja = caja;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String valor = caja.getText();
        // Se parsea el valor dentor del JtextField para ser pasado como argumento al evento Igual
        float numb1 = Float.parseFloat(valor);
        caja.setText("");
        eventoIgual.numb1 = numb1;
        // Se pasa como operador al + para
        eventoIgual.setOperador("*");
    }
}
