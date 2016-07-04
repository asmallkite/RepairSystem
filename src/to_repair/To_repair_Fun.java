package to_repair;

public interface To_repair_Fun {
	
	To_repair_stament getToRepairByNo(String to_repair_number );
	void insertToRepair(To_repair_stament to_repair_stament);
	void deleteToRepairByNo(String to_repair_number);
	void updateToRepairByNo(String to_repair_number);

}
