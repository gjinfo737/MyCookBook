package com.cukeshow.mycookbook.selectables;

import android.view.View;
import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.R.drawable;

public class QuitSelectable extends Selectable {

	public interface IQuitter {
		public void quit();
	}

	private static IQuitter quitter;

	public QuitSelectable(IQuitter quitter) {
		super("Quit", "", drawable.ic_launcher, new QuitClickListener());
		QuitSelectable.quitter = quitter;
	}

	private static class QuitClickListener implements OnClickListener {
		public void onClick(View v) {
			quitter.quit();
		}
	}
}
