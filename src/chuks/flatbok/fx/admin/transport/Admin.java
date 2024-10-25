package chuks.flatbok.fx.admin.transport;

import chuks.flatbok.fx.transport.SharableTransportHandler;
import chuks.flatbok.fx.transport.TransportClient;
import chuks.flatbok.fx.admin.account.contract.AccountContext;
import chuks.flatbok.fx.admin.account.contract.AdminAccount;

public class Admin extends TransportClient {
    private final AdminAccount adminAccount;
    private final AdminHandler handler;
    
    public Admin(AdminAccount adminAccount, String host, int port) throws Exception {
        super(host, port);
        this.adminAccount = adminAccount;
        handler =  new AdminHandler((AccountContext) adminAccount);
        
    }

    @Override
    protected SharableTransportHandler getHandler() {
       return handler; 
    }

    @Override
    protected void onConnected() {
        adminAccount.onConnected();
    }

    @Override
    protected void onDisconnected(String msg) {
        adminAccount.onDisconnected(msg);
    }

}
