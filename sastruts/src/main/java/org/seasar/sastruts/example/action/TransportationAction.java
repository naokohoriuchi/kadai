package org.seasar.sastruts.example.action;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.sastruts.example.dto.GetTransportationDto;
import org.seasar.sastruts.example.dto.PrmTransportationDto;
import org.seasar.sastruts.example.form.TransportationForm;
import org.seasar.sastruts.example.service.TransportationServecice;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

/**
 * 交通費精算アクション
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationAction {

	@Resource
	protected TransportationServecice transportationServecice;

	@Resource
	@ActionForm
	protected TransportationForm transportationForm;

	@Resource
	protected PrmTransportationDto prmDto;

	/**
	 * 初期表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String index() {
		GetTransportationDto getDto = transportationServecice.doGetTransportationData();
		return "index.jsp";
	}

	/**
	 * 確認画面表示
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String confirm() {
		prmDto = Beans.createAndCopy(PrmTransportationDto.class, transportationForm).execute();
		return "confirm.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String complete() {
		transportationServecice.setTransportaionData(prmDto);
		return "complete.jsp";
	}

}
