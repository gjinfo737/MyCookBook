package com.cukeshow.mycookbook.fakedata;

import java.util.ArrayList;
import java.util.List;

import com.cukeshow.mycookbook.R.drawable;
import com.cukeshow.mycookbook.selectables.RecipeClickListener;
import com.cukeshow.mycookbook.selectables.Selectable;

@SuppressWarnings("serial")
public class Recipes {

	public static final List<Selectable> RECIPES = new ArrayList<Selectable>() {
		{
			add(new Selectable("Cucumber and Onions", "Healthy Snacks",
					drawable.ic_launcher, new RecipeClickListener(0)));
			add(new Selectable("Beef Stew", "Hearty Meals",
					drawable.ic_launcher, new RecipeClickListener(1)));
			add(new Selectable("Fruit Parfait", "Healthy Desserts",
					drawable.ic_launcher, new RecipeClickListener(2)));

		}
	};
}
