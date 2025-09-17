/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxt.ultils;

import javafx.scene.control.Alert;

/**
 *
 * @author pain2
 */
public class myAlert {
    private static myAlert instance;
    private final Alert alert;

    private myAlert(){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
    }
    
    public static myAlert getInstance(){
        if(instance== null){
            instance = new myAlert();
        }
        return instance;
    }
    public void showMSG(String smg){
        this.alert.setContentText(smg);
        this.alert.showAndWait();
    }


}
