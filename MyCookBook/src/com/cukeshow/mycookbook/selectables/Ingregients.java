package com.cukeshow.mycookbook.selectables;

import java.util.List;

import android.view.View.OnClickListener;

public class Ingregients extends ThingsToDo {
	private List<Ingregients> Ingredients;

	public Ingregients(int Drawable, OnClickListener clickListener,
			List<Ingregients> list) {
		this("Ingregients", "...", Drawable, clickListener);
		this.setIngredients(list);
	}

	public Ingregients(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

	public List<Ingregients> getIngredients() {
		return Ingredients;
	}

	public void setIngredients(List<Ingregients> ingredients) {
		Ingredients = ingredients;
	}

}
