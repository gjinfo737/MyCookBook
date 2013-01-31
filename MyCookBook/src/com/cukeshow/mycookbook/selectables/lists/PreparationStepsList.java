package com.cukeshow.mycookbook.selectables.lists;

import java.util.List;

import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.PrepartationStep;
import com.cukeshow.mycookbook.selectables.ThingsToDo;

public class PreparationStepsList extends ThingsToDo {
	private List<PrepartationStep> prepSteps;

	public PreparationStepsList(int Drawable, OnClickListener clickListener,
			List<PrepartationStep> list) {
		this(Commons.PREPARATION_STEPS, list.size() + "", Drawable,
				clickListener);
		this.setIngredients(list);
	}

	public PreparationStepsList(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

	public List<PrepartationStep> getIngredients() {
		return prepSteps;
	}

	public void setIngredients(List<PrepartationStep> ingredients) {
		prepSteps = ingredients;
	}
}