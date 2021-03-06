package jp.enpit.cloud.eventspiral.view;

import jp.enpit.cloud.eventspiral.TEMException;

/**
 * UC: ログインする
 * @author fukuyasu
 *
 */
public class TEMViewException extends TEMException {
	private static final long serialVersionUID = -3130558751477090056L;

	public TEMViewException (String message) {
		super(message);
	}
	public TEMViewException (String message, Throwable cause) {
		super(message, cause);
	}
}
