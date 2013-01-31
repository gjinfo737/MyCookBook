package com.cukeshow.mycookbook.selectables.click;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.activities.ttdo.IngredientsActivity;

public class ThingsToDoClickListener implements OnClickListener {

	private int recipeIndex = -1;
	private int ID = -1;
	private Activity activity;

	public ThingsToDoClickListener(Activity activity, int recipeIndex, int id) {
		this.setRecipeIndex(recipeIndex);
		this.ID = id;
		this.activity = activity;
	}

	@Override
	public void onClick(View v) {
		Log.e("things to do click", "recipeIndex: " + recipeIndex + " ID: "
				+ ID);
		if (ID == 0) {
			Intent intentRecMainScreen = new Intent(activity,
					IngredientsActivity.class);
			activity.startActivity(intentRecMainScreen);
		}
	}

	public int getRecipeIndex() {
		return recipeIndex;
	}

	public void setRecipeIndex(int recipeIndex) {
		this.recipeIndex = recipeIndex;
	}
}
