package com.zhangkaishun.user.domain;

public class User {
private int id;
private String password;
private String icon;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}
@Override
public String toString() {
	return "User [id=" + id + ", password=" + password + ", icon=" + icon + "]";
}

}
