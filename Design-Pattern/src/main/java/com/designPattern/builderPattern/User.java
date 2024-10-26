package com.designPattern.builderPattern;

public class User{
	
	private final String userId;
	private final String userName;
	private final String userEmailId;
	
	private User(UserBuilder userBuilder) {
		this.userEmailId = userBuilder.userEmailId;
		this.userName = userBuilder.userName;
		this.userId = userBuilder.userId;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userId + " : " + this.userName + " : " + this.userEmailId;
	}
	
	public static class UserBuilder {
		private String userId;
		private String userName;
		private String userEmailId;
		
		public UserBuilder() {
			
		}
		
		public static UserBuilder builder() {
			return new UserBuilder();
		}
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserEmailId(String userEmailId) {
			this.userEmailId = userEmailId;
			return this;
		}
		
		public User build() {
			return new User(this);
		}	
	}
}
