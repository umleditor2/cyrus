package TestPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;

public class UEUtilities {

	public static int ComputeAngle(){return 0;}
	public static Point ComputeIntersection(){return null;}
	public static Point ComputeCenterPoint(){return null;}
	
	public static Dimension getScreenSize(JFrame frame){
		
		Dimension ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Insets ScreenInsets=Toolkit.getDefaultToolkit().getScreenInsets(frame.getGraphicsConfiguration());
		int TaskBarSize=ScreenInsets.bottom;
		return new Dimension(ScreenSize.width,ScreenSize.height-TaskBarSize);
	}
	
	public static Dimension ComputeStringBounds(String str,Font font){

		AffineTransform affine=new AffineTransform();
		FontRenderContext frc=new FontRenderContext(affine, true, true);
		return new Dimension((int)Math.round(font.getStringBounds(str, frc).getWidth()+7),
							 (int)Math.round(font.getStringBounds(str, frc).getHeight()+7));
		
	}
	
	public static Color getColorMixed(Color color1,float c1Per,Color color2,float c2Per){
		
		float[] C1=color1.getColorComponents(null);
		float[] C2=color2.getColorComponents(null);
		float[] C3=new float[3];
		for(int i=0;i<3;i++){
			C3[i]=(C1[i]*c1Per) + (C2[i]*c2Per);
		}
			
		return new Color(C3[0], C3[1], C3[2]);
	}
	
	public static int ConvertToInt(String str){
		System.out.println(str);
		return Integer.parseInt(str);
	}
	
}
