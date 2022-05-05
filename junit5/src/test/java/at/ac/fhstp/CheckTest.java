package at.ac.fhstp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckTest {

    private Check cut;

    @BeforeAll
    public static void initialize() {
        System.out.println("Initially setting up");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Setup before each test");
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
