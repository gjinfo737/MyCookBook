package com.cukeshow.mycookbook.selectables;

import java.util.List;

import android.view.View.OnClickListener;

public class Recipe extends Selectable {

	private List<Selectable> thingsToDo;

	public Recipe(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener, List<Selectable> thingsToDo) {
		super(Title, SubTitle, Drawable, clickListener);
		this.setThingsToDo(thingsToDo);
	}

	public List<Selectable> getThingsToDo() {
		return thingsToDo;
	}

	public void setThingsToDo(List<Selectable> thingsToDo) {
		this.thingsToDo = thingsToDo;
	}

}
