package com.cn.dao;

import java.util.ArrayList;
import java.util.List;
import com.cn.entity.Product;


public class SplitmessagePager {
         private final int pageSize=7;
         public int currentPage=1;
         private List<Product> pagelist;
         //����Ҫ��ҳ�ļ���
         public void setPagelist(List<Product> pagelist){
    	    this.pagelist=pagelist;  
         }
         //�����û��� �������ı䵱ǰҳ�ļ�¼
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
       //�ܹ��ж���ҳ
       public int getpagecount(){
    	   int size=this.pagelist.size();
    	   return (size%this.pageSize==0)?size/this.pageSize:(size/this.pageSize+1);
       }
       //�õ���ǰҪ��ʾ�����ݼ���
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
       //�õ���ǰҳ��
       public int getCurrentPage(){
    	     return currentPage;  
       }
}
