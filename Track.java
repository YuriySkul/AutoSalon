package Lesson4HomeTasks;

public class Track {

	private String number;
	private Car car;
	private boolean isMoving = false;
	private boolean isConnectedToCar = false;
	
	
	public void setConnectedToCar(boolean isConnectedToCar) {
		this.isConnectedToCar = isConnectedToCar;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	

	
	public Track(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void PrintAbMe() {
		System.out.print("������� � �������� " + number);
		if (isMoving) {
			System.out.println(" ��������");
		} else {
			System.out.println(" ����� ");
		}
		if (isConnectedToCar) {
			System.out.println("������������ � ������ � ������� "
					+ car.getCarName() + " " + car.getCarNumber());
		} else {
			System.out.println("���������� � ������� - ���.");
		}
	}

	public void roll() {
		System.out.print("������� � ������� " + number);
		if (isMoving) {
			System.out.println(" �� ����� ������ �������� ��� ��� ��� �������.");
			
		} else {
			System.out.println(" ������ ��������.");
			isMoving = true;
			this.isConnectedToCar = true;
		}
 	}

	public void stop() {
		System.out.print("������� � �������� " + number);
		if (isMoving) {
			System.out.println(" ������������");
			isMoving = false;
		} else {
			System.out.println(" �� ����� ������������ ��� ��� ��� �����");
		}
	}
}
