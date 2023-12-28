package com.csc.api.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class CostomerKaruteSearchByItemVO implements Serializable {

	/**
	 * 顧客カルテ更新
	 */
	private static final long serialVersionUID = 1L;
	
	private String financialId;/* 金融ID */
	private String notices;/* 特記事項 */
	private String isHokenDMKyohi;/* 【保険】電話拒否 */
	private String isHokenCallKyohi;/* 【保険】DM拒否 */
	private String isHokenNewsletterKyohi;/* 【保険】メルマガ拒否 */
	private String isShokenDMKyohi;/* 【投資信託】電話拒否 */
	private String isShokenCallKyohi;/* 【投資信託】DM拒否 */
	private String isShokenNewsletterKyohi;/* 【投資信託】メルマガ拒否 */
	private String isShintakuDMKyohi;/* 【信託】電話拒否 */
	private String isShintakuCallKyohi;/* 【信託】DM拒否 */
	private String isShintakuNewsletterKyohi;/*【信託】メルマガ拒否*/
	private String isCreditDMKyohi;/* 【カード】電話拒否 */
	private String isCreditCallKyohi;/* 【カード】DM拒否 */
	private String isCreditNewsletterKyohi;/* 【カード】メルマガ拒否 */
	private String isLoanDMKyohi;/* 【融資】電話拒否 */
	private String isLoanCallKyohi;/* 【融資】 DM拒否 */
	private String isLoanNewsletterKyohi;/* 【融資】メルマガ拒否 */
	private String contactName;/* 外商担当者氏名 */
	private String contactGroup;/* 外商店舗 */
	private String contactCode;/* 外商係員コード */
	private String personalKbn; /* 個人法人区分 */

}
