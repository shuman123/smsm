package com.cn.biz;

import java.util.List;

import com.cn.dao.ProductService;
import com.cn.entity.Company;
import com.cn.entity.ProCommand;
import com.cn.entity.ProCommand1;
import com.cn.entity.Product;
import com.cn.entity.UserTable;

public class ProductBiz {
         private ProductService ps=new ProductService();
         public List<Product> getAllproduct(){
        	 return ps.getAllproduct(); 
         }
         public List<Product> getproductbyptypeName(String ptypeName,int startindex,int rows){
        	 return ps.getproductbyptypeName(ptypeName,startindex,rows);
         }
         public int getproductsbyptypeNamerowcount(String ptypeName){
        	 return ps.getproductsbyptypeNamerowcount(ptypeName);
         }
         public Product getproductbypId(int pId){
        	 return ps.getproductbypId(pId);
         }
         public Company getcompanybypId(int pId){
        	 return ps.getcompanybypId(pId);
         }
         public boolean insertCollect(Product product,UserTable usertable){
        	 return ps.insertCollect(product,usertable);
         }
         public boolean insertCommand(int pid,String content,String userName){
        	 return ps.insertCommand(pid, content, userName);
         }
         public List<ProCommand> showProcommand(int pid){
        	 return ps.showProcommand(pid);
         }
         public List<ProCommand1> showProcommandbyuserName(String userName){
        	 return ps.showProcommandbyuserName(userName);
         }
         public List<Product> getproductsbypage(int startindex,int endindex){
        	 return ps.getproductsbypage(startindex, endindex);
         }
         public int getproductsrowcount(){
        	 return ps.getproductsrowcount();
         }
}
