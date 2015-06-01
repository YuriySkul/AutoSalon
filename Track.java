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
		System.out.print("Тележка с номемром " + number);
		if (isMoving) {
			System.out.println(" движется");
		} else {
			System.out.println(" стоит ");
		}
		if (isConnectedToCar) {
			System.out.println("Подсоединена к машине с номером "
					+ car.getCarName() + " " + car.getCarNumber());
		} else {
			System.out.println("Соединений с машиной - нет.");
		}
	}

	public void roll() {
		System.out.print("Тележка с номером " + number);
		if (isMoving) {
			System.out.println(" не может начать катиться так как уже катится.");
			
		} else {
			System.out.println(" начала катиться.");
			isMoving = true;
			this.isConnectedToCar = true;
		}
 	}

	public void stop() {
		System.out.print("Тележка с номемром " + number);
		if (isMoving) {
			System.out.println(" остановилась");
			isMoving = false;
		} else {
			System.out.println(" не может остановиться так как уже стоит");
		}
	}
}
