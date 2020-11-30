package th.ac.ku.swt012020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuspendedAccountTest {

    @Test
    void check_Valid_User_Account_Result_Should_Be_True(){
        boolean expectedResult = true;
        Agent agent = new Agent();
        String accountNumber = "401367301";

        boolean actualResult = agent.checkSuspendedAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }

    @Test
    void check_Invalid_User_Account_Result_Should_Be_False(){
        boolean expectedResult = false;
        Agent agent = new Agent();
        String accountNumber = "495982333";

        boolean actualResult = agent.checkSuspendedAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }
}