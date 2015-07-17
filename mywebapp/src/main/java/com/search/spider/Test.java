package com.search.spider;

import java.sql.SQLException;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;
  
 
public class Test  
{  
  public static void main(String[] args) throws SQLException  
  {  
	  
	  Pattern pattern=null;
	  pattern=Pattern.compile("[1][3,5]\\d{9}");
	  Matcher matcher=null;
	  matcher=pattern.matcher("13834234324");
	  System.out.println(matcher.matches());
	  
	  
      String url = "http://www.sina.com";  
      String url1 = "http://www.oschina.net/code/explore";  
      String url2 = "http://www.oschina.net/code/explore/achartengine";  
      String url3 = "http://www.oschina.net/code/explore/achartengine/client";  
        
        
      UrlQueue.addElem(url);  
      UrlQueue.addElem(url1);  
      UrlQueue.addElem(url2);  
      UrlQueue.addElem(url3);  
        
      UrlDataHanding[] url_Handings = new UrlDataHanding[10];  
        
          for(int i = 0 ; i < 10 ; i++)  
          {  
              url_Handings[i] = new UrlDataHanding();  
              new Thread(url_Handings[i]).start();  
          }  
 
  }  
} 