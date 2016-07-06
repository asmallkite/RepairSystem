package AcountJava;




/**
 * Created by 10648 on 2016/7/1 0001.
 */
public class Count {
	public Count(){
		
	}
 private int se_repair_number;
 private String se_repair_cast;
 private String se_material_cast;
 private String se_attention;
 private String se_time;
public Count(int se_repair_number, String se_repair_cast,
		String se_material_cast, String se_attention, String se_time) {
	super();
	this.se_repair_number = se_repair_number;
	this.se_repair_cast = se_repair_cast;
	this.se_material_cast = se_material_cast;
	this.se_attention = se_attention;
	this.se_time = se_time;
}
public int getSe_repair_number() {
	return se_repair_number;
}
public void setSe_repair_number(int se_repair_number) {
	this.se_repair_number = se_repair_number;
}
public String getSe_repair_cast() {
	return se_repair_cast;
}
public void setSe_repair_cast(String se_repair_cast) {
	this.se_repair_cast = se_repair_cast;
}
public String getSe_material_cast() {
	return se_material_cast;
}
public void setSe_material_cast(String se_material_cast) {
	this.se_material_cast = se_material_cast;
}
public String getSe_attention() {
	return se_attention;
}
public void setSe_attention(String se_attention) {
	this.se_attention = se_attention;
}
public String getSe_time() {
	return se_time;
}
public void setSe_time(String se_time) {
	this.se_time = se_time;
}

 


}

