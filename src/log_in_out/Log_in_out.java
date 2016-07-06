package log_in_out;

public class Log_in_out {
	//登陆注册
	private String userid;
	private String password;
	
	
	
	public Log_in_out() {
		super();
	}
	public Log_in_out(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}
