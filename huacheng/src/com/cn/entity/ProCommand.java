package com.cn.entity;

public class ProCommand {
        private int cid;
        private int pid;
        private String content;
        private String userName;
		public ProCommand(int cid, int pid, String content, String userName) {
			super();
			this.cid = cid;
			this.pid = pid;
			this.content = content;
			this.userName = userName;
		}
		public ProCommand() {
			super();
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
        
}
