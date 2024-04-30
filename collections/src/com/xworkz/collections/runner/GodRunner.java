package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.GodDTO;

public class GodRunner {

	public static void main(String[] args) {
		GodDTO god1=new GodDTO("Rama", "Banglore", "male", "Vighnaraja", "Divine Protection");
		GodDTO god2=new GodDTO("Hanuman", "Baglkot", "male", "Vishnu's avatars", "Protection and Guidance");
		GodDTO god3=new GodDTO("Ayyappa", "Koppala", "male", "Rama ", "Protection and Guidance");
		GodDTO god4=new GodDTO("Ganesh", "Mount kishaa", "male", "ElephentHeaded", "Remove of obstacles");
		GodDTO god5=new GodDTO("Sarswati", "Gadag", "female", "Laxmi", "Protection and Courage");
		GodDTO god6=new GodDTO("Laxmi", "Kilashaa", "female", "Mahalakshmi", "Protection and Preservation");
		GodDTO god7=new GodDTO("Krishana", "Mysore", "male", "Govinda", "Devin wisdom and chram and ability to restore balanc");
		GodDTO god8=new GodDTO("Rama", "Uttar Pradesh", "male","Lord Vishnu", "Divine Protection");
		GodDTO god9=new GodDTO("Ganesh", "Mount kishaa", "male", "ElephentHeaded","Remove of obstacles");
		GodDTO god10=new GodDTO("Krishana", "Vrindavan", "male", "Govinda", "Devin Wisdom and chram and ability to restore balance");
		
		Collection<GodDTO> godCollection=new ArrayList<GodDTO>();
		godCollection.add(god1);
		godCollection.add(god2);
		godCollection.add(god3);
		godCollection.add(god4);
		godCollection.add(god5);
		godCollection.add(god6);
		godCollection.add(god7);
		godCollection.add(god8);
		godCollection.add(god9);
		godCollection.add(god10);
		
		//sort by  name by asc
		System.out.println("Sort by Name by Ascending");//small to high
		godCollection
		.stream()
		.sorted()
		.forEach(n->System.out.println(n));
		
		System.out.println("Sort by place by Desc");
		
		godCollection
		.stream()
		.sorted((g1,g2)->g2.getPlace().compareTo(g1.getPlace()))
		.forEach(g->System.out.println(g));
		
		System.out.println("Sort by place by ascending");
		godCollection
		.stream()
		.sorted((g1,g2)->g1.getPlace().compareTo(g2.getPlace()))
		.forEach(g->System.out.println(g));
		
		
		System.out.println("get all gods by gender male , sort by avatar in desc");//high to small
		godCollection
		.stream()
		.filter(g->g.getGender().equals("male"))
		.sorted((a1,a2)->a2.getAvatar().compareTo(a1.getAvatar()))
		.forEach(avatar->System.out.println(avatar));
		
		System.out.println("get all gods by gender female, sort by place in desc");
		
		godCollection
		.stream()
		.filter(g->g.getGender().equals("female"))
		.sorted((p1,p2)->p2.getPlace().compareTo(p1.getPlace()))
		.forEach(place->System.out.println(place));
		
		System.out.println("get only place sort by desc");
		
		godCollection
		.stream()
		.sorted((p1,p2)->p2.getPlace().compareTo(p1.getPlace()))
		.map(p->p.getPlace())
		.forEach(place->System.out.println(place));
		
		System.out.println("get only specialpower,sort by desc");
		
		godCollection
		.stream()
		.sorted((s1,s2)->s2.getSpecialPower().compareTo(s1.getSpecialPower()))
		.map(s->s.getSpecialPower())
		.forEach(sp->System.out.println(sp));
		
		
		System.out.println("get all by name and place and get only name sorted in desc");
		
		godCollection
		.stream()
		.filter(n->n.getName().equals("Krishana") && n.getPlace().equals("Vrindavan"))
		.map(name->name.getName())
		//.sorted((n1,n2)->n1.compareTo(n2))
		.forEach(n->System.out.println(n));
		
		
		
		
		
		
		
		

	}

}
