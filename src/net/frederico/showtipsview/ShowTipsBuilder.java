package net.frederico.showtipsview;
import android.app.Activity;
import android.view.View;

/**
 * @author Frederico Silva (fredericojssilva@gmail.com)
 * @date Oct 31, 2014
 */
public class ShowTipsBuilder {
	ShowTipsView showtipsView;

	public ShowTipsBuilder(Activity activity) {
		this.showtipsView = new ShowTipsView(activity);
	}

	/**
	 * Set highlight view. All view will be highlighted
	 * 
	 * @param v
	 *            Target view
	 * @return ShowTipsBuilder
	 */
	public ShowTipsBuilder setTarget(View v) {
		this.showtipsView.setTarget(v);
		return this;
	}

	/**
	 * Set highlighted view with custom center and radius
	 * 
	 * @param v
	 *            Target View
	 * @param x
	 *            circle center x according target
	 * @param y
	 *            circle center y according target
	 * @param radius
	 * @return
	 */
	public ShowTipsBuilder setTarget(View v, int x, int y, int radius) {
		showtipsView.setTarget(v, x, y, radius);

		return this;
	}

	public ShowTipsView build() {
		return showtipsView;
	}

	public ShowTipsBuilder setTitle(String text) {
		this.showtipsView.setTitle(text);
		return this;
	}

	public ShowTipsBuilder setDescription(String text) {
		this.showtipsView.setDescription(text);
		return this;
	}

	public ShowTipsBuilder displayOneTime(int showtipId) {
		this.showtipsView.setDisplayOneTime(true);
		this.showtipsView.setDisplayOneTimeID(showtipId);
		return this;
	}

	public ShowTipsBuilder setCallback(ShowTipsViewInterface callback) {
		this.showtipsView.setCallback(callback);
		return this;
	}

	public ShowTipsBuilder setDelay(int delay) {
		showtipsView.setDelay(delay);
		return this;
	}

	public ShowTipsBuilder setTitleColor(int color) {
		showtipsView.setTitle_color(color);
		return this;
	}

	public ShowTipsBuilder setDescriptionColor(int color) {
		showtipsView.setDescription_color(color);
		return this;
	}

	public ShowTipsBuilder setBackgroundColor(int color) {
		showtipsView.setBackground_color(color);
		return this;
	}

	public ShowTipsBuilder setCircleColor(int color) {
		showtipsView.setCircleColor(color);
		return this;
	}

	public ShowTipsBuilder setButtonText(String text) {
		this.showtipsView.setButtonText(text);
		return this;
	}
}
