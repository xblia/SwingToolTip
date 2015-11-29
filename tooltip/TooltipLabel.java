package tooltip;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author xblia
 * 20151129
 */
public class TooltipLabel extends JLabel
{

	private static final long serialVersionUID = 1L;
	
	public TooltipLabel(String tooltipContent, Font font, JFrame frame)
	{
		this.setIcon(new ImageIcon(BubbleToolTip.class.getResource("help.png")));
		BubbleToolTip tooltip = null;
		if(null != font)
		{
			tooltip = new BubbleToolTip(font, tooltipContent, frame);
		}else
		{
			tooltip = new BubbleToolTip(tooltipContent, frame);
		}
		this.addMouseListener(tooltip);
	}
	
	public TooltipLabel(String tooltipContent, Font font, Color bgColor, Color foreColor, Color borderColor, JFrame frame)
	{
		this.setIcon(new ImageIcon(BubbleToolTip.class.getResource("help.png")));
		BubbleToolTip tooltip = null;
		if(font == null || bgColor == null || foreColor == null || borderColor == null)
		{
			throw new NullPointerException("Tooltip font or background color or foreground color or border color is null.");
		}
		tooltip = new BubbleToolTip(tooltipContent, font, bgColor, foreColor, borderColor, frame);
		this.addMouseListener(tooltip);
	}
}
