package repair;


	
	
public interface RepairFun {
	
		   Repair getRepByNo(int repair_number);
		    void insertRep(Repair repair); 
		    void deleteRepByNo(int repair_number);
		    void updateRepByNo(Repair repair);

		}




