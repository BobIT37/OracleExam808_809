package com.wealth.certificate.dumps_1z0_809_ert.question045;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Block {

	String color;
	int size;

	Block(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public static void main(String[] args) {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(10, "Green"));
		blocks.add(new Block(7, "Red"));
		blocks.add(new Block(12, "Blue"));
		Collections.sort(blocks, new ColorSorter());
		/*for(Block b : blocks){
			System.out.println(b.color);
		}*/
	}
}

class ColorSorter implements Comparator<Block>{

	@Override
	public int compare(Block o1, Block o2) {
		return o1.color.compareTo(o2.color);
	}

	
	
}
