package com.quality.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.quality.fabricante.Fabricante;
import com.quality.fabricante.FabricanteRN;

@FacesConverter(forClass=Fabricante.class)
public class FabricanteConverter implements Converter {

	private FabricanteRN fabricanteRN = new FabricanteRN();
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		Integer id = Integer.valueOf(arg2);
		return fabricanteRN.carregar(id);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return String.valueOf(((Fabricante)arg2).getIdFabricante());
	}
}
