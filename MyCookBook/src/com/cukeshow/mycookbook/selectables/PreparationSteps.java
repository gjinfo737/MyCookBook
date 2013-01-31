package com.cukeshow.mycookbook.selectables;

import android.view.View.OnClickListener;

public class PreparationSteps extends ThingsToDo {
	public PreparationSteps(int Drawable, OnClickListener clickListener) {
		this("Preparations", "...", Drawable, clickListener);
	}

	public PreparationSteps(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

}