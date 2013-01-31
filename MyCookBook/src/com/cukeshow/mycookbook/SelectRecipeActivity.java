package com.cukeshow.mycookbook;

import java.util.List;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.BodaciousRadiusMaximus;
import northwoods.discovery.bodaciousdataslate.RadiusItemusPopulus_IconTitleSubTitle;
import northwoods.discovery.bodaciousdataslate.SelectableBodAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.cukeshow.mycookbook.R.id;
import com.cukeshow.mycookbook.R.layout;
import com.cukeshow.mycookbook.fakedata.Recipes;
import com.cukeshow.mycookbook.selectables.QuitSelectable;
import com.cukeshow.mycookbook.selectables.QuitSelectable.IQuitter;
import com.cukeshow.mycookbook.selectables.Selectable;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class SelectRecipeActivity extends Activity implements IQuitter {
	private static final int BODACIOUS_LISTVIEW_ID = id.bodacious_listView;
	private static final int THE_BODACIOUS_ONE = 0;
	public static final int RADIUS_ITEM_BODACIOUS = id.bod_radius_item_bodacious;
	public static final int RADIUS_SUB_LAYOUT_ID = id.sub_rellay;
	public static final int RADIUS_ITEM_CONTAINER_ID = id.bod_radius_item_container;
	public static final int[] RADIUS_LAYOUTS = new int[] { layout.bod_radius_0,
			layout.bod_radius_1, layout.bod_radius_2, layout.bod_radius_3,
			layout.bod_radius_4, layout.bod_radius_5, layout.bod_radius_6,
			layout.bod_radius_7, layout.bod_radius_8,

	};
	public static final int[] RADIUS_LAYOUT_ITEM_IDS = new int[] {
			id.bod_radius_item_0, id.bod_radius_item_1, id.bod_radius_item_2,
			id.bod_radius_item_3, id.bod_radius_item_4, id.bod_radius_item_5,
			id.bod_radius_item_6, id.bod_radius_item_7, id.bod_radius_item_8, };
	private BodaciousRadiusMaximus<Selectable> radial;
	private RadiusItemusPopulus_IconTitleSubTitle radiusItemPopulater;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.select_recipe_activity_start);

		radiusItemPopulater = new RadiusItemusPopulus_IconTitleSubTitle(
				layout.item_layout, id.item_imageView, id.item_textView_title,
				id.item_textView_subTitle);
		this.radial = new BodaciousRadiusMaximus<Selectable>(
				layout.bod_radius_default, RADIUS_LAYOUTS,
				RADIUS_LAYOUT_ITEM_IDS, getLayoutInflater(),
				(ViewGroup) findViewById(RADIUS_SUB_LAYOUT_ID),
				RADIUS_ITEM_CONTAINER_ID, RADIUS_ITEM_BODACIOUS,
				radiusItemPopulater, BODACIOUS_LISTVIEW_ID);

		int numberOfItems = 2;
		setUpList(numberOfItems);
	}

	public void setUpList(int numberOfItems) {
		BodaciousAdapter<Selectable> bodaciousStringAdapter = new SelectableBodAdapter(
				radiusItemPopulater, getLayoutInflater());
		List<Selectable> recipes = Recipes.RECIPES;
		recipes.add(new QuitSelectable(this));
		bodaciousStringAdapter.setList(recipes, recipes.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}

	@Override
	public void quit() {
		finish();
	}
}
