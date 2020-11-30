package th.ac.ku.swt012020;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTest {

      @Test
      void deposit_less_than_30000_Result_Should_Be_True() {
            boolean expectedResult = true;
            float depositCash = 5000.00f;
            Agent agent = new Agent();

            boolean actualResult = agent.checkDepositPerTransaction(depositCash);

            assertEquals(expectedResult, actualResult);
      }

      @Test
      void deposit_equal_to_3000_Result_Should_Be_True() {
            boolean expectedResult = true;
            float depositCash = 30000.00f;
            Agent agent = new Agent();
            boolean actualResult = agent.checkDepositPerTransaction(depositCash);

            assertEquals(expectedResult, actualResult);
      }

      @Test
      void deposit_more_than_30000_Result_Should_Be_False() {
            boolean expectedResult = false;
            float depositCash = 50000.00f;
            Agent agent = new Agent();
            boolean actualResult = agent.checkDepositPerTransaction(depositCash);

            assertEquals(expectedResult, actualResult);
      }
}
