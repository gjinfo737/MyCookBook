package com.cukeshow.mycookbook.data;

import java.util.ArrayList;
import java.util.List;

import com.cukeshow.mycookbook.R.drawable;
import com.cukeshow.mycookbook.R.id;
import com.cukeshow.mycookbook.R.layout;
import com.cukeshow.mycookbook.selectables.CookAndServingStep;
import com.cukeshow.mycookbook.selectables.Ingredient;
import com.cukeshow.mycookbook.selectables.PreparatationStep;
import com.cukeshow.mycookbook.selectables.Recipe;
import com.cukeshow.mycookbook.selectables.ThingsToDo;
import com.cukeshow.mycookbook.selectables.lists.CookingAndServingStepsList;
import com.cukeshow.mycookbook.selectables.lists.IngredientsList;
import com.cukeshow.mycookbook.selectables.lists.PreparationStepsList;

public class Commons {
	public static final String PREPARATION_STEPS = "Preparation Steps";
	public static final String INGREDIENTS = "Ingredients";
	public static final String COOKING_AND_SERVING = "Cooking and Serving";
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
	public static final List<List<Ingredient>> ingredients = new ArrayList<List<Ingredient>>() {
		{
			add(new ArrayList<Ingredient>() {
				{
					add(new Ingredient("0", "", drawable.ic_launcher, null));
					add(new Ingredient("1", "", drawable.ic_launcher, null));
					add(new Ingredient("2", "", drawable.ic_launcher, null));
					add(new Ingredient("3", "", drawable.ic_launcher, null));
					add(new Ingredient("4", "", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<Ingredient>() {
				{
					add(new Ingredient("0", "", drawable.ic_launcher, null));
					add(new Ingredient("1", "", drawable.ic_launcher, null));
					add(new Ingredient("2", "", drawable.ic_launcher, null));
					add(new Ingredient("3", "", drawable.ic_launcher, null));
					add(new Ingredient("4", "", drawable.ic_launcher, null));
					add(new Ingredient("5", "", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<Ingredient>() {
				{
					add(new Ingredient("0", "", drawable.ic_launcher, null));
					add(new Ingredient("1", "", drawable.ic_launcher, null));
					add(new Ingredient("2", "", drawable.ic_launcher, null));
				}
			});

		}
	};
	public static final List<List<PreparatationStep>> prepSteps = new ArrayList<List<PreparatationStep>>() {
		{
			add(new ArrayList<PreparatationStep>() {
				{
					add(new PreparatationStep("0a", "", drawable.ic_launcher,
							null));
					add(new PreparatationStep("1", "", drawable.ic_launcher,
							null));
				}
			});
			add(new ArrayList<PreparatationStep>() {
				{
					add(new PreparatationStep("0b", "", drawable.ic_launcher,
							null));
					add(new PreparatationStep("1", "", drawable.ic_launcher,
							null));
				}
			});
			add(new ArrayList<PreparatationStep>() {
				{
					add(new PreparatationStep("0c", "", drawable.ic_launcher,
							null));
					add(new PreparatationStep("1", "", drawable.ic_launcher,
							null));
				}
			});

		}
	};
	public static final List<List<CookAndServingStep>> cookAndServeSteps = new ArrayList<List<CookAndServingStep>>() {
		{
			add(new ArrayList<CookAndServingStep>() {
				{
					add(new CookAndServingStep("0a", "", drawable.ic_launcher,
							null));
					add(new CookAndServingStep("1", "", drawable.ic_launcher,
							null));
				}
			});
			add(new ArrayList<CookAndServingStep>() {
				{
					add(new CookAndServingStep("0b", "", drawable.ic_launcher,
							null));
					add(new CookAndServingStep("1", "", drawable.ic_launcher,
							null));
				}
			});
			add(new ArrayList<CookAndServingStep>() {
				{
					add(new CookAndServingStep("0c", "", drawable.ic_launcher,
							null));
					add(new CookAndServingStep("1", "", drawable.ic_launcher,
							null));
				}
			});

		}
	};
	public static final List<List<ThingsToDo>> thingsToDo = new ArrayList<List<ThingsToDo>>() {
		{
			add(new ArrayList<ThingsToDo>() {
				{
					add(new IngredientsList(drawable.ic_launcher, null,
							ingredients.get(0)));
					add(new PreparationStepsList(drawable.ic_launcher, null,
							prepSteps.get(0)));
					add(new CookingAndServingStepsList(drawable.ic_launcher,
							null, cookAndServeSteps.get(0)));
				}
			});
			add(new ArrayList<ThingsToDo>() {
				{
					add(new IngredientsList(drawable.ic_launcher, null,
							ingredients.get(1)));
					add(new PreparationStepsList(drawable.ic_launcher, null,
							prepSteps.get(1)));
					add(new CookingAndServingStepsList(drawable.ic_launcher,
							null, cookAndServeSteps.get(1)));
				}
			});
			add(new ArrayList<ThingsToDo>() {
				{
					add(new IngredientsList(drawable.ic_launcher, null,
							ingredients.get(2)));
					add(new PreparationStepsList(drawable.ic_launcher, null,
							prepSteps.get(2)));
					add(new CookingAndServingStepsList(drawable.ic_launcher,
							null, cookAndServeSteps.get(2)));
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
