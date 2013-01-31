package com.cukeshow.mycookbook;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class RecipeMainScreenActivity extends Activity {

	private static int recipeIndex = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("", "" + recipeIndex + "&&&&&&");
	}

	public static void setCurrentRecipeIndex(int iD) {
		RecipeMainScreenActivity.recipeIndex = iD;
	}
}
