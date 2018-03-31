package com.cn.entity;

public class Advertise {
        private int adId;
        private String imageUrl;
        private String title;
        private String content;
		public int getAdId() {
			return adId;
		}
		public void setAdId(int adId) {
			this.adId = adId;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Advertise(int adId, String imageUrl, String title, String content) {
			super();
			this.adId = adId;
			this.imageUrl = imageUrl;
			this.title = title;
			this.content = content;
		}
		public Advertise() {
			super();
		}
		
}
