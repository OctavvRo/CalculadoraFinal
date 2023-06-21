package Logica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento_igual implements ActionListener {

    public float numb1;
    public String operador;
    private JTextField caja;
    private float resultado;
    private String texto;
    private float numb2;
    public Evento_igual(float numb1, JTextField caja) {
        this.numb1 = numb1;
        this.caja = caja;
    }
    public void setOperador(String operador){
        this.operador = operador;
    }
    public void actionPerformed(ActionEvent e) {
        numb2 = Float.parseFloat(caja.getText());
        switch (operador){

            case "+":{
                resultado= numb1+numb2;
                caja.setText(Float.toString(resultado));
                break;
                    }
            case "-":{
                resultado= numb1-numb2;
                caja.setText(Float.toString(resultado));
                break;
            }
            case "/":{
                if(numb2!=0){
                    resultado= numb1/numb2;
                    caja.setText(Float.toString(resultado));


                }else {caja.setText("No puedes dividir por 0.");}
                break;
            }
            case "*":{
                resultado= numb1*numb2;
                caja.setText(Float.toString(resultado));
                break;
            }
            default: caja.setText("Algo salió mal");
        }

    }


}
