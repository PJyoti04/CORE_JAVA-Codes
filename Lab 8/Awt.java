import java.awt.*;

class First extends Frame{
	First(){
		Button b=new Button("click me");
		b.setBounds(30,100,80,30);//setting button position
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
}
class Demo{
	public static void main (String args[]){
		First f=new First();
	}
}