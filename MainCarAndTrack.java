//1) Создаем класс Car(String number, String color) конструкторы. 
// Методы: 
// 1. move - ездить(не должна ехать, пока не заведена!)
// 2. start - заводимся(нелья завести, если в движении)
// 3. stop -  полная остановка, с выключением двигателя.
// 
//2) Создать класс Track()(String number;)
//Методы:
// roll() - начать катиться( не должен повторно катиться, если уже катится)
// stop() - остановить качение( не должен повторно остановиться, если уже остановлено) 
//В мейне: 
// - создать два объекта прицепов
// - оба катим, 
// - первый пытаемся катить еще раз
// - все прицепы останавливаем
// - второй опять останавливаем
// Написать классы Car, Track, AutoSalon.
// class Car{String number; String color; Track track;}
// class Track{String number; Car car;}
// class AutoSalon{ArrayList<Car> cars;ArrayList<Track> tracks; String[] menuList;}
// class MainAutoSalon{ 
//  public static void main(String[] args){
//   AutoSalon autoSalon = new AutoSalon();
//   autoSalon.start();
//  }}
// Требованию к закреплению и откреплению:
// 1. Если прицеп закреплен за другим авто, то нельзя его закрепить для текущего.
// 2. Если прицеп не прикреплен к текущему авто, то нельзя его открепить от этого авто.
// 3. Методы закрпеления и открепления должны быть в классе Car
// и другие правила, которые должны быть соблюдены, для того, чтобы была корректность ссылок
// Меню операций:
// 1. Добавить новый автомобиль
// 2. Добавить новый прицеп
// 3. Закрепить к авто прицеп(запрос индексов авто и прицепов)
// 4. Открепить от авто прицеп(запрос индекса авто).
// 5. Отобразить список авто.
// 6. Отобразить список прицепов.
// 7. Отобразить закрепления авто за прицепами.
// 8*. Вызвать метод start для авто (запрос индекса авто).
// 9*. Вызвать метод move для авто (запрос индекса авто).
// 10*. Вызвать метод stop для авто (запрос индекса авто).
// 11**. Отобразить список всех авто и прицепов с закреплениями и состояниями авто и прицепов.
// 12. Выход
// Задания *: связать методы класса Car (start, move, stop) с методами класса Track(roll,stop). 
// При попытке вызвать метод move для авто, вызвается метод roll для прицепа. 
// При попытке вызвать метод stop для авто, вызвается метод stop для прицепа.

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
//		Car car1 = new Car("Соната","c123","Черный");
//		Car car2 = new Car("Пассат", "с234","Белый");
//		Car car3 = new Car("Аккорд","с657","Красный");
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
