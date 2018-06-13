package com.webtemplate.web.i18n;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18NService {

	@Autowired
	private MessageSource messageSource;


/* returns a msg for the given msgID with the default locale for the session context
* @params msgID the key to the msges resource file
* */

//	public String getMessage(String messageId) {
//		Locale locale = LocaleContextHolder.getLocale();
//		String msgObtained=messageSource.getMessage(messageId);
//		return msgObtained;
//	}
//
//
//	/* returns a msg for the given msgID with the default locale for the session context
//* @params msgID the key to the msges resource file
//* @params locale the locale
//* */
//	public String getMessage(String messageId, Locale locale) {
//		String msgObtained=messageSource.getMessage(messageId,locale);
//		return msgObtained;
//	}


}
