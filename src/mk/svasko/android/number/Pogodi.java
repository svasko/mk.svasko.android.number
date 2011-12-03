package mk.svasko.android.number;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;;

public class Pogodi extends Activity {
	private EditText text;
	private TextView tView;
	int a,b,c,d, RandomNumber, i,j,k,l, A,B, probi;
	String proba;
	Random random;
	Boolean isti,pogodok;
	long tim;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
        text = (EditText) findViewById(R.id.editText1);
        tView = (TextView) findViewById(R.id.textView1);
        tim = System.currentTimeMillis();
        random = new Random(tim);
        RandomNumber = random.nextInt(9877); 
		i=RandomNumber/1000;
		j=(RandomNumber-i*1000)/100;
		k=(RandomNumber-i*1000-j*100)/10;
		l=(RandomNumber-i*1000-j*100-k*10);
		isti=false;
		pogodok=false;
        if (i == j){ isti=true;}
        if (i == k){ isti=true;}
        if (i == l){ isti=true;}
        if (j == k){ isti=true;}
        if (j == l){ isti=true;}
        if (k == l){ isti=true;}
        while (isti==true)
        {
            tim = System.currentTimeMillis();
            random = new Random(tim);
            RandomNumber = random.nextInt(9877);
    		i=RandomNumber/1000;
    		j=(RandomNumber-i*1000)/100;
    		k=(RandomNumber-i*1000-j*100)/10;
    		l=(RandomNumber-i*1000-j*100-k*10);
            if (i == j){ isti=true;}
            else if (i == k){ isti=true;}
             else if (i == l){ isti=true;}
              else if (j == k){ isti=true;}
               else if (j == l){ isti=true;}
                else if (k == l){ isti=true;}
                 else isti=false;
        }
        probi=0;        
        
    }
    
	// This method is called at button click because we assigned the name to the
	// "On Click property" of the button
	public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.button1:
			
			if (pogodok==true) {
				text.setText("");
				break; }
			probi++;
			if (text.getText().length() == 0) {
				Toast.makeText(this, "Please enter a valid number/Vnesete broj so 4 sifri",
						Toast.LENGTH_LONG).show();
				return;
			}
			
			int inputValue = Integer.parseInt(text.getText().toString());
			proba=proveri(inputValue);
			tView.setText(tView.getText()+proba);//+"  "+String.valueOf(RandomNumber)+"\n");
			text.setText("");
			
		}
	}    
	
	public void myClickHandler1(View view) {
		switch (view.getId()) {
		case R.id.button2:
            pogodok=false;
			probi=0;
	        tim = System.currentTimeMillis();
	        random = new Random(tim);
	        RandomNumber = random.nextInt(9999);
    		i=RandomNumber/1000;
    		j=(RandomNumber-i*1000)/100;
    		k=(RandomNumber-i*1000-j*100)/10;
    		l=(RandomNumber-i*1000-j*100-k*10);        
	        if (i == j){ isti=true;}
	        if (i == k){ isti=true;}
	        if (i == l){ isti=true;}
	        if (j == k){ isti=true;}
	        if (j == l){ isti=true;}
	        if (k == l){ isti=true;}
	        while (isti==true)
	        {
	            tim = System.currentTimeMillis();
	            random = new Random(tim);
	        	RandomNumber = random.nextInt(9877);
	    		i=RandomNumber/1000;
	    		j=(RandomNumber-i*1000)/100;
	    		k=(RandomNumber-i*1000-j*100)/10;
	    		l=(RandomNumber-i*1000-j*100-k*10);
	            if (i == j){ isti=true;}
	            else if (i == k){ isti=true;}
	             else if (i == l){ isti=true;}
	              else if (j == k){ isti=true;}
	               else if (j == l){ isti=true;}
	                else if (k == l){ isti=true;}
	                 else isti=false;
	            tView.setText(String.valueOf(RandomNumber));
	        }
	        
			tView.setText("");
			text.setText("");
			
		}
	}  
	
	
	private String proveri(int broj) {
		A=0;
		B=0;
		a=broj/1000;
		b=(broj-a*1000)/100;
		c=(broj-a*1000-b*100)/10;
		d=(broj-a*1000-b*100-c*10);
		if ( broj == RandomNumber ) {
			pogodok=true;
			if (probi<10) {return String.valueOf(" "+probi+": "+broj+" 4A0B"+"\n"+" Bravo! ");}
		     else {return String.valueOf(probi+": "+broj+" 4A0B"+"\n"+" Bravo! ");}}
		else { if (a==i) {A=A+1;}
        	   if (b==j) {A=A+1;}
        	   if (c==k) {A=A+1;}
        	   if (d==l) {A=A+1;}
        	   if (a==j) {B=B+1;}
        	   if (a==k) {B=B+1;}
        	   if (a==l) {B=B+1;}
        	   if (b==i) {B=B+1;}
        	   if (b==k) {B=B+1;}
        	   if (b==l) {B=B+1;}
        	   if (c==i) {B=B+1;}
        	   if (c==j) {B=B+1;}
        	   if (c==l) {B=B+1;}
        	   if (d==i) {B=B+1;}
        	   if (d==j) {B=B+1;}
        	   if (d==k) {B=B+1;}
        	   if (probi<10){return String.valueOf(" "+probi+": "+broj + " " + A + "A" + B + "B"+"\n");}
        	    else {return String.valueOf(probi+": "+broj + " " + A + "A" + B + "B"+"\n");}
		}
		
		
	}
    
}