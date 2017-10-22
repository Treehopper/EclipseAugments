package eu.hohenegger.scratchpad.wizard.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyBean {
	public static final String TEXT_PROPERTY_NAME = "text";

	private String text = "";

	private transient PropertyChangeSupport support = new PropertyChangeSupport(
			this);

	private synchronized PropertyChangeSupport getPropertyChangeSupport() {
		if (this.support == null) {
			this.support = new PropertyChangeSupport(this);
		}
		return this.support;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		String oldText = this.getText();
		this.text = text;
		this.getPropertyChangeSupport().firePropertyChange(TEXT_PROPERTY_NAME,
				oldText, this.text);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.getPropertyChangeSupport().addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.getPropertyChangeSupport().removePropertyChangeListener(listener);
	}
}
