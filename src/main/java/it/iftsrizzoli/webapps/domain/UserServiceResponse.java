package it.iftsrizzoli.webapps.domain;

public class UserServiceResponse {

	private User user;
	private boolean result;

	/**
	 * @param user
	 * @param result
	 */
	public UserServiceResponse(User user, boolean result) {
		this.user = user;
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "UserServiceResponse [user=" + user + ", result=" + result + "]";
	}

}
