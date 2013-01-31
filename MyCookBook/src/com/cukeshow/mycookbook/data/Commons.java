package com.cukeshow.mycookbook.data;

import java.util.ArrayList;
import java.util.List;

import com.cukeshow.mycookbook.R.drawable;
import com.cukeshow.mycookbook.R.id;
import com.cukeshow.mycookbook.R.layout;
import com.cukeshow.mycookbook.selectables.CookingAndServingSteps;
import com.cukeshow.mycookbook.selectables.Ingregients;
import com.cukeshow.mycookbook.selectables.PreparationSteps;
import com.cukeshow.mycookbook.selectables.Recipe;
import com.cukeshow.mycookbook.selectables.Selectable;

public class Commons {
	public static final int BOD_RADIUS_DEFAULT = layout.bod_radius_default;
	public static final int BODACIOUS_LISTVIEW_ID = id.bodacious_listView;
	public static final int RADIUS_ITEM_BODACIOUS = id.bod_radius_item_bodacious;
	public static final int RADIUS_SUB_LAYOUT_ID = id.sub_rellay;
	public static final int RADIUS_ITEM_CONTAINER_ID = id.bod_radius_item_container;
	public static final int[] RADIUS_LAYOUTS = new int[] { layout.bod_radius_0,
			layout.bod_radius_1, layout.bod_radius_2, layout.bod_radius_3,
			layout.bod_radius_4, layout.bod_radius_5, layout.bod_radius_6,
			layout.bod_radius_7, layout.bod_radius_8,

	};
	public static final int[] RADIUS_LAYOUT_ITEM_IDS = new int[] {
			id.bod_radius_item_0, id.bod_radius_item_1, id.bod_radius_item_2,
			id.bod_radius_item_3, id.bod_radius_item_4, id.bod_radius_item_5,
			id.bod_radius_item_6, id.bod_radius_item_7, id.bod_radius_item_8, };
	public static final List<List<Selectable>> thingsToDo = new ArrayList<List<Selectable>>() {
		{
			add(new ArrayList<Selectable>() {
				{
					add(new Ingregients(drawable.ic_launcher, null));
					add(new PreparationSteps(drawable.ic_launcher, null));
					add(new CookingAndServingSteps(drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<Selectable>() {
				{
					add(new Ingregients(drawable.ic_launcher, null));
					add(new PreparationSteps(drawable.ic_launcher, null));
					add(new CookingAndServingSteps(drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<Selectable>() {
				{
					add(new Ingregients(drawable.ic_launcher, null));
					add(new PreparationSteps(drawable.ic_launcher, null));
					add(new CookingAndServingSteps(drawable.ic_launcher, null));
				}
			});

		}
	};

	@SuppressWarnings("serial")
	public static final List<Recipe> recipes = new ArrayList<Recipe>() {
		{
			add(new Recipe("Cucumber and Onions", "Healthy Snacks",
					drawable.ic_launcher, null, thingsToDo.get(0)));
			add(new Recipe("Beef Stew", "Hearty Meals", drawable.ic_launcher,
					null, thingsToDo.get(1)));
			add(new Recipe("Fruit Parfait", "Healthy Desserts",
					drawable.ic_launcher, null, thingsToDo.get(2)));
		}
	};
}
