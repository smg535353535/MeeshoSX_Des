package Test_Cases;
import Generic.BaseClass;
import org.testng.annotations.Test;
import pom.TicketListPage;

import static Generic.BaseClass.*;

public class TicketSearchByPhoneNumber_Test extends BaseClass {
    @Test
    public void verifyTicketSearchByPhoneNumber(){
        TicketListPage ticketListPage= new TicketListPage(driver);
        ticketListPage.doTicketSearchByPhoneNumber();
        ticketListPage.expendView();
        ticketListPage.clickOnSearchedTicketDetails();



    }
}
