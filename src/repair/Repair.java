package repair;

public class Repair {
	 private int repair_number;
	 private String repair_man;
	 private String repair_check_record;
	 private String repair_record;
	 private String repair_check_time;
	 private String repair_work_amount;
	 private String repair_use_device;
	 private String repair_state;

	
		public Repair(){
			
		}
		 public Repair(int repair_number, String repair_man,
				String repair_check_record, String repair_record,
				String repair_check_time, String repair_work_amount,
				String repair_use_device, String repair_state) {
			super();
			this.repair_number = repair_number;
			this.repair_man = repair_man;
			this.repair_check_record = repair_check_record;
			this.repair_record = repair_record;
			this.repair_check_time = repair_check_time;
			this.repair_work_amount = repair_work_amount;
			this.repair_use_device = repair_use_device;
			this.repair_state = repair_state;
		}
		public int getRepair_number() {
			return repair_number;
		}
		public void setRepair_number(int repair_number) {
			this.repair_number = repair_number;
		}
		public String getRepair_man() {
			return repair_man;
		}
		public void setRepair_man(String repair_man) {
			this.repair_man = repair_man;
		}
		public String getRepair_check_record() {
			return repair_check_record;
		}
		public void setRepair_check_record(String repair_check_record) {
			this.repair_check_record = repair_check_record;
		}
		public String getRepair_record() {
			return repair_record;
		}
		public void setRepair_record(String repair_record) {
			this.repair_record = repair_record;
		}
		public String getRepair_check_time() {
			return repair_check_time;
		}
		public void setRepair_check_time(String repair_check_time) {
			this.repair_check_time = repair_check_time;
		}
		public String getRepair_work_amount() {
			return repair_work_amount;
		}
		public void setRepair_work_amount(String repair_work_amount) {
			this.repair_work_amount = repair_work_amount;
		}
		public String getRepair_use_device() {
			return repair_use_device;
		}
		public void setRepair_use_device(String repair_use_device) {
			this.repair_use_device = repair_use_device;
		}
		public String getRepair_state() {
			return repair_state;
		}
		public void setRepair_state(String repair_state) {
			this.repair_state = repair_state;
		}
	
	 


	}




