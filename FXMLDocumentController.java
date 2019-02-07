/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.lang.Math;



/**
 *
 * @author Administrator
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label homePageLabel;
    @FXML
    private Label dataField;
    @FXML
    private SplitPane homePage;
    @FXML
    private TextArea codeInput;
    private double[] data = new double[10];
            
    
    @FXML
    private void bubbleSortBtnOnClick(ActionEvent event) {
        System.out.println("You clicked me!");
        homePageLabel.setText("111111");
    }
    
    @FXML
    private void selectionSortBtnOnClick(ActionEvent event) {
        System.out.println("You clicked me!");
        homePageLabel.setText("222222");
    }
    
    @FXML
    private void executeBtnOnClick(ActionEvent event) {
        String s = codeInput.getText();
        codeInput.setText("");
        homePageLabel.setText(s);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String s = "";
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.round(Math.random() * 100 * 100.0) / 100.0;
            s += data[i] + " ";
        }
        dataField.setText(s);
    }    
    
}
