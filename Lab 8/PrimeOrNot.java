import java.awt.*;

class TextFieldDemo{
	public static void main (String args[]){
		Frame f=new Frame();
		TextField t1=new TextField("11");
		TextField t2=new TextField("......");
		t1.setBounds(30,80,100,30);
		t2.setBounds(160,80,100,30);
		f.add(t1);
		f.add(t2);
		int num=Integer.parseInt(t1.getText());
		int i;
		if(num==0 || num==1)
		{
			System.out.println("special case !!!");
		}
		else
		{
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
					break;
			}
			if(i==num)
			{
				String s="Prime";
				t2.setText(s);
			}
			else
			{
				String s="Composite";
				t2.setText(s);
			}
		}
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}