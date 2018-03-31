package com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cn.entity.Agriinfo;
import com.cn.entity.Comment;
import com.cn.entity.Comment1;
import com.cn.entity.Product;
import com.cn.entity.UserTable;

public class Dao {

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rst=null;
	  
	public List<Agriinfo> getAgriinfo(){
		Agriinfo agriinfo=null;
		List<Agriinfo> agriinfoList=new ArrayList<Agriinfo>();
		try{
			con=DBManager.getCon();
			String sql="select * from Agriinfo";
			pst=con.prepareStatement(sql);
			rst=pst.executeQuery();
			while(rst.next()){
				agriinfo=new Agriinfo(rst.getInt("aId"),rst.getString("atitle"),rst.getString("aimageUrl"),rst.getInt("atypeId"),rst.getString("author"),rst.getDate("addtime"),rst.getString("content"));
				agriinfoList.add(agriinfo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.closeResultSet(rst);
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return agriinfoList;
	}
	
	public List<Agriinfo> getagriinfoByType(String atypeName,int startindex,int rows){
		Agriinfo agriinfo=null;
		List<Agriinfo> agriinfoList=new ArrayList<Agriinfo>();
		try{
			con=DBManager.getCon();
			String sql="select * from agriinfo,agritype where agriinfo.atypeId=agritype.atypeId and atypeName=? limit ?,?";
			pst=con.prepareStatement(sql);
			pst.setString(1,atypeName);
			pst.setInt(2, startindex);
	  		pst.setInt(3, rows);
			rst=pst.executeQuery();
			while(rst.next()){
				agriinfo=new Agriinfo(rst.getInt("aId"),rst.getString("atitle"),rst.getString("aimageUrl"),rst.getInt("atypeId"),rst.getString("author"),rst.getDate("addtime"),rst.getString("content"));		
				agriinfoList.add(agriinfo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.closeResultSet(rst);
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return agriinfoList;
	}
	//通过农资的类型获得对应的农资列表的总行数
    public int getagriinfobyatypeNamerowcount(String atypeName){
    	int i=0;
    	try{
    		con=DBManager.getCon();
    		String sql="select count(*) from agriinfo,agritype where agriinfo.atypeId=agritype.atypeId and atypeName=? ";
    		pst=con.prepareStatement(sql);
    		pst.setString(1,atypeName);
    		rst=pst.executeQuery();
    		if(rst.next()){
    			i=rst.getInt(1);
    		}
    	}catch(Exception e){
  		  e.printStackTrace();
  		
  	  }
  	  finally{
  		  DBManager.closeResultSet(rst);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	return i;
    }
	public Agriinfo getagriinfoById(int aId){
		Agriinfo agriinfo=null;
		try{
			con=DBManager.getCon();
			String sql="select * from agriinfo,agritype where agriinfo.atypeId=agritype.atypeId and aId=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1,aId);
			rst=pst.executeQuery();
			while(rst.next()){
				agriinfo=new Agriinfo(rst.getInt("aId"),rst.getString("atitle"),rst.getString("aimageUrl"),rst.getInt("atypeId"),rst.getString("author"),rst.getDate("addtime"),rst.getString("content"));		
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.closeResultSet(rst);
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return agriinfo;
	}
	 //在collect表中插入收藏的农资
    public boolean insertCollect(Agriinfo agriinfo,UserTable usertable){
    	try{
    		con=DBManager.getCon();
    		String sql="insert into acollect(agriId,userName) values(?,?)";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1,agriinfo.getaId());
    		pst.setString(2,usertable.getUserName());
    		pst.execute();
    		return true;
    	}catch(Exception e){
    		  e.printStackTrace();
    		  return false;
    	  }
    	  finally{
    		  
    		  DBManager.closeStatement(pst);
    		  DBManager.closeCon(con);
    	  }
 
    }
	public List<Agriinfo> getTopfive(){
		List<Agriinfo> topfiveList=new ArrayList<Agriinfo>();
		Agriinfo agriinfo=null;
		try{
			con=DBManager.getCon();
			String sql="select * from agriinfo limit 5";
			pst=con.prepareStatement(sql);
			rst=pst.executeQuery();
			while(rst.next()){
				agriinfo=new Agriinfo(rst.getInt("aId"),rst.getString("atitle"),rst.getString("aimageUrl"),rst.getInt("atypeId"),rst.getString("author"),rst.getDate("addtime"),rst.getString("content"));
				topfiveList.add(agriinfo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.closeResultSet(rst);
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return topfiveList;
	}
	
	public boolean addComment(int aId,String mcontent,String userName){
		try{
			con=DBManager.getCon();
			String sql="insert into agricomment (aId,content,userName) values(?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setInt(1, aId);
			pst.setString(2, mcontent);
			pst.setString(3, userName);
			pst.execute();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return true;
	}
	public List<Comment1> showCommentByuserName(String userName){
		List<Comment1> commentList=new ArrayList<Comment1>();
		Comment1 comment=null;
		try{
			con=DBManager.getCon();
			String sql="select * from agricomment,agriinfo where agricomment.aid=agriinfo.aId and userName=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, userName);
			rst=pst.executeQuery();
			while(rst.next()){
				comment=new Comment1(rst.getInt("cId"),rst.getInt("aId"),rst.getString("content"),rst.getString("userName"),rst.getString("atitle"));
				commentList.add(comment);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.closeResultSet(rst);
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return commentList;
	} 
	public List<Comment> getCommentById(int aId){
		List<Comment> commentList=new ArrayList<Comment>();
		Comment comment=null;
		try{
			con=DBManager.getCon();
			String sql="select * from agricomment where aId=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, aId);
			rst=pst.executeQuery();
			while(rst.next()){
				comment=new Comment(rst.getInt("cId"),rst.getInt("aId"),rst.getString("content"),rst.getString("userName"));
				commentList.add(comment);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBManager.closeResultSet(rst);
			DBManager.closeStatement(pst);
			DBManager.closeCon(con);
		}
		return commentList;
	}
	//分页的方法
    public List<Agriinfo> getagriinfobypage(int startindex,int rows){
    	List<Agriinfo> alist=new ArrayList<Agriinfo>();
    	try{
    		con=DBManager.getCon();
    		String sql="select * from agriinfo limit ?,?";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1,startindex);
    		pst.setInt(2,rows);
    		rst=pst.executeQuery();
    		while(rst.next()){
    			Agriinfo agriinfo=new Agriinfo(rst.getInt("aId"),rst.getString("atitle"),rst.getString("aimageUrl"),rst.getInt("atypeId"),rst.getString("author"),rst.getDate("addtime"),rst.getString("content"));
    		    alist.add(agriinfo);
    		}
    	}catch(Exception e){
  		  e.printStackTrace();
  		
  	  }
  	  finally{
  		  DBManager.closeResultSet(rst);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	return alist;
    	
    }
    //得到数据库产品表中的总行数
    public int getagriinforowcount(){
    	int i=0;
    	try{
    		con=DBManager.getCon();
    		String sql="select count(*) from agriinfo";
    		pst=con.prepareStatement(sql);
    		rst=pst.executeQuery();
    		if(rst.next()){
    			i=rst.getInt(1);
    		}
    	}catch(Exception e){
  		  e.printStackTrace();
  		
  	  }
  	  finally{
  		  DBManager.closeResultSet(rst);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	return i;
    }
    
    public boolean addFeedback(int userId,String fInfo){
    	try{
    		con=DBManager.getCon();
    		String sql="insert into feedback(userId,fInfo) values(?,?)";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1, userId);
    		pst.setString(2, fInfo);
    		pst.execute();
    		return true;
    	}catch(Exception e){
  		  e.printStackTrace();
  		  return false;
  	  }
  	  finally{
  		  DBManager.closeResultSet(rst);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	
    }
    //随机获取一个推送消息
    
   
    
    
    }

