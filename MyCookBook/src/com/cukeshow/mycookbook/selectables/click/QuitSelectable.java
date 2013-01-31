package com.cukeshow.mycookbook.selectables.click;

import android.view.View;
import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.R.drawable;
import com.cukeshow.mycookbook.selectables.Selectable;

public class QuitSelectable extends Selectable {

	public interface IQuitter {
		public void quit();
	}

	private static IQuitter quitter;

	public QuitSelectable(IQuitter quitter, String title) {
		super(title, "", drawable.ic_launcher, new QuitClickListener());
		QuitSelectable.quitter = quitter;
	}

	private static class QuitClickListener implements OnClickListener {
		public void onClick(View v) {
			quitter.quit();
		}
	}
}
