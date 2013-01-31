package com.cukeshow.mycookbook.selectables;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class RecipeClickListener implements OnClickListener {
	int ID = -1;

	public RecipeClickListener(int iid) {
		this.ID = iid;
	}

	@Override
	public void onClick(View v) {
		Log.e("", ID + "%%%%%%");
	}

}
