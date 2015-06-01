package Lesson4HomeTasks;

public class Car {
	private String carName;
	private String carNumber;
	private String color;
	private Track track;

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}
//    1 - �����, ��������� ��������; 2-�����,��������� �������; 3 - ����.
	private int movingStatus = 1;

	public void printAbMe() {
		System.out.println("������ - " + carName + "\n����� - " + carNumber
				+ "\n���� - " + color);
		System.out.print("���������� ������ - ");
		switch (movingStatus) {
		case 1:
			System.out.println("��������� ��������.������ �����.");
			break;
		case 2:
			System.out.println("��������� �������. ������ �����. ");
			break;
		case 3:
			System.out.println("��������� �������. ������ ����");
			break;
		}
		if (track == null) {
			System.out.println("������ �� ����� ������������� � ��������");
		} else {
			System.out.println("������� ������������� � ��������:");
			track.PrintAbMe();
		}

	};

	public void connectWithTrack(Track t) {
		if ((this.track == null) && (t.getCar() == null)) {
			this.track = t;
			this.track.setCar(this);
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " � ������ " + track.getNumber()
					+ " ������� ������������ ���� � �����.");
			        this.track.setConnectedToCar(true);
			    
		   } else if (this.track != null) {
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ "�� ����� ���� ������������ � �������" + t.getNumber()
					+ "��� ��� ��� ����� ������" + track.getNumber());
		
		} else {
			System.out
					.println("������ " + carName + " � ������� " + carNumber
							+ " �� ����� ���� ������������ � ������� "
							+ t.getNumber()
							+ " ��� ��� ������ ����������� � ������ ������ - "
							+ t.getCar().carName + " c ������� "
							+ t.getCar().carNumber);
		}
	}

	public void disConnectWithTrack() {
		if (this.track == null) {
			System.out
					.println("������ "
							+ carName
							+ " � ������� "
							+ carNumber
							+ " �� ����� ���� ����������� �� �������, ��� ��� � �� ���� �������");
		} else {
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " � ������ " + track.getNumber()
					+ " ������� ����������� ���� � �����.");
			this.track.setCar(null);
			this.track = null;
			this.track.setConnectedToCar(false);
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Moving status. 1 - �������� ���������,�����; 2 ������� ���������, �����;
	// 3-������� ���������, ����.

	public Car(String carName, String carNumber, String color) {
		this.carName = carName;
		this.carNumber = carNumber;
		this.color = color;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public void move() {
		switch (movingStatus) {
		case 1:
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " �� ����� �������. ��������� �� �������.");
			break;
		case 2:
			movingStatus = 3;
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " ������ ���������.");
		
			if ( this.track!=null ){
				this.track.roll();
				movingStatus  = 3; 
			}
			break;
		case 3:
			System.out
					.println("������ "
							+ carName
							+ " � ������� "
							+ carNumber
							+ " �� ����� ������ �������� ��� ��� ��� ��������� � ���� ���������.");
			break;
		}
	}

	public void start() {
		switch (movingStatus) {
		case 1:
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " ������ ���������.");
			movingStatus = 2;
			
			break;
		case 2:
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " �� ����� ���������. ��������� � ��� ������� ���.");
			break;
		case 3:
			System.out
					.println("������ "
							+ carName
							+ " � ������� "
							+ carNumber
							+ " �� ����� ���������.��������� � ��� ������� � ������ ����.");
			break;
		}
	}

	public void stop() {
		switch (movingStatus) {
		case 1:
			System.out
					.println("������ "
							+ carName
							+ " � ������� "
							+ carNumber
							+ " �� ����� ������������ � ��������� ��������� ��� ��� ��� � ���� ���������.");

			break;
		case 2:
			movingStatus = 1;
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " ��������� ���������.");
			if ( this.track!=null ){
				this.track.stop();
			}
			break;
		case 3:
			movingStatus = 1;
			System.out.println("������ " + carName + " � ������� " + carNumber
					+ " ������������ � ��������� ���� ���������.");
			if ( this.track!=null ){
				this.track.stop();
			}
			break;
		}
	}
}
