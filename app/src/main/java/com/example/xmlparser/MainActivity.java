package com.example.xmlparser;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;


import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kepo);
        parseXML();
    }



    private void parseXML() {
        AssetManager assetManager = getBaseContext().getAssets();
        try {
            InputStream is = assetManager.open("GetTncLogin.xml");
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            XMLReader xr = sp.getXMLReader();

            OrderXMLHandler myXMLHandler = new OrderXMLHandler();
            xr.setContentHandler(myXMLHandler);
            InputSource inStream = new InputSource(is);
            xr.parse(inStream);

            String err_cd = myXMLHandler.geterr_cd();
            String err_msg = myXMLHandler.geterr_msg();
            String random_id = myXMLHandler.getrandom_id();
            String cust_nm = myXMLHandler.getcust_nm();
            String cust_ic = myXMLHandler.getcust_ic();
            String last_login_dt = myXMLHandler.getlast_login_dt();
            String last_login_day = myXMLHandler.getlast_login_day();
            String tnc_flag = myXMLHandler.gettnc_flag();
            String is_staff = myXMLHandler.getis_staff();
            String phishing_validation_flag = myXMLHandler.getphishing_validation_flag();
            String challenge_qn_setup_flag = myXMLHandler.getchallenge_qn_setup_flag();
            String special_modules = myXMLHandler.getspecial_modules();
            String is_easy = myXMLHandler.getis_easy();
            String yodlee_cross_sell = myXMLHandler.getyodlee_cross_sell();
            String pfm_indicator = myXMLHandler.getpfm_indicator();
            String session_timeout_period = myXMLHandler.getsession_timeout_period();
            String cust_segment = myXMLHandler.getcust_segment();


            Log.v("abc", cust_nm);
            LinearLayout ll = (LinearLayout)findViewById(R.id.linearLayout1);
            TextView tv = new TextView(this);
            tv.setText("err cd: " + err_cd);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("err msg: " + err_msg);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("random id : " + random_id);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("cust nm : " + cust_nm);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("cust ic : " + cust_ic);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("last login dt : " + last_login_dt);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("last login day : " + last_login_day);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("tnc flag : " + tnc_flag);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("is staff : " + is_staff);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("phishing validation flag : " + phishing_validation_flag);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("challenge qn setup flag : " + challenge_qn_setup_flag);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("special modules : " + special_modules);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("is easy : " + is_easy);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("yodlee cross sell : " + yodlee_cross_sell);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("pfm indicator : " + pfm_indicator);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("session timeout period  : " + session_timeout_period );
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("cust segment: " + cust_segment);
            ll.addView(tv);
            tv = new TextView(this);
            tv.setText("Shopping Cart Info --->");
            ll.addView(tv);



            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}



