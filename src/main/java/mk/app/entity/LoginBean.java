package mk.app.entity;

import org.springframework.stereotype.Component;

@Component
public class LoginBean {
String stName;
String stCode;
String distName;
String distCode;
public String getStName() {
	return stName;
}
public void setStName(String stName) {
	this.stName = stName;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getDistName() {
	return distName;
}
public void setDistName(String distName) {
	this.distName = distName;
}
public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
}