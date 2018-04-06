package com.qismatgro.core.ser;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;
@SlingServlet(paths="/bin/Servlet",extensions="json",methods="doGet")
public class SimpleServlet extends SlingSafeMethodsServlet
{
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String name = request.getParameter("name1");
		 String age = request.getParameter("age1");
		 JSONObject obj=new JSONObject();
         try {
			obj.put("name",name);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			obj.put("age",age);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         String jsonData = obj.toString();
         response.getWriter().write(jsonData);
		 
	}
}

