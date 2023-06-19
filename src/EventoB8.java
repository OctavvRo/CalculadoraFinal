import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoB8 implements ActionListener {

    private JTextField caja;

    public EventoB8(JTextField caja) {
        this.caja = caja;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        caja.setText(caja.getText()+ "8");
    }

}
