/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxt.services;

import com.nxt.pojo.Tag;
import com.nxt.ultils.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pain2
 */
public class TagServices {
    public List<Tag> getTag() throws SQLException{
        Connection conn = JdbcConnector.getInstance().connect();
        
        PreparedStatement stm = conn.prepareCall("SELECT * FROM tag");
        ResultSet rs = stm.executeQuery();
        
        List<Tag> tags = new ArrayList<>();
        while(rs.next()){
            tags.add(new Tag(rs.getInt("id"), rs.getString("name")));
        }
        return tags;
    }
}
