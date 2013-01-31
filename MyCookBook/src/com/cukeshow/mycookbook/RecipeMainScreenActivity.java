package com.cukeshow.mycookbook;

import java.util.List;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.SelectableBodAdapter;
import android.os.Bundle;

import com.cukeshow.mycookbook.R.layout;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable.IQuitter;

public class RecipeMainScreenActivity extends BaseActivity implements IQuitter {

	private static int recipeIndex = -1;
	public List<Selectable> thingsToDo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.recipe_main_screen_activity);
		create();
	}

	@Override
	protected void onResume() {
		super.onResume();
		resume();
	}

	@Override
	protected void loadList() {
		this.thingsToDo = Commons.recipes.get(recipeIndex).getThingsToDo();
	}

	@Override
	protected void setUpList() {
		BodaciousAdapter<Selectable> bodaciousStringAdapter = new SelectableBodAdapter(
				radiusItemusPopulus, getLayoutInflater());

		thingsToDo.add(new QuitSelectable(this, "Back"));
		bodaciousStringAdapter.setList(thingsToDo, thingsToDo.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}

	public static void setCurrentRecipeIndex(int ID) {
		RecipeMainScreenActivity.recipeIndex = ID;
	}

}
