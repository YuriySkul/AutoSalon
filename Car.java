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
//    1 - стоит, двигатель выключен; 2-стоит,двигатель включен; 3 - едет.
	private int movingStatus = 1;

	public void printAbMe() {
		System.out.println("Машина - " + carName + "\nНомер - " + carNumber
				+ "\nЦвет - " + color);
		System.out.print("Сосотояние машины - ");
		switch (movingStatus) {
		case 1:
			System.out.println("Двигатель выключен.Машина стоит.");
			break;
		case 2:
			System.out.println("Двигатель включен. Машина стоит. ");
			break;
		case 3:
			System.out.println("Двигатель включен. Машина едет");
			break;
		}
		if (track == null) {
			System.out.println("Машина не имеет подсоединений с прицепом");
		} else {
			System.out.println("Имеется подсоединение с прицепом:");
			track.PrintAbMe();
		}

	};

	public void connectWithTrack(Track t) {
		if ((this.track == null) && (t.getCar() == null)) {
			this.track = t;
			this.track.setCar(this);
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " и прицеп " + track.getNumber()
					+ " успешно подсоединены друг к другу.");
			        this.track.setConnectedToCar(true);
			    
		   } else if (this.track != null) {
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ "не может быть присоединена к прицепу" + t.getNumber()
					+ "так как уже имеет прицеп" + track.getNumber());
		
		} else {
			System.out
					.println("Машина " + carName + " с номером " + carNumber
							+ " не может быть присоединена к прицепу "
							+ t.getNumber()
							+ " так как прицеп присоединен к другой машине - "
							+ t.getCar().carName + " c номером "
							+ t.getCar().carNumber);
		}
	}

	public void disConnectWithTrack() {
		if (this.track == null) {
			System.out
					.println("Машина "
							+ carName
							+ " с номером "
							+ carNumber
							+ " не может быть отсоединена от прицепа, так как у неё нету прицепа");
		} else {
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " и прицеп " + track.getNumber()
					+ " успешно отсоединены друг к другу.");
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

	// Moving status. 1 - выключен двигатель,стоит; 2 включен двигатель, стоит;
	// 3-включен двигатель, едет.

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
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " не может поехать. Двигатель не включен.");
			break;
		case 2:
			movingStatus = 3;
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " начала двигаться.");
		
			if ( this.track!=null ){
				this.track.roll();
				movingStatus  = 3; 
			}
			break;
		case 3:
			System.out
					.println("Машина "
							+ carName
							+ " с номером "
							+ carNumber
							+ " не может начать движение так как уже находится в этом состоянии.");
			break;
		}
	}

	public void start() {
		switch (movingStatus) {
		case 1:
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " завела двигатель.");
			movingStatus = 2;
			
			break;
		case 2:
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " не может завестись. Двигатель и так заведен уже.");
			break;
		case 3:
			System.out
					.println("Машина "
							+ carName
							+ " с номером "
							+ carNumber
							+ " не может завестись.Двигатель и так заведен и машина едет.");
			break;
		}
	}

	public void stop() {
		switch (movingStatus) {
		case 1:
			System.out
					.println("Машина "
							+ carName
							+ " с номером "
							+ carNumber
							+ " не может остановиться и выключить двигатель так как уже в этом состоянии.");

			break;
		case 2:
			movingStatus = 1;
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " выключила двигатель.");
			if ( this.track!=null ){
				this.track.stop();
			}
			break;
		case 3:
			movingStatus = 1;
			System.out.println("Машина " + carName + " с номером " + carNumber
					+ " Остановилась и выключила свой двигатель.");
			if ( this.track!=null ){
				this.track.stop();
			}
			break;
		}
	}
}
