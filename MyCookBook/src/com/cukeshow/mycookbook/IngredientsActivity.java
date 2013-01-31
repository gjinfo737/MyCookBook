package com.cukeshow.mycookbook;

import java.util.ArrayList;
import java.util.List;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.SelectableBodAdapter;
import android.os.Bundle;
import android.util.Log;

import com.cukeshow.mycookbook.R.layout;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Ingregients;
import com.cukeshow.mycookbook.selectables.Recipe;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.ThingsToDo;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable;

public class IngredientsActivity extends BaseActivity {

	private BodaciousAdapter<Selectable> bodaciousStringAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.select_recipe_activity_start);
		create();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void loadList() {
		// for (int i = 0; i < Commons.recipes.size(); i++) {
		// Commons.recipes.get(i).setMOnClickListener(
		// new RecipeClickListener(this, i));
		// }
	}

	@Override
	protected void setUpList() {
		bodaciousStringAdapter = new SelectableBodAdapter(radiusItemusPopulus,
				getLayoutInflater());
		Recipe recipe = Commons.recipes.get(RecipeMainScreenActivity
				.getCurrentRecipeIndex());
		Log.e("", "recipe = " + recipe.getTitle());

		List<ThingsToDo> thingsToDo = recipe.getThingsToDo();
		List<Ingregients> ingredients = ((Ingregients) thingsToDo
				.get(ThingsToDo.INGREDIENTS_LIST_INDEX)).getIngredients();
		int numberOfIngredients = ingredients.size();

		List<Selectable> selectables = new ArrayList<Selectable>();
		for (int i = 0; i < numberOfIngredients; i++) {
			selectables.add(ingredients.get(i));
		}

		selectables.add(new QuitSelectable(this, "Back To Recipe"));
		bodaciousStringAdapter.setList(selectables, selectables.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}
}
