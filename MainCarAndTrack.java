//1) ������� ����� Car(String number, String color) ������������. 
// ������: 
// 1. move - ������(�� ������ �����, ���� �� ��������!)
// 2. start - ���������(����� �������, ���� � ��������)
// 3. stop -  ������ ���������, � ����������� ���������.
// 
//2) ������� ����� Track()(String number;)
//������:
// roll() - ������ ��������( �� ������ �������� ��������, ���� ��� �������)
// stop() - ���������� �������( �� ������ �������� ������������, ���� ��� �����������) 
//� �����: 
// - ������� ��� ������� ��������
// - ��� �����, 
// - ������ �������� ������ ��� ���
// - ��� ������� �������������
// - ������ ����� �������������
// �������� ������ Car, Track, AutoSalon.
// class Car{String number; String color; Track track;}
// class Track{String number; Car car;}
// class AutoSalon{ArrayList<Car> cars;ArrayList<Track> tracks; String[] menuList;}
// class MainAutoSalon{ 
//  public static void main(String[] args){
//   AutoSalon autoSalon = new AutoSalon();
//   autoSalon.start();
//  }}
// ���������� � ����������� � �����������:
// 1. ���� ������ ��������� �� ������ ����, �� ������ ��� ��������� ��� ��������.
// 2. ���� ������ �� ���������� � �������� ����, �� ������ ��� ��������� �� ����� ����.
// 3. ������ ����������� � ����������� ������ ���� � ������ Car
// � ������ �������, ������� ������ ���� ���������, ��� ����, ����� ���� ������������ ������
// ���� ��������:
// 1. �������� ����� ����������
// 2. �������� ����� ������
// 3. ��������� � ���� ������(������ �������� ���� � ��������)
// 4. ��������� �� ���� ������(������ ������� ����).
// 5. ���������� ������ ����.
// 6. ���������� ������ ��������.
// 7. ���������� ����������� ���� �� ���������.
// 8*. ������� ����� start ��� ���� (������ ������� ����).
// 9*. ������� ����� move ��� ���� (������ ������� ����).
// 10*. ������� ����� stop ��� ���� (������ ������� ����).
// 11**. ���������� ������ ���� ���� � �������� � ������������� � ����������� ���� � ��������.
// 12. �����
// ������� *: ������� ������ ������ Car (start, move, stop) � �������� ������ Track(roll,stop). 
// ��� ������� ������� ����� move ��� ����, ��������� ����� roll ��� �������. 
// ��� ������� ������� ����� stop ��� ����, ��������� ����� stop ��� �������.

package Lesson4HomeTasks;

import java.util.Scanner;

public class MainCarAndTrack {

	public static void main(String[] args) {
       AutoSalon autoSalon = new AutoSalon();
	   autoSalon.start();
		
		
		
		
//		Track track1 = new Track("111");
//		Track track2 = new Track("222");
//		track1.PrintAbMe();
//		track2.PrintAbMe();
//		track1.roll();
//		track2.roll();
//		track2.roll();
//		track1.stop();
//		track2.stop();
//		track2.stop();
//		track1.PrintAbMe();
//		track2.PrintAbMe();
//		System.out.println();
//		Car car1 = new Car("������","c123","������");
//		Car car2 = new Car("������", "�234","�����");
//		Car car3 = new Car("������","�657","�������");
//		car1.printAbMe();
//		car1.start();
//		car1.start();
//		car2.start();
//		car1.printAbMe();
//		car1.move();
//		car1.move();
//		car1.printAbMe();
//		car3.move();
//		car1.stop();
//		car2.stop();
//		car3.stop();
//		car1.printAbMe();
		
//	   track1.PrintAbMe();
//	   System.out.println(".............................");
//	   System.out.println(track1.getCar());
//	   System.out.println(car1.getTrack());
//	    car1.connectWithTrack(track1);
//	   System.out.println(track1.getCar());
//	   System.out.println(car1.getTrack());
//	   car2.connectWithTrack(track2);
//	   car3.connectWithTrack(track1);
//	   car3.disConnectWithTrack();
//	   car2.disConnectWithTrack();
//	   car2.connectWithTrack(track2);
	   


	}

}
