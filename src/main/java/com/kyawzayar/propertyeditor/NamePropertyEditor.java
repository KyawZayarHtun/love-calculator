package com.kyawzayar.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String convertStrign = text.toUpperCase();
		setValue(convertStrign);
	}

}
