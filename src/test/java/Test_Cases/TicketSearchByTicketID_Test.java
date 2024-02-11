package Test_Cases;

import Generic.BaseClass;
import org.testng.annotations.Test;
import pom.TicketListPage;

import static Generic.BaseClass.driver;

public class TicketSearchByTicketID_Test extends BaseClass {
    @Test
    public void verifyTicketSearchByTicketId(){

        TicketListPage ticketListPage = new TicketListPage(driver);
        ticketListPage.doTicketSearchByTicketId();
        ticketListPage.expendView();
        ticketListPage.clickOnSearchedTicketDetails();
    }

}
