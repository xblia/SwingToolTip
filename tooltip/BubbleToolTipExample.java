package tooltip;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import tooltip.BubbleToolTip.TooltipFont;

/**
 * @author xblia
 * 20151129
 */
public class BubbleToolTipExample extends JFrame
{
	private static final long serialVersionUID = 1L;

	public BubbleToolTipExample()
	{
		init();
	}

	public void init()
	{
		this.getContentPane().setBackground(Color.red);
		this.setLayout(new BorderLayout());
		
		this.add(genNorthPanel(), BorderLayout.NORTH);
		this.add(genSouthPanel(), BorderLayout.SOUTH);

		this.setTitle("Repaint Tooltip");
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private Component genSouthPanel()
	{
		String tooltipContent = "寥寥笔墨勾勒一青山\n青山下面一片大草原\n牵动着思绪纸上走牵动着思绪纸上走一遍一遍一遍\n借缕清风梦里好作帆";
		TooltipLabel helpLabelInfo = new TooltipLabel(tooltipContent, TooltipFont.YAHEI.getFont(),Color.gray, Color.black, Color.orange, this);

		JPanel panel = new JPanel(new FlowLayout());
		panel.add(helpLabelInfo);
		
		return panel;
	}

	private Component genNorthPanel()
	{
		String tooltipContent = "Dear lord when I get to heaven\nPlease let me bring my man\nWhen he comes tell me that you'll let me\nFather tell me if you can";
		TooltipLabel helpLabelInfo = new TooltipLabel(tooltipContent, null, this);
		
		JPanel panelNorth = new JPanel(new FlowLayout());
		panelNorth.add(helpLabelInfo);
		
		return panelNorth;
	}

	public static void main(String args[])
	{
		new BubbleToolTipExample();
	}
}