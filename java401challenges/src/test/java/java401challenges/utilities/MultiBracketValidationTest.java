package java401challenges.utilities;

import java401challenges.utilities.MultiBracketValidation;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void bracketValidTest() {
        System.out.println(MultiBracketValidation.multiBracketValidation("{}[]{}()"));
        assertTrue("should return true",MultiBracketValidation.multiBracketValidation("{}[]{}()") );
        assertTrue("should return true with extra character",MultiBracketValidation.multiBracketValidation("{}[asd]{sasd}(asd)") );
        assertFalse("should return false",MultiBracketValidation.multiBracketValidation("{}[[]{}()") );
        assertFalse("should return false",MultiBracketValidation.multiBracketValidation("[({}]") );


    }



}
