package com.cukeshow.mycookbook.selectables;

import android.view.View.OnClickListener;

public class Ingregients extends ThingsToDo {
	public Ingregients(int Drawable, OnClickListener clickListener) {
		this("Ingregients", "...", Drawable, clickListener);
	}

	public Ingregients(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

}
