package com.cukeshow.mycookbook.selectables.click;

import com.cukeshow.mycookbook.R.drawable;
import com.cukeshow.mycookbook.selectables.Selectable;

public class QuitSelectable extends Selectable {

	public QuitSelectable(IQuitter quitter, String title) {
		super(title, "", drawable.ic_launcher, new QuitClickListener(quitter));
	}

}
