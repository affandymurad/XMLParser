package com.example.xmlparser;

/**
 * Created by affandy on 04/11/2016.
 */

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OrderXMLHandler extends DefaultHandler {

    boolean currentElement = false;

    String currentValue = "";
    String err_cd;
    String err_msg;
    String random_id;
    String cust_nm;
    String cust_ic;
    String last_login_dt;
    String last_login_day;
    String tnc_flag;
    String is_staff;
    String phishing_validation_flag;
    String challenge_qn_setup_flag;
    String special_modules;
    String is_easy;
    String yodlee_cross_sell;
    String pfm_indicator;
    String session_timeout_period;
    String cust_segment;


    public String geterr_cd() {
        return err_cd;
    }

    public String geterr_msg() {
        return err_msg;
    }

    public String getrandom_id() {
        return random_id;
    }

    public String getcust_nm() {
        return cust_nm;
    }

    public String getcust_ic() {
        return cust_ic;
    }

    public String getlast_login_dt() {
        return last_login_dt;
    }

    public String getlast_login_day() {
        return last_login_day;
    }

    public String gettnc_flag() {
        return tnc_flag;
    }

    public String getis_staff() {
        return is_staff;
    }

    public String getphishing_validation_flag() {
        return phishing_validation_flag;
    }

    public String getchallenge_qn_setup_flag() {
        return challenge_qn_setup_flag;
    }

    public String getspecial_modules() {
        return special_modules;
    }

    public String getis_easy() {
        return is_easy;
    }

    public String getyodlee_cross_sell() {
        return yodlee_cross_sell;
    }

    public String getpfm_indicator() {
        return pfm_indicator;
    }

    public String getsession_timeout_period() {
        return session_timeout_period;
    }

    public String getcust_segment() {
        return cust_segment;
    }

    ArrayList<OrderXMLHandler> customerList;


    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        currentElement = true;

        if (qName.equals("header") && qName.equals("body")){
            customerList = new ArrayList<>();
        }


    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        currentElement = false;
        if (qName.equalsIgnoreCase("err_cd"))
            err_cd = currentValue.trim();
        else if (qName.equalsIgnoreCase("err_msg"))
            err_msg = currentValue.trim();
        else if (qName.equalsIgnoreCase("random_id"))
            random_id = currentValue.trim();
        else if (qName.equalsIgnoreCase("cust_nm"))
            cust_nm = currentValue.trim();
        else if (qName.equalsIgnoreCase("cust_ic"))
            cust_ic = currentValue.trim();
        else if (qName.equalsIgnoreCase("last_login_dt"))
            last_login_dt = currentValue.trim();
        else if (qName.equalsIgnoreCase("last_login_day"))
            last_login_day = currentValue.trim();
        else if (qName.equalsIgnoreCase("tnc_flag"))
            tnc_flag = currentValue.trim();
        else if (qName.equalsIgnoreCase("is_staff"))
            is_staff = currentValue.trim();
        else if (qName.equalsIgnoreCase("phishing_validation_flag"))
            phishing_validation_flag = currentValue.trim();
        else if (qName.equalsIgnoreCase("challenge_qn_setup_flag"))
            challenge_qn_setup_flag = currentValue.trim();
        else if (qName.equalsIgnoreCase("special_modules"))
            special_modules = currentValue.trim();
        else if (qName.equalsIgnoreCase("is_easy"))
            is_easy = currentValue.trim();
        else if (qName.equalsIgnoreCase("yodlee_cross_sell"))
            yodlee_cross_sell = currentValue.trim();
        else if (qName.equalsIgnoreCase("pfm_indicator"))
            pfm_indicator = currentValue.trim();
        else if (qName.equalsIgnoreCase("session_timeout_period"))
            session_timeout_period = currentValue.trim();
        else if (qName.equalsIgnoreCase("cust_segment"))
            cust_segment = currentValue.trim();

        currentValue = "";
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {

        if (currentElement) {
            currentValue = currentValue + new String(ch, start, length);
        }

    }

}