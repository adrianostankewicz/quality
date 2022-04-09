package com.quality.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.quality.transportadora.Transportadora;
import com.quality.transportadora.TransportadoraRN;

@FacesConverter(forClass=Transportadora.class)
public class TransportadoraConverter implements Converter {

	private TransportadoraRN transportadoraRN = new TransportadoraRN();
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

		Integer id = Integer.valueOf(arg2);
		return transportadoraRN.carregar(id);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return String.valueOf(((Transportadora)arg2).getIdTransportadora());
	}
}
