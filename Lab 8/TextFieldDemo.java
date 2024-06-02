import java.awt.*;

class TextFieldDemo{
	public static void main (String args[]){
		Frame f=new Frame();
		Label l1=new Label();
		f.add(l1);
		l1.setBounds(50,70,320,60);
		-
		//TextField t1=new TextField("34");
		//TextField t2=new TextField("50");
		//TextField res=new TextField("000");
		
		//t1.setBounds(50,80,320,50);
		//t2.setBounds(160,80,100,30);
		//res.setBounds(75,120,200,30);
		//f.add(t1);
		//f.add(t2);
		//f.add(res);
		Button b=new Button("+");
		Button b1=new Button("-");
		Button b2=new Button("*");
		Button b3=new Button("/");
		Button b4=new Button("1");
		Button b5=new Button("2");
		Button b7=new Button("3");
		Button b8=new Button("4");
		Button b9=new Button("5");
		Button b10=new Button("6");
		Button b11=new Button("7");
		Button b12=new Button("8");
		Button b13=new Button("9");
		Button b14=new Button("0");
		Button b15=new Button(".");
		Button b16=new Button("=");
		b.setBounds(290,150,80,60);//setting button position
		b1.setBounds(290,230,80,60);
		b2.setBounds(290,310,80,60);
		b3.setBounds(290,390,80,60);
		b4.setBounds(50,150,80,60);
		b5.setBounds(130,150,80,60);
		b7.setBounds(210,150,80,60);
		b8.setBounds(50,230,80,60);
		b9.setBounds(130,230,80,60);
		b10.setBounds(210,230,80,60);
		b11.setBounds(50,310,80,60);
		b12.setBounds(130,310,80,60);
		b13.setBounds(210,310,80,60);
		b14.setBounds(50,390,80,60);
		b15.setBounds(130,390,80,60);
		b16.setBounds(210,390,80,60);
		//int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		//String s="";
		//s=s+sum;
		//res.setText(s);
		
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
