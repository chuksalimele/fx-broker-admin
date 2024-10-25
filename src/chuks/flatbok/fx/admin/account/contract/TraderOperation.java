/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chuks.flatbok.fx.admin.account.contract;

import chuks.flatbok.fx.common.account.order.Order;
import chuks.flatbok.fx.common.account.order.SymbolInfo;
import chuks.flatbok.fx.admin.listener.AdminAccountListener;
import chuks.flatbok.fx.admin.listener.ClientIPListener;
import chuks.flatbok.fx.common.listener.ConnectionListener;
import chuks.flatbok.fx.common.listener.OrderActionListener;
import chuks.flatbok.fx.admin.listener.RemoteConfigListener;
import chuks.flatbok.fx.admin.listener.RemoteLogListener;
import chuks.flatbok.fx.common.listener.SymbolUpdateListener;
import chuks.flatbok.fx.admin.listener.TraderAccountListener;
import java.util.List;

/**
 *
 * @author user
 */
public interface TraderOperation {
    
    public SymbolInfo getSymbolInfo(String symbol);           
    
    public List<String> getSelectedSymbols();

    public void setSelectedSymbols(List<String> list);    

    public void sendMarketOrder(Order order);

    public void modifyOpenOrder(String clOrdId, double target_price, double stoploss_price);

    public void sendClosePosition(String clOrdId, double lot_size);
    
    public void placePendingOrder(Order order);

    public void modifyPendingOrder(String clOrdId, double target_price, double stoploss_price);
    
    public void deletePendingOrder(String clOrdId);
    
    public void addOrderActionListener(OrderActionListener listener);

    public void addSymbolUpdateListener(SymbolUpdateListener listener);
    
    public void addConnectionListener(ConnectionListener listener);   
    
    public void addAdminAccountListener(AdminAccountListener listener);   
    
    public void addTraderAccountListener(TraderAccountListener listener);   
    
    public void addRemoteConfigListener(RemoteConfigListener listener);   
    
    public void addRemoteLogListener(RemoteLogListener listener);   

    public void addClientIPListener(ClientIPListener listener);   
                                                                
    public void shutdown();
       
    public void refreshContent();          
}
