package com.jroticag.init;

import com.jroticag.item.ItemJmod;
import com.jroticag.item.ItemMapleLeaf;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemJmod mapleLeaf = new ItemMapleLeaf();
	
	public static void init(){
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
