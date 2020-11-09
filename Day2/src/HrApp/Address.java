package HrApp;

public class Address {
	private int DoorNo;
	private String City;
	private String State;

	public Address(int doorNo, String city, String state) {
		super();
		this.DoorNo = doorNo;
		this.City = city;
		this.State = state;
	}

	public int getDoorNo() {
		return DoorNo;
	}

	public void setDoorNo(int doorNo) {
		DoorNo = doorNo;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [DoorNo=" + DoorNo + ", City=" + City + ", State=" + State + "]";
	}

}
