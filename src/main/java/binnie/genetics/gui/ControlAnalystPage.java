package binnie.genetics.gui;

import binnie.craftgui.controls.core.Control;
import binnie.craftgui.core.IWidget;
import binnie.craftgui.core.geometry.IArea;

import java.text.DecimalFormat;

public abstract class ControlAnalystPage extends Control {
	public ControlAnalystPage(final IWidget parent, final IArea area) {
		super(parent, area);
		this.hide();
	}

	@Override
	public void onRenderBackground(int guiWidth, int guiHeight) {
	}

	public abstract String getTitle();

	protected String getTimeString(final int time) {
		final int seconds = time / 20;
		final int minutes = seconds / 60;
		final int hours = minutes / 60;
		final DecimalFormat df = new DecimalFormat("#.0");
		if (hours > 1) {
			return df.format(hours) + " hours";
		}
		if (minutes > 1) {
			return df.format(minutes) + " min.";
		}
		return df.format(seconds) + " sec.";
	}
}
