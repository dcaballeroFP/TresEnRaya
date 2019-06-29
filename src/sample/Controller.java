package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    boolean ganador=false;
    @FXML Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    List<Button> botonesList = new ArrayList<>();
    boolean turno=true;

    @FXML RadioButton rbCH;
    @FXML RadioButton rbHH;
    @FXML RadioButton rbCC;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        botonesList = Arrays.asList(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);

    }

    public void HumanVSHuman(ActionEvent actionEvent) {

    }

    public void cpuVScpu() {

    }

    public void jugadaComputer() {
        Random r = new Random();
        Button b ;
        do {
            b = botonesList.get(r.nextInt( 9));
        }while (!b.getText().equals(""));

        if(!ganador){

                    if (b.getText().equals("")) {
                        if (turno) {
                            b.setText("X");
                        } else {
                            b.setText("O");
                        }
                        turno = !turno;
                    }
                }
        }

    public void cpuVScpu(ActionEvent actionEvent) {

    }

    public void clickTirada(ActionEvent actionEvent) {
        if(turno){
            Button button = (Button) actionEvent.getSource();
            button.setText("X");
            turno=false;
        }else{
            Button button = (Button) actionEvent.getSource();
            button.setText("O");
            turno=true;
        }

        if(rbCH.isSelected()){
            jugadaComputer();
        }else if(rbCC.isSelected()){

        }
        comprobar();

    }

    public void restart(ActionEvent actionEvent){

        for (Button button : botonesList) {
            button.setText("");
            button.getStyleClass().remove("winning-button");

        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Inicio de partida");
        alert.setHeaderText("Vamos a iniciar una nueva partida");
        alert.setContentText("O WINS");


        alert.showAndWait();

    }

    public void startName(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nombre jugador 1");
        alert.setHeaderText("Vamos a iniciar una nueva partida");
        alert.setContentText("O WINS");

        alert.showAndWait();

        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nombre jugador 2");
        alert.setHeaderText("Vamos a iniciar una nueva partida");
        alert.setContentText("O WINS");

        alert.showAndWait();

    }

    public boolean comprobar(){

       //Fila1
        if (""!=btn1.getText() && btn1.getText() == btn2.getText()
                && btn2.getText() == btn3.getText()){
            mostrarComboGanador(btn1,btn2,btn3);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn1.getText());

            alert.showAndWait();

            return true;
        }
        //Fila2
        if (""!=btn4.getText() && btn4.getText() == btn5.getText()
                && btn5.getText() == btn6.getText()){
            mostrarComboGanador(btn4,btn5,btn6);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn4.getText());

            alert.showAndWait();
            return true;
        }
        //Fila3
        if (""!=btn7.getText() && btn7.getText() == btn8.getText()
                && btn8.getText() == btn9.getText()){
            mostrarComboGanador(btn7,btn8,btn9);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn7.getText());

            alert.showAndWait();
            return true;
        }
        //Column 1
        if (""!=btn1.getText() && btn1.getText() == btn4.getText()
                && btn4.getText() == btn7.getText()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn4.getText());

            alert.showAndWait();
            return true;
        }
        //Column 2
        if (""!=btn2.getText() && btn2.getText() == btn5.getText()
                && btn5.getText() == btn8.getText()){
            mostrarComboGanador(btn2,btn5,btn8);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn2.getText());

            alert.showAndWait();
            return true;
        }
        //Column 3
        if (""!=btn3.getText() && btn3.getText() == btn6.getText()
                && btn6.getText() == btn9.getText()){
            mostrarComboGanador(btn3,btn6,btn9);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn3.getText());

            alert.showAndWait();
            return true;
        }
        //Diagonal 1
        if (""!=btn1.getText() && btn1.getText() == btn5.getText()
                && btn5.getText() == btn9.getText()){
            mostrarComboGanador(btn1,btn5,btn9);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");

            alert.setContentText("Ha ganado el jugador "+ btn1.getText());

            alert.showAndWait();
            return true;
        }
        //Diagonal 2
        if (""!=btn3.getText() && btn3.getText() == btn5.getText()
                && btn5.getText() == btn7.getText()) {
            mostrarComboGanador(btn3, btn5, btn7);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("RESULTADO FINAL");
            alert.setContentText("Ha ganado el jugador "+ btn3.getText());
            alert.showAndWait();

            return true;

        }
        return false;
    }

    public void mostrarComboGanador(Button b1,Button b2,Button b3){

            b1.getStyleClass().add("winning-button");
            b2.getStyleClass().add("winning-button");
            b3.getStyleClass().add("winning-button");

    }

}


