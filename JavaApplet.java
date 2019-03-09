// 下面两行导入实现Applet需要的类库
import java.applet.Applet;
import java.awt .*;

//通过继承方式定义并实现一个 Applet 类 JavaApplet
public class JavaApplet extends Applet{
	public void paint(Graphics g){
	g.drawString("This is my first Java Applet！",20,10);//调用Graphics对象g的drawString方法，在html页面的指定位置打印一行字符串
	
	}
}