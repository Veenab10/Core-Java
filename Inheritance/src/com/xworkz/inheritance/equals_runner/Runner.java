package com.xworkz.inheritance.equals_runner;

import com.xworkz.inheritance.equal_method.Belt;
import com.xworkz.inheritance.equal_method.Button;
import com.xworkz.inheritance.equal_method.Carrom;
import com.xworkz.inheritance.equal_method.Fan;
import com.xworkz.inheritance.equal_method.Glass;
import com.xworkz.inheritance.equal_method.Lace;
import com.xworkz.inheritance.equal_method.Ladder;
import com.xworkz.inheritance.equal_method.Mug;
import com.xworkz.inheritance.equal_method.Plate;
import com.xworkz.inheritance.equal_method.Shoes;
import com.xworkz.inheritance.equal_method.Socks;
import com.xworkz.inheritance.equal_method.Stand;
import com.xworkz.inheritance.single_inheritance.Shoe;

public class Runner {
	
	public static void main(String[] args) {
		
		Glass glass1=new Glass();
		glass1.brand="Yera";
		glass1.materialType="glass";
		glass1.occasion="Party";
		glass1.price=100;
		glass1.shape="Tumblers";
		glass1.style="Epitome";
		
		Glass glass2=new Glass();
		glass2.brand="Yera";
		glass2.materialType="glass";
		glass2.occasion="Party";
		glass2.price=100;
		glass2.shape="Tumblers";
		glass2.style="Epitome";
		
		Glass glass3=new Glass();
		glass3.brand="Borosil";
		glass3.materialType="steel";
		glass3.occasion="Party";
		glass3.price=150;
		glass3.shape="Tumblers";
		glass3.style="Epitome";
		
		boolean result1=glass1.equals(glass2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=glass1.equals(glass3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=glass2.equals(glass3);
		System.out.println(result3);
		System.out.println("*************************************");
		
		Ladder ladder1=new Ladder();
		ladder1.brand="Plantex";
		ladder1.height=30;
		ladder1.color="White";
		ladder1.material="Aluminium";
		ladder1.steps=4;
		ladder1.price=2000;
		
		Ladder ladder2=new Ladder();
		ladder2.brand="Plantex";
		ladder2.height=30;
		ladder2.color="White";
		ladder2.material="Aluminium";
		ladder2.steps=4;
		ladder2.price=2000;
		
		Ladder ladder3=new Ladder();
		ladder3.brand="Agaro";
		ladder3.height=30;
		ladder3.color="White";
		ladder3.material="Aluminium";
		ladder3.steps=5;
		ladder3.price=2800;
		
		boolean res1=ladder1.equals(ladder2);
		System.out.println(res1);
		System.out.println("----------------------------");
		
		boolean res2=ladder1.equals(ladder3);
		System.out.println(res2);
		System.out.println("----------------------------");
		
		boolean res3=ladder2.equals(ladder3);
		System.out.println(res3);
		System.out.println("*************************************");
		
		Plate plate1=new Plate();
		plate1.brand="KC";
		plate1.material="steel";
		plate1.occasion="Baby Shower";
		plate1.price=60;
		plate1.pattern="Solid";
		plate1.shape="Round";
		
		Plate plate2=new Plate();
		plate2.brand="KC";
		plate2.material="steel";
		plate2.occasion="Baby Shower";
		plate2.price=60;
		plate2.pattern="Solid";
		plate2.shape="Round";
		
		Plate plate3=new Plate();
		plate3.brand="Irida Naturals";
		plate3.material="Straw";
		plate3.occasion="Baby Shower";
		plate3.price=80;
		plate3.pattern="Solid";
		plate3.shape="Round";
		
		boolean same1=plate1.equals(plate2);
		System.out.println(same1);
		System.out.println("----------------------------");
		
		boolean same2=plate1.equals(plate3);
		System.out.println(same2);
		System.out.println("----------------------------");
		
		boolean same3=plate2.equals(plate3);
		System.out.println(same3);
		System.out.println("*************************************");
		
		Mug mug1=new Mug();
		mug1.brand="Dubblin";
		mug1.color="Blue";
		mug1.material="Ceramic";
		mug1.occasion="Birthday";
		mug1.price=100;
		mug1.theme="Elegant";
		
		Mug mug2=new Mug();
		mug2.brand="Dubblin";
		mug2.color="Blue";
		mug2.material="Ceramic";
		mug2.occasion="Birthday";
		mug2.price=100;
		mug2.theme="Elegant";
		
		Mug mug3=new Mug();
		mug3.brand="Generic";
		mug3.color="Blue";
		mug3.material="Ceramic";
		mug3.occasion="Birthday";
		mug3.price=300;
		mug3.theme="Elegant";
		
		boolean output1=mug1.equals(mug2);
		System.out.println(output1);
		System.out.println("----------------------------");
		
		boolean output2=mug1.equals(mug3);
		System.out.println(output2);
		System.out.println("----------------------------");
		
		boolean output3=mug2.equals(mug3);
		System.out.println(output3);
		System.out.println("*************************************");

		Carrom carrom=new Carrom();
		carrom.brand="Ba Sports";
		carrom.category="Board Games";
		carrom.genre="Family";
		carrom.material="Wood";
		carrom.price=1600;
		carrom.size=20;
		
		Carrom carrom1=new Carrom();
		carrom1.brand="Ba Sports";
		carrom1.category="Board Games";
		carrom1.genre="Family";
		carrom1.material="Wood";
		carrom1.price=1600;
		carrom1.size=20;
		
		Carrom carrom2=new Carrom();
		carrom2.brand="Volatility";
		carrom2.category="Board Games";
		carrom2.genre="Family";
		carrom2.material="Engineered Wood";
		carrom2.price=1500;
		carrom2.size=20;
		
		boolean bool1=carrom.equals(carrom1);
		System.out.println(bool1);
		System.out.println("----------------------------");
		
		boolean bool2=carrom.equals(carrom2);
		System.out.println(bool2);
		System.out.println("----------------------------");
		
		boolean bool3=carrom1.equals(carrom2);
		System.out.println(bool3);
		System.out.println("*************************************");
		
		Stand stand1=new Stand();
		stand1.brand="Tygot";
		stand1.color="Black";
		stand1.feet=7;
		stand1.patternName="Tripod";
		stand1.weight=265;
		stand1.price=350;
		
		Stand stand2=new Stand();
		stand2.brand="Tygot";
		stand2.color="Black";
		stand2.feet=7;
		stand2.patternName="Tripod";
		stand2.weight=265;
		stand2.price=350;
		
		Stand stand3=new Stand();
		stand3.brand="Star Work";
		stand3.color="Black";
		stand3.feet=10;
		stand3.patternName="Tripod";
		stand3.weight=265;
		stand3.price=150;
		
		boolean support1=stand1.equals(stand2);
		System.out.println(support1);
		System.out.println("----------------------------");
		
		boolean support2=stand1.equals(stand3);
		System.out.println(support2);
		System.out.println("----------------------------");
		
		boolean support3=stand2.equals(stand3);
		System.out.println(support3);
		System.out.println("*************************************");
		
		Button button=new Button();
		button.brand="Dasya Enterprises";
		button.color="White";
		button.material="Plastic";
		button.price=40;
		button.shape="Round";
		button.madeIn="India";
		
		Button button1=new Button();
		button1.brand="Dasya Enterprises";
		button1.color="White";
		button1.material="Plastic";
		button1.price=40;
		button1.shape="Round";
		button1.madeIn="India";
		
		Button button2=new Button();
		button2.brand="Embroiderymaterial";
		button2.color="White";
		button2.material="Brass";
		button2.price=80;
		button2.shape="Round";
		button2.madeIn="India";
		
		boolean value1=button.equals(button1);
		System.out.println(value1);
		System.out.println("----------------------------");
		
		
		boolean value2=button.equals(button2);
		System.out.println(value2);
		System.out.println("----------------------------");
		
		
		boolean value3=button1.equals(button2);
		System.out.println(value3);
		System.out.println("*************************************");
		
		
		Fan fan=new Fan();
		fan.brand="Usha";
		fan.controlMethod="Remote";
		fan.noOfBlades=3;
		fan.price=3000;
		fan.speed=134;
		fan.switchType="push Button";
		
		
		Fan fan1=new Fan();
		fan1.brand="Usha";
		fan1.controlMethod="Remote";
		fan1.noOfBlades=3;
		fan1.price=3000;
		fan1.speed=134;
		fan1.switchType="push Button";
		
		
		Fan fan2=new Fan();
		fan2.brand="Orient Electric";
		fan2.controlMethod="App";
		fan2.noOfBlades=4;
		fan2.price=4000;
		fan2.speed=180;
		fan2.switchType="push Button";
		
		boolean rs1=fan.equals(fan1);
		System.out.println(rs1);
		System.out.println("----------------------------");
		
		boolean rs2=fan.equals(fan2);
		System.out.println(rs2);
		System.out.println("----------------------------");
		
		boolean rs3=fan1.equals(fan2);
		System.out.println(rs3);
		System.out.println("*************************************");
		
		Socks sock=new Socks();
		sock.brand="Jockey";
		sock.apparelMaterial="Cotton";
		sock.color="Black";
		sock.occasion="Casual";
		sock.price=340;
		sock.style="Modern";
		

		Socks sock1=new Socks();
		sock1.brand="Jockey";
		sock1.apparelMaterial="Cotton";
		sock1.color="Black";
		sock1.occasion="Casual";
		sock1.price=340;
		sock1.style="Modern";
		

		Socks sock2=new Socks();
		sock2.brand="adidas";
		sock2.apparelMaterial="Cotton";
		sock2.color="Black";
		sock2.occasion="Casual";
		sock2.price=400;
		sock2.style="Modern";
		
		boolean ot1=sock.equals(sock1);
		System.out.println(ot1);
		System.out.println("----------------------------");
		
		boolean ot2=sock.equals(sock2);
		System.out.println(ot2);
		System.out.println("----------------------------");
		
		boolean ot3=sock1.equals(sock2);
		System.out.println(ot3);
		System.out.println("*************************************");
		
		Belt belt=new Belt();
		belt.brand="Zoro";
		belt.apparelMaterial="Cotton";
		belt.color="Black";
		belt.occasion="Casual";
		belt.price=250;
		belt.size='s';
		
		Belt belt1=new Belt();
		belt1.brand="Zoro";
		belt1.apparelMaterial="Cotton";
		belt1.color="Black";
		belt1.occasion="Casual";
		belt1.price=250;
		belt1.size='s';
		
		Belt belt2=new Belt();
		belt2.brand="Van Heusen";
		belt2.apparelMaterial="Rayon";
		belt2.color="White";
		belt2.occasion="Casual";
		belt2.price=200;
		belt2.size='X';
		
		boolean s1=belt.equals(belt1);
		System.out.println(s1);
		System.out.println("----------------------------");
		
		
		boolean s2=belt.equals(belt2);
		System.out.println(s2);
		System.out.println("----------------------------");
		
		
		boolean s3=belt1.equals(belt2);
		System.out.println(s3);
		System.out.println("*************************************");
		
		Shoes shoe1=new Shoes();
		shoe1.brand="Puma";
		shoe1.archType="Flat";
		shoe1.color="Blue";
		shoe1.material="Leather";
		shoe1.price=2000;
		shoe1.size='s';
		
		Shoes shoe2=new Shoes();
		shoe2.brand="Puma";
		shoe2.archType="Flat";
		shoe2.color="Blue";
		shoe2.material="Leather";
		shoe2.price=2000;
		shoe2.size='s';
		
		Shoes shoe3=new Shoes();
		shoe3.brand="adidas";
		shoe3.archType="High-Top";
		shoe3.color="Blue";
		shoe3.material="Leather";
		shoe3.price=1000;
		shoe3.size='s';
		
		boolean a1=shoe1.equals(shoe2);
		System.out.println(a1);
		System.out.println("----------------------------");
		

		boolean a2=shoe1.equals(shoe3);
		System.out.println(a2);
		System.out.println("----------------------------");
		
		
		boolean a3=shoe2.equals(shoe3);
		System.out.println(a3);
		System.out.println("*************************************");
		
		Lace lace=new Lace();
		lace.brand="BOBBINY";
		lace.color="White";
		lace.length=80;
		lace.material="Polypropylene";
		lace.occasion="Graduation";
		lace.price=199;
		
		Lace lace1=new Lace();
		lace1.brand="BOBBINY";
		lace1.color="White";
		lace1.length=80;
		lace1.material="Polypropylene";
		lace1.occasion="Graduation";
		lace1.price=199;

		Lace lace2=new Lace();
		lace2.brand="Embroiderymaterial";
		lace2.color="Golden";
		lace2.length=50;
		lace2.material="Polypropylene";
		lace2.occasion="Birthday";
		lace2.price=99;
		
		boolean l1=lace.equals(lace1);
		System.out.println(l1);
		System.out.println("----------------------------");
		
		boolean l2=lace.equals(lace2);
		System.out.println(l2);
		System.out.println("----------------------------");

		boolean l3=lace1.equals(lace2);
		System.out.println(l3);
		System.out.println("*************************************");


	}

}
