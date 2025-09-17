/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxt.services;

import com.nxt.pojo.Notes;
import com.nxt.ultils.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pain2
 */
public class NoteServices {
    public void addNotes(Notes n) throws SQLException {
    
        Connection conn = JdbcConnector.getInstance().connect();
        PreparedStatement stm = conn.prepareCall("INSERT INTO notes(title, content, date, tag_id) VALUES(?, ?, ?, ?)");
        stm.setString(1, n.getTitle());
        stm.setString(2, n.getContent());
        stm.setString(3, n.getDate());
        stm.setInt(4, n.getTagId().getId());
        stm.executeUpdate();
        
}
}
