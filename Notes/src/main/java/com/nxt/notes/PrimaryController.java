package com.nxt.notes;

import com.nxt.pojo.Notes;
import com.nxt.pojo.Tag;
import com.nxt.services.NoteServices;
import com.nxt.services.TagServices;
import com.nxt.ultils.myAlert;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    
    @FXML
    private ComboBox<Tag> cbtag;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextField txtDate;
    @FXML
    private TextArea txtContent;
    public static final TagServices tagServices = new TagServices();
    public static final NoteServices noteServices = new NoteServices();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.cbtag.setItems(FXCollections.observableList(tagServices.getTag()));
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addhandle(ActionEvent action) throws Exception {
        try {
            Notes.Builder n;
            n = new Notes.Builder(txtTitle.getText(), txtContent.getText(), cbtag.getSelectionModel().getSelectedItem());
            noteServices.addNotes(n.build());
            myAlert.getInstance().showMSG("Them du lieu thanh cong");
        } catch (SQLException ex) {
            myAlert.getInstance().showMSG("Them du lieu ko thanh cong" + ex.getMessage());
        } catch (Exception ex) {
            myAlert.getInstance().showMSG("Sai du lieu");
        }
        
    }
    
}
