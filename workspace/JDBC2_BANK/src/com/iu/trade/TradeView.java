package com.iu.trade;

import java.util.ArrayList;

public class TradeView {
	public void view(ArrayList<TradeDTO> ar) {
		for(TradeDTO tradeDTO : ar) {
			System.out.println("ACCOUNT_NUM	:"+tradeDTO.getAccountNum());
			System.out.println("TRADE_DAY	:"+tradeDTO.getTradeDate());
			System.out.println("TRADE_AMOUNT:"+tradeDTO.getTradeAmount());
			System.out.println("ACCOUNT_BAL	:"+tradeDTO.getAccountBalance());
			System.out.println("TRADE_IO	:"+tradeDTO.getTradeIO());
		}
	}
}
