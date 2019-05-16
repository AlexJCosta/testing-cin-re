/*
 * This file was automatically generated by EvoSuite
 * Tue May 07 14:50:11 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.UnderComp;
import java.util.Vector;

public class EWrapperMsgGenerator_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("!kpxtKCkrfL");
      assertEquals("updateAccountTime: !kpxtKCkrfL", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(2572, (String) null, 4454, 0.0, 0.0, 0.0, 0, 0, 2879.317195390659, true);
      assertEquals("id=2572 date = null open=4454.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=2879.317195390659 hasGaps=true", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("com.ib.client.OrderState");
      assertEquals("SCANNER PARAMETERS:\ncom.ib.client.OrderState", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 3167);
      assertEquals("id=0  bidSize=3167", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Contract contract0 = new Contract(102, "SCANNER PARAMETERS:", " =============== end ===============", "com.ib.client.Contract", 102, "SCANNER PARAMETERS:", " =============== end ===============", " =============== end ===============", "FA:", ";e/J/uy/IEs%wH*e{3'", (Vector) null, " =============== end ===============", false, "com.ib.client.Contract", "com.ib.client.Contract");
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 0\nsymbol = SCANNER PARAMETERS:\nsecType =  =============== end ===============\nexpiry = com.ib.client.Contract\nstrike = 102.0\nright = SCANNER PARAMETERS:\ncontractExchange =  =============== end ===============\ncurrency = FA:\nlocalSymbol = ;e/J/uy/IEs%wH*e{3'\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, (-102.3544619), "l%k", 0, 1558, "convertible = ", 722.72810580355, 0.0);
      assertEquals("id=0  bidSize: basisPoints = -102.3544619/l%k impliedFuture = 0.0 holdDays = 1558 futureExpiry = convertible =  dividendImpact = 722.72810580355 dividends to expiry = 0.0", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(0L);
      assertEquals("current time = 0 (Jan 1, 1970 12:00:00 AM)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(1781);
      assertEquals("Next Valid Order ID: 1781", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1704), (-1704), 1.0, 1.0, 0.0, 787.83, 0L, (-801.598449), 2815);
      assertEquals("id=-1704 time = -1704 open=1.0 high=1.0 low=0.0 close=787.83 volume=0 count=2815 WAP=-801.598449", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1627), (-1627), contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = -1627 rank=-1627 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(2572, 0, (String) null, 0, 0, 0L, (-2417));
      assertEquals("updateMktDepth: 2572 0 null 0 0 0.0 -2417", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("com.ib.client.OrderState");
      assertEquals("accountDownloadEnd: com.ib.client.OrderState", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, " =============== end ===============", (String) null, 553, " =============== end ===============", (String) null, 0, (String) null, "c", (String) null, (String) null, "", "", (String) null, "$");
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName =  =============== end ===============\ntradingClass = null\nminTick = 553.0\nprice magnifier = 0\norderTypes =  =============== end ===============\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = c\nindustry = null\ncategory = null\nsubcategory = \ntimeZoneId = \ntradingHours = null\nliquidHours = $\n ---- Contract Details End ----\n", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("qym6[?{[3vBe0j");
      assertEquals("Connected : The list of managed accounts are : [qym6[?{[3vBe0j]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(109, 109, 109);
      assertEquals("id=109  unknown=109.0", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-153));
      assertEquals("id = -153 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "", 4454, 1001, 4454, 1001, 0, 1.7976931348623157E308, 0, "");
      assertEquals("order status: orderId=0 clientId=0 permId=1001 status= filled=4454 remaining=1001 avgFillPrice=4454.0 lastFillPrice=1.7976931348623157E308 parent Id=0 whyHeld=", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(10);
      assertEquals("id=10 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(1637);
      assertEquals("reqId = 1637 =============== end ===============", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(2626, " maxCommission=");
      assertEquals("FA: null  maxCommission=", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("qw\"??g(Il", "", "Error - ", (String) null);
      assertEquals("updateAccountValue: qw\"??g(Il  Error -  null", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract(102, "SCANNER PARAMETERS:", " =============== end ===============", "com.ib.client.Contract", 102, "SCANNER PARAMETERS:", " =============== end ===============", " =============== end ===============", "FA:", ";e/J/uy/IEs%wH*e{3'", (Vector) null, " =============== end ===============", false, "com.ib.client.Contract", "com.ib.client.Contract");
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-2265), 0, 0, 102, (-2265), (-2265), "SCANNER PARAMETERS:");
      assertEquals("updatePortfolio: conid = 102\nsymbol = SCANNER PARAMETERS:\nsecType =  =============== end ===============\nexpiry = com.ib.client.Contract\nstrike = 102.0\nright = SCANNER PARAMETERS:\nmultiplier =  =============== end ===============\nexchange =  =============== end ===============\nprimaryExch =  =============== end ===============\ncurrency = FA:\nlocalSymbol = ;e/J/uy/IEs%wH*e{3'\n-2265 0.0 0.0 102.0 -2265.0 -2265.0 SCANNER PARAMETERS:", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-3254), "5HvquXk3`");
      assertEquals("id  = -3254 len = 9\n5HvquXk3`", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-2498), (-1799), "/?", "O");
      assertEquals("MsgId=-2498 :: MsgType=-1799 :: Origin=O :: Message=/?", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(1781, 0, "com.ib.client.OrderState");
      assertEquals("id=1781  bidSize=com.ib.client.OrderState", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 553, 2151, 4913, (-1377.89008225), 853);
      assertEquals("updateMktDepth: 0 553 2151 4913 -1377.89008225 853", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(102, 0, 0, 0);
      assertEquals("id=102  bidSize=0.0  noAutoExecute", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 1781, 1781, (-3658));
      assertEquals("id=0  unknown=1781.0  canAutoExecute", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(431, (-1), (-1), 1.7976931348623157E308, 1.7976931348623157E308, (-3886.902132));
      assertEquals("id=431  unknown: vol = N/A delta = N/A", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 4913, 0, 0.0, 2720.12674);
      assertEquals("id=13  modelOptComp: vol = 4913.0 delta = 0.0: modelPrice = 0.0: pvDividend = 2720.12674", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "GsY4@%G", "com.ib.client.OrderState", "", 0.0, 1.7976931348623157E308, Integer.MAX_VALUE, "Q,yXW(Ei0G!", "h?P.+'5J^1/Bz^p~,2");
      String string0 = EWrapperMsgGenerator.openOrder(1781, contract0, order0, orderState0);
      assertNotNull(string0);
  }
}