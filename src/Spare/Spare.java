package Spare;

public class Spare {
	
	public Spare(){
		
	}	
	private String spare_name;
	 private String spare_typw;
	 private int spare_count;
	 private String spare_price;
	 private String spare_to_lib_time;
	 private int spare_alert_count;
	
	 public Spare(String spare_name, String spare_typw, int spare_count,
			String spare_price, String spare_to_lib_time, int spare_alert_count) {
		super();
		this.spare_name = spare_name;
		this.spare_typw = spare_typw;
		this.spare_count = spare_count;
		this.spare_price = spare_price;
		this.spare_to_lib_time = spare_to_lib_time;
		this.spare_alert_count = spare_alert_count;
	}

	public String getSpare_name() {
		return spare_name;
	}

	public void setSpare_name(String spare_name) {
		this.spare_name = spare_name;
	}

	public String getSpare_typw() {
		return spare_typw;
	}

	public void setSpare_typw(String spare_typw) {
		this.spare_typw = spare_typw;
	}

	public int getSpare_count() {
		return spare_count;
	}

	public void setSpare_count(int spare_count) {
		this.spare_count = spare_count;
	}

	public String getSpare_price() {
		return spare_price;
	}

	public void setSpare_price(String spare_price) {
		this.spare_price = spare_price;
	}

	public String getSpare_to_lib_time() {
		return spare_to_lib_time;
	}

	public void setSpare_to_lib_time(String spare_to_lib_time) {
		this.spare_to_lib_time = spare_to_lib_time;
	}

	public int getSpare_alert_count() {
		return spare_alert_count;
	}

	public void setSpare_alert_count(int spare_alert_count) {
		this.spare_alert_count = spare_alert_count;
	}

	

}
