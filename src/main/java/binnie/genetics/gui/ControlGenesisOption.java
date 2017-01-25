package binnie.genetics.gui;

import binnie.core.genetics.Gene;
import binnie.craftgui.controls.listbox.ControlList;
import binnie.craftgui.controls.listbox.ControlOption;
import binnie.craftgui.core.CraftGUI;
import binnie.craftgui.core.geometry.IArea;
import binnie.craftgui.core.geometry.TextJustification;

public class ControlGenesisOption extends ControlOption<Gene> {
	public ControlGenesisOption(final ControlList<Gene> parent, final Gene gene, final int y) {
		super(parent, gene, y);
	}

	String getAlleleName() {
		return this.getValue().getAlleleName();
	}

	String getChromosomeName() {
		return this.getValue().getShortChromosomeName();
	}

	@Override
	public void onRenderBackground(int guiWidth, int guiHeight) {
		super.onRenderBackground(guiWidth, guiHeight);
		CraftGUI.render.text(new IArea(0, 0, 70, 22), TextJustification.MiddleCenter, this.getChromosomeName(), this.getColour());
		CraftGUI.render.text(new IArea(75, 0, 80, 22), TextJustification.MiddleCenter, this.getAlleleName(), this.getColour());
		CraftGUI.render.solid(new IArea(70, 2, 1, 16), -16777216 + this.getColour());

	}
}
