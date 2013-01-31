package com.cukeshow.mycookbook.selectables;

import android.view.View.OnClickListener;

public class CookingAndServingSteps extends ThingsToDo {
	public CookingAndServingSteps(int Drawable, OnClickListener clickListener) {
		this("Cooking and Serve", "...", Drawable, clickListener);
	}

	public CookingAndServingSteps(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

}