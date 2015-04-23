/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

/**
 *
 * @author pedro
 */
public class InicioController implements Initializable {
    @FXML private MenuItem venta;
    private Concurso ProgramaPrincipal;

    @FXML
    private void nuevaVentana(ActionEvent event) {
        ProgramaPrincipal.mostrarVentanaSecundaria();
    }

    public void setProgramaPrincipal(Concurso ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
