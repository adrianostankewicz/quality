package com.quality.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class BooleanConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return Boolean.getBoolean(arg2) ? true : false;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(((Boolean)arg2).booleanValue() == true){
			return "Sim";
		} else {
			return "N�o";
		}
	}
}
