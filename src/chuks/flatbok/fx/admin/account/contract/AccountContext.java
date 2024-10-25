/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chuks.flatbok.fx.admin.account.contract;

import chuks.flatbok.fx.common.account.order.Order;
import chuks.flatbok.fx.common.listener.ConnectionListener;
import chuks.flatbok.fx.common.listener.OrderActionListener;
import chuks.flatbok.fx.common.listener.SymbolUpdateListener;
import io.netty.channel.ChannelHandlerContext;
import chuks.flatbok.fx.admin.listener.AdminAccountListener;
import chuks.flatbok.fx.admin.listener.ClientIPListener;
import chuks.flatbok.fx.admin.listener.RemoteConfigListener;
import chuks.flatbok.fx.admin.listener.RemoteLogListener;
import chuks.flatbok.fx.admin.listener.TraderAccountListener;

/**
 *
 * @author user
 */
public interface AccountContext extends OrderActionListener,
        SymbolUpdateListener,
        ConnectionListener,
        AdminAccountListener,
        TraderAccountListener,
        RemoteConfigListener,
        RemoteLogListener,
        ClientIPListener{

    void setContext(ChannelHandlerContext ctx);

    public void onOrderRemoteError(Order order, String reason);
}
