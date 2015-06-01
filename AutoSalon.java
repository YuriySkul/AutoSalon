package Lesson4HomeTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
//	private static int carsCounter = 0;
//	private static int trailersCounter = 0;
	private static int counter = 0;
	static ArrayList<Car> carsList = new ArrayList<Car>();
	static ArrayList<Track> trailersList = new ArrayList<>();
	private static String[] operationNames = { "1. �������� ����� ����������", "2. �������� ����� ������",
			"3. ��������� � ���� ������(������ �������� ���� � ��������)", 
			"4. ��������� �� ���� ������(������ ������� ����)." ,"5. ���������� ������ ����.",
			"6. ���������� ������ ��������.","7. ���������� ����������� ���� �� ���������.",
			"8*. ������� ����� start ��� ���� (������ ������� ����).",
			"9*. ������� ����� move ��� ���� (������ ������� ����).",
			"10*. ������� ����� stop ��� ���� (������ ������� ����).",
			"11**. ���������� ������ ���� ���� � �������� � ������������� � ����������� ���� � ��������.",
			"12. �������� ����� 11 ����� � 8 �������� �� �������","13. �����"};
	
	 public static void printMenu(){
		  for(String m:operationNames) System.out.println(m);
		 }
	 public static void start(){
		 Scanner scan = new Scanner(System.in);
		 boolean runWhile = true;
		 while(runWhile){
			 printMenu();
		     System.out.println("�������� ��������:");
		     int k = scan.nextInt();
		     switch (k){
		     	case 1:addNewCar() ;break;
		     	case 2:addNewTrailer()  ;break;
		     	case 3:connectCarWithTrailer() ;break;
		     	case 4:disconnectCarFromTrailer()  ;break;
		     	case 5:printCarsList()  ;break;
		        case 6:printTrailersList()  ;break;
		        case 7:printConnectionsList()  ;break;
		        case 8:startEnjine()  ;break;
		        case 9:move()  ;break;
		        case 10:stop()  ;break;
		        case 11:printInfo() ;break;
		     	case 12:setCarsAndTrailersFromBasement()  ;break;
		     	case 13:runWhile = false;
		   }
		  }
	 }
	   
	 
		
	
	public static void addNewCar(){
		   Scanner scan1 = new Scanner(System.in);
		   System.out.println("������� �������� ������");
		   String k = scan1.nextLine();
		   System.out.println("������� ����� ������");
		   String l = scan1.nextLine();
		   System.out.println("������� ���� ������");
		   String m = scan1.nextLine();
		   carsList.add(new Car(k,l,m));
//		   carsCounter
		   System.out.println("������  "+carsList.get(carsList.size()-1).getCarName()+" � ������� "+carsList.get(carsList.size()-1).getCarNumber()+ " ������� � �����");
		   end();  
	   }
	   public static void addNewTrailer(){
		   Scanner scan1 = new Scanner(System.in);
		   System.out.println("������� ����� �������");
		   String str = scan1.nextLine();
		   trailersList.add(new Track(str));
		   System.out.println("������ c �������"+trailersList.get(trailersList.size()-1).getNumber()+"�������� � �����");
		   end();
	   }
	   public static void connectCarWithTrailer(){
		   int carPositionInTheList = 0;
		   int trailerPositionInTheList=0;
		   Scanner scan = new Scanner(System.in);
		   printCarsList();
		  System.out.println("�������� ������� � ������� ������� ������ ������������. ������� ����� - ����� �������.");  
		  carPositionInTheList = scan.nextInt()-1;
		  Scanner scan1 = new Scanner(System.in);
		  printTrailersList();
		  System.out.println("�������� ������� � �������� ������� ������ ������������. ������� ����� - ����� �������.");
		  trailerPositionInTheList = scan.nextInt()-1;
		  carsList.get(carPositionInTheList).connectWithTrack(trailersList.get(trailerPositionInTheList));
		  end();
	   }
	   public static void disconnectCarFromTrailer(){
		   int carPositionInTheList = 0;
		   Scanner scan = new Scanner(System.in);
		   printCarsList();  
		  System.out.println("�������� ������� � ������� ������� ������ ����������� �� �������. ������� ����� - ����� �������.");  
		  carPositionInTheList = scan.nextInt()-1;
		  carsList.get(carPositionInTheList).disConnectWithTrack();
		  end();
	   }
	   public static void printCarsList(){
		   	   for(int i = 0; i < carsList.size(); i++){
			   int k =i+1;
			   System.out.println(k+". "+carsList.get(i).getCarName());
	        };  
	        end();
	   }
	   public static void printTrailersList(){
		   	   for(int i = 0; i < trailersList.size(); i++){
			   int k =i+1;
			   System.out.println(k+". ������ � ������� "+trailersList.get(i).getNumber());
		  };   
		  end();
	   }
	   public static void printConnectionsList(){
		   int i = 0;
		   int k = 1;
		   for( i = 0; i < carsList.size(); i++){
			   if (carsList.get(i).getTrack()!= null){
				   System.out.println(k+". "+carsList.get(i).getCarName()+" ����������� � ������� � ������� "+carsList.get(i).getTrack().getNumber() );
				   k++;
			   };
		   }
		   end();
	   }
	   public static void startEnjine(){
		   Scanner scan = new Scanner(System.in);
		   printCarsList();  
	        System.out.println("�������� ������� ������ ������� ������ �������.");
	        int carPositionInTheList = scan.nextInt()-1;
			carsList.get(carPositionInTheList).start();
			end();
	   }
	   public static void move(){
		   Scanner scan = new Scanner(System.in);
		   printCarsList();
	       System.out.println("�������� ������� ������ ������� ������ �������.");
	        int carPositionInTheList = scan.nextInt()-1;
			carsList.get(carPositionInTheList).move();
			end();
	   }
	   public static void stop(){
		   Scanner scan = new Scanner(System.in);
		   printCarsList();
	        System.out.println("�������� ������� ������ ������� ������ �������.");
	        int carPositionInTheList = scan.nextInt()-1;
			carsList.get(carPositionInTheList).stop();
			end();
	   }
	   public static void printInfo(){
		   for (int i = 0; i < carsList.size(); i ++){
			   int k = i+1;
			   System.out.print(k+".");
			   carsList.get(i).printAbMe();
		   }
		   System.out.println();
		   for (int i = 0; i < trailersList.size(); i ++){
			   int k = i+1;
			   System.out.print(k+".");
			   trailersList.get(i).PrintAbMe();
		   }
		   end();
	   }
	   public static void setCarsAndTrailersFromBasement(){
		  if(counter == 0){
			  Car car1 = new Car("Hundai ������", "c123", "Black");
			  Car car2 = new Car("Volkswagen Passat ", "�234", "Red");
			  Car car3 = new Car("Honda accord", "�657", "Green");
			  Car car4 = new Car("Pegeot 307RCZ)", "�657", "White");
			  Car car5 = new Car("Mercedes gerlic", "�657", "Yellow");
			  Car car6 = new Car("Ford mondeo", "�657", "Grey");
			  Car car7 = new Car("��� �����", "�657", "Silvery");
			  Car car8 = new Car("Audi TT", "�657", "Metal");
			  Car car9 = new Car("Toyota camry", "�657", "Blue");
			  Car car10 = new Car("BMW X5", "�657", "DarkRed");
			  Car car11 = new Car("Mercedes smart", "�657", "Pink");

			  Track track1 = new Track("111");
			  Track track2 = new Track("222");
			  Track track3 = new Track("333");
			  Track track4 = new Track("444");
			  Track track5 = new Track("555");
			  Track track6 = new Track("666");
			  Track track7 = new Track("777");
			  Track track8 = new Track("888");
	
			  carsList.add(car1);
			  carsList.add(car2);
			  carsList.add(car3);
			  carsList.add(car4);
			  carsList.add(car5);
			  carsList.add(car6);
			  carsList.add(car7);
			  carsList.add(car8);
			  carsList.add(car9);
			  carsList.add(car10);
			  carsList.add(car11);
			  trailersList.add(track1);
			  trailersList.add(track2);
			  trailersList.add(track3);
			  trailersList.add(track4);
			  trailersList.add(track5);
			  trailersList.add(track6);
			  trailersList.add(track7);
			  trailersList.add(track8);
			  System.out.println("11 ����� � 8 �������� ��������� � �����.");
			  counter = 1;
		  }else{
			  System.out.println("������� �����, ������ ��� ��������� ����� � ��������.");
		  }
		  end();
	  }
	

	
public static void end(){
	 System.out.println(".......................................................");
}
	

}