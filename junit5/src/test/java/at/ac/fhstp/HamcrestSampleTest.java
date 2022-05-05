package at.ac.fhstp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class HamcrestSampleTest {

    @Test
    void test() {
        boolean a = true;
        boolean b = true;

        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
        assertThat(a, is(b));
    }

    @Test
    void extendedTest() {
        assertThat("test", anyOf(is("testing"), containsString("est")));
    }
}