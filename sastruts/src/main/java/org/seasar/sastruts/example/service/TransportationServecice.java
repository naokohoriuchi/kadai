package org.seasar.sastruts.example.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.sastruts.example.dto.GetTransportationDto;
import org.seasar.sastruts.example.dto.PrmTransportationDto;

/**
 * 交通費精算サービス
 *
 * @author Naoko Horiuchi
 *
 */
public class TransportationServecice {

	@Resource
	protected JdbcManager jdbcManager;

	/**
	 * 前回登録したデータを取得する。
	 *
	 * @return
	 */
	public GetTransportationDto doGetTransportationData() {
		GetTransportationDto getTransportationDto = new GetTransportationDto();
		return getTransportationDto;
	}

	/**
	 * 交通費の情報を登録する。
	 */
	public void setTransportaionData(PrmTransportationDto prmTransportationDto) {

	}

}
