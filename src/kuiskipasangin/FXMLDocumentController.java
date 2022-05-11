/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiskipasangin;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import kuiskipasangin.db.DBHandler;
import kuiskipasangin.model.kipas;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnSimpan;


    @FXML
    private DatePicker dpTanggalBeli;

    @FXML
    private TextField tfMerk;
    
    @FXML
    private ToggleGroup warna;

    @FXML
    private RadioButton rdBiru;

    @FXML
    private RadioButton rdPutih;
    
    @FXML
    private RadioButton rdMerah;

    @FXML
    private TextField kode;
    
    @FXML
    private TextField tfHarga;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(kode.getText());
        System.out.println(tfMerk.getText());
        System.out.println(dpTanggalBeli.getValue().toString());
        String warna ="";
        if(rdBiru.isSelected())
            warna = rdBiru.getText();
        if(rdPutih.isSelected())
            warna = rdPutih.getText();
        if(rdMerah.isSelected())
            warna = rdMerah.getText();
        System.out.println(warna);
        System.out.println(tfHarga.getText());
        
        kipas u = new kipas(kode.getText(),tfMerk.getText(),dpTanggalBeli.getValue().toString(),
        warna, tfHarga.getText());
        
        DBHandler dh = new DBHandler("MYSQL");
        dh.addkipas(u);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }       
    
}

