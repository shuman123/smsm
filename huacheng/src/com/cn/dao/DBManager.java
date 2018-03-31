package com.cn.dao;
import java.sql.*;
public class DBManager {
	private static final String driver="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/huacheng?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String user="root";
    private static final String pwd="123456";
    private static Connection con=null;
//���������ݿ������    
    public static Connection getCon(){
    	try{
    		Class.forName(driver);
    		con=DriverManager.getConnection(url,user,pwd);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
		return con;
    }
//�ر�Connection
    public static void closeCon(Connection con){
    	try{
    		if(con!=null){
    			con.close();
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
//�ر�ResultSet
    public static void closeResultSet(ResultSet rst){
    	try{
    		if(rst!=null){
    			rst.close();
    			rst=null;
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
//�ر�Statement
    public static void closeStatement(PreparedStatement pst){
    	try{
    		if(pst!=null){
    			pst.close();
    			pst=null;
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
