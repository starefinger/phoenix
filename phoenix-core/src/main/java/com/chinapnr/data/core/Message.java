/**
 * 
 */
package com.chinapnr.data.core;

public class Message {
	private Long id;
	private User user;
	private String content;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public User getUser() {return user;}
	public void setUser(User user) {this.user = user;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
}
