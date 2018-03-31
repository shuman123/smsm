package com.cn.dao;

import java.util.ArrayList;
import java.util.List;
import com.cn.entity.Product;


public class SplitmessagePager {
         private final int pageSize=7;
         public int currentPage=1;
         private List<Product> pagelist;
         //设置要分页的集合
         public void setPagelist(List<Product> pagelist){
    	    this.pagelist=pagelist;  
         }
         //根据用户的 操作，改变当前页的记录
       public void setCurrentPage(int how){
    	   switch(how){
    	   case 1:
    		   currentPage=1;
    	       break;
    	   case 2:
    		   currentPage=currentPage-1;
    		   if(currentPage<1){
    			   currentPage=1;
    		   }
    	       break;
    	   case 3:
    		   currentPage=currentPage+1; 
    		   if(currentPage>this.getpagecount()){
    			   currentPage=this.getpagecount(); 
    		   }
    		   break;
    	   case 4:
    		   currentPage=this.getpagecount();
    		   break;
    	   }   
       }
       //总共有多少页
       public int getpagecount(){
    	   int size=this.pagelist.size();
    	   return (size%this.pageSize==0)?size/this.pageSize:(size/this.pageSize+1);
       }
       //得到当前要显示的数据集合
       public List<Product> getCurrentPageList(){
    	     int startIndex=(this.currentPage-1)*this.pageSize;
    	     int endIndex=startIndex+this.pageSize;
    	     if(endIndex>this.pagelist.size()){
    	    	 endIndex=this.pagelist.size();
    	     }
    	     List<Product> saveList=new ArrayList<Product>();
    	     for(int i=startIndex;i<endIndex;i++){
    	    	 saveList.add((Product) this.pagelist.get(i));
    	     }
    	     return saveList;
       }
       //得到当前页数
       public int getCurrentPage(){
    	     return currentPage;  
       }
}
