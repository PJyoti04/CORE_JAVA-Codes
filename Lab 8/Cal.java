import java.awt.*;

class First extends Frame{
	First(){
		Button b=new Button("+");
		Button b1=new Button("-");
		Button b2=new Button("*");
		Button b3=new Button("/");
		b.setBounds(30,100,80,30);//setting button position
		b1.setBounds(30,150,80,30);
		b2.setBounds(30,200,80,30);
		b3.setBounds(30,250,80,30);
		
		add(b);
		add(b1);
		add(b2);
		add(b3);
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