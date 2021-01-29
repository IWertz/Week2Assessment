package model;

public class Environment {
	private int time;
	private String weather;
	public Environment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Environment(int time, String weather) {
		super();
		this.time = time;
		this.weather = weather;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	public boolean isDay(int _time) {
		_time = _time %24000;
		if (_time >= 12000) {
			return false;
		} else {
			return true;
		}
	}
}
