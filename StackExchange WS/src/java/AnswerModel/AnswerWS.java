/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnswerModel;

import Database.DB;
import QuestionModel.QuestionWS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@WebService(serviceName = "AnswerWS")
public class AnswerWS {

  /* Connecting to Database */
  /* MANDATORY */
  Connection conn = DB.connect();  

  /**
   * Web service operation
   */
  @WebMethod(operationName = "getAnswerByQID")
  @WebResult(name="Answer")
  public java.util.ArrayList<Answer> getAnswerByQID(@WebParam(name = "qid") int qid) {
    ArrayList<Answer> answers = new ArrayList<Answer>();
    try {      
      Statement stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM answers WHERE id_question = ?";
      PreparedStatement dbStatement = conn.prepareStatement(sql);
      dbStatement.setInt(1, qid);
      
      ResultSet rs = dbStatement.executeQuery();
      
      // Extract data from result set
      int i = 0;
      while(rs.next()){        
        answers.add(new Answer( rs.getInt("id"),
                                 rs.getInt("id_question"),
                                 rs.getInt("id_user"),
                                 rs.getString("content"),
                                 rs.getString("timestamp")
                                ));   
        ++i;
      }
      
      rs.close();
      stmt.close();
      //conn.close();
    } catch (SQLException ex) {
      Logger.getLogger(QuestionWS.class.getName()).log(Level.SEVERE, null, ex);
    }
    return answers;
  }

}
