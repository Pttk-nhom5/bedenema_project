package com.bedenema.dao;

import com.bedenema.model.Combo;
import com.bedenema.model.Food;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ComboDAO extends DAO{

    public ComboDAO(){
        super();
    }
    public  ArrayList<Combo> getComboList() throws SQLException {
        connect();
        st = conn.createStatement();
        sql = "select * from tblcomboes";
        rs = st.executeQuery(sql);
        ArrayList<Combo> arr = new ArrayList<>();
        conn.close();
        while(rs.next()){
            Combo c  = new Combo();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setPrice(rs.getDouble("price"));
            arr.add(c);
        }
        return arr;
    }

    public Combo getCombo(int id){
        Combo c = new Combo();
        return c;
    }

    public void newComBo(ArrayList<Food> Food){

    }

    public void updateCombo(int id){

    }

    public void deleteCombo(int id){

    }

//    public static void main(String[] args) throws SQLException {
//        ComboDAO cd = new ComboDAO();
//        System.out.println(cd.getComboList().get(0).getName());
//    }
}
