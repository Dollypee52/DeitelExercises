package AssignmentTest.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcctTest {
    @Test

    public void depositTest(){
        //given
    Acct dolapoAcct = new Acct();
       //when
        dolapoAcct.deposit(500.0);
      //assert
        assertEquals(500.0,dolapoAcct.getBalance());

    }
    @Test
    public void withdrawal(){
        //given
        Acct dolapoAcct = new Acct();
        //when
        dolapoAcct.deposit(500);
        dolapoAcct.withdrawal(300.0);
        assertEquals(200.0, dolapoAcct.getBalance());
    }
}
