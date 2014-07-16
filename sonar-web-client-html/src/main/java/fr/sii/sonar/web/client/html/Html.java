package fr.sii.sonar.web.client.html;

import org.apache.commons.lang.StringUtils;
import org.sonar.api.config.Settings;
import org.sonar.api.resources.AbstractLanguage;

public class Html extends AbstractLanguage {

	private Settings settings;

	public Html(Settings configuration) {
		super(Constants.LANGUAGE_KEY, "HTML");
		this.settings = configuration;
	}

	public Settings getSettings() {
		return this.settings;
	}

	public String[] getFileSuffixes() {
		String[] suffixes = settings.getStringArray(Constants.FILE_SUFFIXES_KEY);
		if (suffixes == null || suffixes.length == 0) {
			suffixes = StringUtils.split(Constants.FILE_SUFFIXES_DEFVALUE, ",");
		}
		return suffixes;
	}

}
