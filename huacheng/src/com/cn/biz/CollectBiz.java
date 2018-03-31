package com.cn.biz;

import java.util.List;

import com.cn.dao.CollectService;
import com.cn.entity.Agriinfo;
import com.cn.entity.AgriinfoandAcollectId;
import com.cn.entity.Product;
import com.cn.entity.ProductandPcollectId;
import com.cn.entity.UserTable;
import com.cn.entity.Usershow;

public class CollectBiz {
        private CollectService cs=new CollectService();
        public List<Product> getproductbyuserId(UserTable usertable){
        	return cs.getproductbyuserId(usertable);
        	
        }
        public boolean insertusershow(String userName,String nickName,String sex,int age,String cons,String job,String company,String school,String address,String interest,String headimageUrl){
        return cs.insertusershow(userName, nickName, sex, age, cons, job, company, school, address, interest, headimageUrl);
        }
        public Usershow showusershow(String userName){
   		 return cs.showusershow(userName);
   	 }
        public boolean isexistsusershow(String userName){
        	return cs.isexistsusershow(userName);
        }
        public boolean updateusershow(String userName,String nickName,String sex,int age,String cons,String job,String company,String school,String address,String interest){
         return cs.updateusershow(userName, nickName, sex, age, cons, job, company, school, address, interest);
        }
        public List<Agriinfo> getagriinfobyuserId(UserTable usertable){
        	return cs.getagriinfobyuserId(usertable);
        }
        public List<AgriinfoandAcollectId> getagriinfocollectbypage(int startindex,int rows,UserTable usertable){
        return cs.getagriinfocollectbypage(startindex, rows, usertable);
        }
        public int getagriinforowcountbyuser(UserTable usertable){
        	return cs.getagriinforowcountbyuser(usertable);
        }
        
        public List<ProductandPcollectId> getproductscollectbypage(int startindex,int rows,UserTable usertable){
        return cs.getproductscollectbypage(startindex, rows, usertable);
        }
        
        public int getproductbyuser(UserTable usertable){
        	return cs.getproductbyuser(usertable);
        }
        
        public boolean cancelagricollect(int acollectId){
        	return cs.cancelagricollect(acollectId);
        }
        public boolean cancelproductcollect(int pcollectId){
        	return cs.cancelproductcollect(pcollectId);
        }
}
