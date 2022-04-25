package at.ac.fhstp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import at.ac.fhstp.Check;

public class CheckTest {

    private Check cut;

    @BeforeEach
    public void setUp() {
        cut = new Check();
    }

    @Test
    @DisplayName("Null is null")
    public void shouldAssertTrueForNull() {
        assertTrue(cut.isNullOrEmpty(null));
    }

    @Test
    @DisplayName("String is not null")
    public void shouldAssertFalseForString() {
        assertTrue(cut.isNullOrEmpty("Some value"));
    }

    @Test
    public void simpleTestCase() {
        assertTrue(true);
    }
}
