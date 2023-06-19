import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoB1 implements ActionListener {

    private JTextField caja;

    public EventoB1(JTextField caja) {
        this.caja = caja;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        caja.setText(caja.getText()+ "1");
    }

}
