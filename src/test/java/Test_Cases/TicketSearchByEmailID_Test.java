package Test_Cases;

import Generic.BaseClass;
import org.testng.annotations.Test;
import pom.TicketListPage;

public class TicketSearchByEmailID_Test extends BaseClass {
    @Test
    public void verifyTicketSearchByEmailID(){
        TicketListPage ticketListPage= new TicketListPage(driver);
        ticketListPage.doTicketSearchByEmailID();
        ticketListPage.expendView();
        ticketListPage.clickOnSearchedTicketDetails();
    }
}
