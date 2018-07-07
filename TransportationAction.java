package org.seasar.sastruts.example.action;

import org.seasar.struts.annotation.Execute;

/**
 * 交通費精算アクション
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationAction {

	/**
	 * 初期表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	/**
	 * 確認画面表示
	 *
	 * @return
	 */
	public String confirm() {
		return "confirm.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String complete() {
		return "complete.jsp";
	}

}
