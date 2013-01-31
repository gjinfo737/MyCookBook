package com.cukeshow.mycookbook;

import java.util.ArrayList;
import java.util.List;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.SelectableBodAdapter;
import android.os.Bundle;

import com.cukeshow.mycookbook.R.layout;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable;
import com.cukeshow.mycookbook.selectables.click.RecipeClickListener;

public class SelectRecipeActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.select_recipe_activity_start);
		create();
	}

	@Override
	protected void onResume() {
		super.onResume();
		resume();
	}

	@Override
	protected void loadList() {
		for (int i = 0; i < Commons.recipes.size(); i++) {
			Commons.recipes.get(i).setMOnClickListener(
					new RecipeClickListener(this, i));
		}
	}

	@Override
	protected void setUpList() {
		BodaciousAdapter<Selectable> bodaciousStringAdapter = new SelectableBodAdapter(
				radiusItemusPopulus, getLayoutInflater());

		List<Selectable> selectables = new ArrayList<Selectable>();
		for (int i = 0; i < Commons.recipes.size(); i++) {
			selectables.add(Commons.recipes.get(i));
		}
		selectables.add(new QuitSelectable(this, "Quit"));
		bodaciousStringAdapter.setList(selectables, selectables.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}

}
