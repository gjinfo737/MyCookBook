package com.cukeshow.mycookbook.selectables.lists;

import java.util.List;

import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.CookAndServeStep;
import com.cukeshow.mycookbook.selectables.ThingsToDo;

public class CookingAndServingStepsList extends ThingsToDo {
	private List<CookAndServeStep> cookAndServeSteps;

	public CookingAndServingStepsList(int Drawable,
			OnClickListener clickListener, List<CookAndServeStep> list) {
		this(Commons.PREPARATION_STEPS, list.size() + "", Drawable,
				clickListener);
		this.setIngredients(list);
	}

	public CookingAndServingStepsList(String Title, String SubTitle,
			int Drawable, OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

	public List<CookAndServeStep> getIngredients() {
		return cookAndServeSteps;
	}

	public void setIngredients(List<CookAndServeStep> ingredients) {
		cookAndServeSteps = ingredients;
	}
}