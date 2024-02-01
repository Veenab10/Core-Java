package Constructor_RunnerClass;

import Constructor_class.Biscuit;
import Constructor_class.Location;
import Constructor_class.Monkey;
import Constructor_class.Tree;

public class BiscuitRunnerClass {

	public static void main(String[] args) {
		
		Tree  tree = new Tree();
		tree.name="Banyan";
		System.out.println(tree.name);
		
		tree.monkey=new Monkey();
		tree.monkey.age=21;
		System.out.println(tree.monkey.age);
		
		tree.monkey.type="Snow Monkey";
		System.out.println(tree.monkey.type);
		
		tree.location=new Location();
		tree.location.area="BTM";
		System.out.println(tree.location.area);
		
		tree.location.city="Banglore";
		System.out.println(tree.location.city);
		
		tree.monkey.biscuit=new Biscuit();
		tree.monkey.biscuit.brand="parle";
		System.out.println(tree.monkey.biscuit.brand);
		
		tree.monkey.biscuit.cost=100;
		System.out.println(tree.monkey.biscuit.cost);
		
		
		

	}

}
