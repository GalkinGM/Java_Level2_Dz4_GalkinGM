package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textIn;
    public TextArea textAreaSend;


    /**
     * выводит текст в background
     */
//    @FXML
//    public void clickSend(ActionEvent actionEvent) {
//        System.out.println("Хай");
//    }

    /**
     * выводит текст в foreground
     */
    public void clickSend(ActionEvent actionEvent){
        textArea.appendText(textIn.getText()+"\n");
        textIn.clear();
        textIn.requestFocus();

    }



    public void textAreaSend(KeyEvent keyEvent) {
        if(keyEvent.isShiftDown() && keyEvent.getCode().equals(KeyCode.ENTER)){
            textArea.appendText(textAreaSend.getText()+"\n");
            textAreaSend.clear();
            textAreaSend.requestFocus();
        }


    }
}
