package lnmiit.madclub.crozword.gameframework;

/**
 * The interface used by the RenderSurfce to delegate drag events.
 * 
 * @author Abhimanyu Singhal
 */
public interface WidgetDragListener {

	public void onDragStart(Widget widget);

	public void onDragEnd(Widget widget);

	public void onDrag(Widget widget, int x, int y);

}
