package com.elcom.eodapp.ehotel.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.elcom.eodapp.ehotel.common.xsd.OBill;
import com.elcom.eodapp.ehotel.common.xsd.OMessageDel;
import com.elcom.eodapp.ehotel.common.xsd.OPost;
import com.elcom.eodapp.ehotel.common.xsd.ORoomData;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated source version: 2.2
 * 
 */
@WebService(name = "CoreInterfacePortType", targetNamespace = "http://service.ehotel.eodapp.elcom.com")
@XmlSeeAlso({ com.elcom.eodapp.ehotel.common.xsd.ObjectFactory.class, com.elcom.eodapp.ehotel.service.ObjectFactory.class })
public interface CoreInterfacePortType {

	/**
	 * 
	 * @param fun
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:synDatabase")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "synDatabase", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.SynDatabase")
	@ResponseWrapper(localName = "synDatabaseResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.SynDatabaseResponse")
	public String synDatabase(@WebParam(name = "fun", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String fun);

	/**
	 * 
	 * @param fun
	 * @return returns java.util.List<com.elcom.eodapp.ehotel.common.xsd.OMessageDel>
	 */
	@WebMethod(action = "urn:guestMessageDeleteReq")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestMessageDeleteReq", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageDeleteReq")
	@ResponseWrapper(localName = "guestMessageDeleteReqResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageDeleteReqResponse")
	public List<OMessageDel> guestMessageDeleteReq(
			@WebParam(name = "fun", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String fun);

	/**
	 * 
	 * @param roomNUMER
	 * @param guestPIN
	 * @param guestGROUPNUMBER
	 * @param guestTITLE
	 * @param shareFLAG
	 * @param date
	 * @param time
	 * @param guestDEPTDATE
	 * @param guestLANGUAGE
	 * @param swapFLAG
	 * @param guestARVDATE
	 * @param guestFIRSTNAME
	 * @param guestNAME
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GuestCheckin", action = "urn:GuestCheckin")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "GuestCheckin", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestCheckin")
	@ResponseWrapper(localName = "GuestCheckinResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestCheckinResponse")
	public String guestCheckin(
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "GUEST_ARV_DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestARVDATE,
			@WebParam(name = "GUEST_DEPT_DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestDEPTDATE,
			@WebParam(name = "GUEST_TITLE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestTITLE,
			@WebParam(name = "GUEST_FIRST_NAME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestFIRSTNAME,
			@WebParam(name = "GUEST_NAME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestNAME,
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "GUEST_PIN", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestPIN,
			@WebParam(name = "SHARE_FLAG", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String shareFLAG,
			@WebParam(name = "GUEST_LANGUAGE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestLANGUAGE,
			@WebParam(name = "GUEST_GROUP_NUMBER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestGROUPNUMBER,
			@WebParam(name = "DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String date,
			@WebParam(name = "TIME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String time,
			@WebParam(name = "SWAP_FLAG", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String swapFLAG);

	/**
	 * 
	 * @param roomNUMER
	 * @param swapFLAG
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GuestCheckout", action = "urn:GuestCheckout")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "GuestCheckout", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestCheckout")
	@ResponseWrapper(localName = "GuestCheckoutResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestCheckoutResponse")
	public String guestCheckout(
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "SWAP_FLAG", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String swapFLAG);

	/**
	 * 
	 * @param roomNUMER
	 * @param balanceAMOUNT
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:guestBillBalan")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestBillBalan", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestBillBalan")
	@ResponseWrapper(localName = "guestBillBalanResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestBillBalanResponse")
	public String guestBillBalan(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "BALANCE_AMOUNT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String balanceAMOUNT);

	/**
	 * 
	 * @param fun
	 * @return returns java.util.List<com.elcom.eodapp.ehotel.common.xsd.OBill>
	 */
	@WebMethod(action = "urn:guestBillReq")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestBillReq", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestBillReq")
	@ResponseWrapper(localName = "guestBillReqResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestBillReqResponse")
	public List<OBill> guestBillReq(@WebParam(name = "fun", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String fun);

	/**
	 * 
	 * @param roomNUMER
	 * @param messageID
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:guestMessageDelete")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestMessageDelete", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageDelete")
	@ResponseWrapper(localName = "guestMessageDeleteResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageDeleteResponse")
	public String guestMessageDelete(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "MESSAGE_ID", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String messageID);

	/**
	 * 
	 * @param roomNUMER
	 * @param msgLIGHTSTATUS
	 * @param minibarRIGHT
	 * @param tvRIGHT
	 * @param classSERVICE
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GuestRoomEquipment", action = "urn:GuestRoomEquipment")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "GuestRoomEquipment", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestRoomEquipment")
	@ResponseWrapper(localName = "GuestRoomEquipmentResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestRoomEquipmentResponse")
	public String guestRoomEquipment(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "CLASS_SERVICE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String classSERVICE,
			@WebParam(name = "MSG_LIGHT_STATUS", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String msgLIGHTSTATUS,
			@WebParam(name = "MINIBAR_RIGHT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String minibarRIGHT,
			@WebParam(name = "TV_RIGHT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String tvRIGHT);

	/**
	 * 
	 * @param itemAMOUNT
	 * @param roomNUMER
	 * @param time
	 * @param itemDESC
	 * @param displayFLAG
	 * @param date
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:guestBillItem")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestBillItem", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestBillItem")
	@ResponseWrapper(localName = "guestBillItemResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestBillItemResponse")
//	String out = MainObject.eHotelWebService.guestBillItem(ROOM_NUMBER, GUEST_NUMBER, TRANSACTION_ID, TRANSACTION_CODE, ITEM_AMOUNT, CURRENCY, ITEM_DESC,BALANCE_AMOUNT, displayFLAG, DATE, TIME);
	public String guestBillItem(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "TRANSACTION_ID", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String transactionId,
			@WebParam(name = "TRANSACTION_CODE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String transactionCode,
			@WebParam(name = "ITEM_AMOUNT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String itemAMOUNT,
			@WebParam(name = "CURRENCY", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String currency,
			@WebParam(name = "ITEM_DESC", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String itemDESC,
			@WebParam(name = "BALANCE_AMOUNT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String balanceAmount,
			@WebParam(name = "DISPLAY_FLAG", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String displayFLAG,
			@WebParam(name = "DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String date,
			@WebParam(name = "TIME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String time);

	/**
	 * 
	 * @param answerSTATUS
	 * @param roomNUMER
	 * @param time
	 * @param seqNUMBER
	 * @param clearTEXT
	 * @param date
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GuestPostAnswer", action = "urn:GuestPostAnswer")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "GuestPostAnswer", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestPostAnswer")
	@ResponseWrapper(localName = "GuestPostAnswerResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestPostAnswerResponse")
	public String guestPostAnswer(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "ANSWER_STATUS", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String answerSTATUS,
			@WebParam(name = "CLEAR_TEXT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String clearTEXT,
			@WebParam(name = "SEQ_NUMBER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String seqNUMBER,
			@WebParam(name = "DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String date,
			@WebParam(name = "TIME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String time);

	/**
	 * 
	 * @param fun
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:getFunctionNew")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "getFunctionNew", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GetFunctionNew")
	@ResponseWrapper(localName = "getFunctionNewResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GetFunctionNewResponse")
	public String getFunctionNew(@WebParam(name = "fun", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String fun);

	/**
	 * 
	 * @param roomNUMER
	 * @param roomNUMEROLD
	 * @param guestNAME
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GuestRoomMove", action = "urn:GuestRoomMove")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "GuestRoomMove", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestRoomMove")
	@ResponseWrapper(localName = "GuestRoomMoveResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestRoomMoveResponse")
	public String guestRoomMove(
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "GUEST_NAME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestNAME,
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "ROOM_NUMER_OLD", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMEROLD);

	/**
	 * 
	 * @param fun
	 * @return returns java.util.List<com.elcom.eodapp.ehotel.common.xsd.OPost>
	 */
	@WebMethod(action = "urn:guestPostReq")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestPostReq", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestPostReq")
	@ResponseWrapper(localName = "guestPostReqResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestPostReqResponse")
	public List<OPost> guestPostReq(@WebParam(name = "fun", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String fun);

	/**
	 * 
	 * @param roomNUMER
	 * @param time
	 * @param guestGROUPNUMBER
	 * @param guestTITLE
	 * @param guestDEPTDATE
	 * @param guestLANGUAGE
	 * @param guestARVDATE
	 * @param guestFIRSTNAME
	 * @param guestNAME
	 * @param date
	 * @param shareFLAG
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GuestChangeData", action = "urn:GuestChangeData")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "GuestChangeData", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestChangeData")
	@ResponseWrapper(localName = "GuestChangeDataResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestChangeDataResponse")
	public String guestChangeData(
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "SHARE_FLAG", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String shareFLAG,
			@WebParam(name = "GUEST_FIRST_NAME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestFIRSTNAME,
			@WebParam(name = "GUEST_NAME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestNAME,
			@WebParam(name = "GUEST_LANGUAGE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestLANGUAGE,
			@WebParam(name = "GUEST_GROUP_NUMBER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestGROUPNUMBER,
			@WebParam(name = "GUEST_TITLE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestTITLE,
			@WebParam(name = "GUEST_ARV_DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestARVDATE,
			@WebParam(name = "GUEST_DEPT_DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String guestDEPTDATE,
			@WebParam(name = "DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String date,
			@WebParam(name = "TIME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String time);

	/**
	 * 
	 * @param fun
	 * @return returns java.util.List<com.elcom.eodapp.ehotel.common.xsd.ORoomData>
	 */
	@WebMethod(action = "urn:guestRoomEquipReq")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestRoomEquipReq", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestRoomEquipReq")
	@ResponseWrapper(localName = "guestRoomEquipReqResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestRoomEquipReqResponse")
	public List<ORoomData> guestRoomEquipReq(@WebParam(name = "fun", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String fun);

	/**
	 * 
	 * @param roomNUMER
	 * @param time
	 * @param messageID
	 * @param messageTEXT
	 * @param date
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:guestMessageTextOnline")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestMessageTextOnline", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageTextOnline")
	@ResponseWrapper(localName = "guestMessageTextOnlineResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageTextOnlineResponse")
	public String guestMessageTextOnline(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "MESSAGE_ID", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String messageID,
			@WebParam(name = "MESSAGE_TEXT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String messageTEXT,
			@WebParam(name = "DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String date,
			@WebParam(name = "TIME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String time);

	/**
	 * 
	 * @param roomNUMER
	 * @param time
	 * @param messageID
	 * @param messageTEXT
	 * @param date
	 * @param reservationNUMER
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "urn:guestMessageText")
	@WebResult(targetNamespace = "http://service.ehotel.eodapp.elcom.com")
	@RequestWrapper(localName = "guestMessageText", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageText")
	@ResponseWrapper(localName = "guestMessageTextResponse", targetNamespace = "http://service.ehotel.eodapp.elcom.com", className = "com.elcom.eodapp.ehotel.service.GuestMessageTextResponse")
	public String guestMessageText(
			@WebParam(name = "ROOM_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String roomNUMER,
			@WebParam(name = "RESERVATION_NUMER", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String reservationNUMER,
			@WebParam(name = "MESSAGE_ID", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String messageID,
			@WebParam(name = "MESSAGE_TEXT", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String messageTEXT,
			@WebParam(name = "DATE", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String date,
			@WebParam(name = "TIME", targetNamespace = "http://service.ehotel.eodapp.elcom.com") String time);

}