/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chuks.flatbok.fx.admin.listener;

import chuks.flatbok.fx.common.account.profile.TraderAccountProfile;
import java.util.List;

/**
 *
 * @author user
 */
public interface TraderAccountListener {
    void onRegister(TraderAccountProfile trader);
    void onEmailVerified(String trader_email, long verified_time);
    void onAccountOpened(String trader_email);
    void onAccountClosed(String trader_email);
    void onAccountDeactivated(String trader_email);
    void onAccountActivated(String trader_email);
    void onAccountEnabled(String trader_email);
    void onAccountDisabled(String trader_email);
    void onAccountApproved(String trader_email, long approval_time);
    void onAccountApproveFail(String trader_email);
   void onPaginatedTraders(List<TraderAccountProfile> traders, int overall_total);
  
}
