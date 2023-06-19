import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoB7 implements ActionListener {

    private JTextField caja;

    public EventoB7(JTextField caja) {
        this.caja = caja;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        caja.setText(caja.getText()+ "7");
    }

}
