package com.bedenema.dao;

import com.bedenema.model.Ticket;

import java.sql.SQLException;
import java.util.ArrayList;

public class TicketDAO extends DAO{

    public TicketDAO(){
        super();
    }
    public ArrayList<Ticket> getTicketList(int showtimeID) throws SQLException {
        connect();
        st = conn.createStatement();
        sql = "select * from tbltickets where showtime_id ='"+ showtimeID +"'";
        rs = st.executeQuery(sql);
        conn.close();
        ArrayList<Ticket> arr = new ArrayList<>();
        while(rs.next()){
            Ticket t =new Ticket();
            t.setId(rs.getInt("id"));

            arr.add(t);
        }
        return  arr;
    }

    public static void newTicket(){

    }

//    public static void main(String[] args) throws SQLException {
//        TicketDAO td = new TicketDAO();
//        System.out.println(td.getTicketList(1).get(0).getId());
//    }
}