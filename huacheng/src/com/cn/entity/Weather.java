package com.cn.entity;

public class Weather {
        private int wId;
        private String city;
        private int temperature;
        private String wImageUrl;
        private int maxTemparature;
        private int minTemparature;
        private int wetLevel;
        private int ultraviolet;
		public Weather(int wId, String city, int temperature, String wImageUrl,
				int maxTemparature, int minTemparature, int wetLevel,
				int ultraviolet) {
			super();
			this.wId = wId;
			this.city = city;
			this.temperature = temperature;
			this.wImageUrl = wImageUrl;
			this.maxTemparature = maxTemparature;
			this.minTemparature = minTemparature;
			this.wetLevel = wetLevel;
			this.ultraviolet = ultraviolet;
		}
		public Weather() {
			super();
		}
		public int getwId() {
			return wId;
		}
		public void setwId(int wId) {
			this.wId = wId;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getTemperature() {
			return temperature;
		}
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}
		public String getwImageUrl() {
			return wImageUrl;
		}
		public void setwImageUrl(String wImageUrl) {
			this.wImageUrl = wImageUrl;
		}
		public int getMaxTemparature() {
			return maxTemparature;
		}
		public void setMaxTemparature(int maxTemparature) {
			this.maxTemparature = maxTemparature;
		}
		public int getMinTemparature() {
			return minTemparature;
		}
		public void setMinTemparature(int minTemparature) {
			this.minTemparature = minTemparature;
		}
		public int getWetLevel() {
			return wetLevel;
		}
		public void setWetLevel(int wetLevel) {
			this.wetLevel = wetLevel;
		}
		public int getUltraviolet() {
			return ultraviolet;
		}
		public void setUltraviolet(int ultraviolet) {
			this.ultraviolet = ultraviolet;
		}
        
}
