package com.amazon.ata.unittesting.texttruncator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test the <code>TextTruncator</code> behavior.
 */
public class TextTruncatorTest {
    @Test
    public void truncateTo_stringLongerThanNumChars_shortensToFirstNumChars() {
        // GIVEN
        String original = "One two three four five";
        TextTruncator truncator = new TextTruncator(original);

        // WHEN
        String truncatedString = truncator.truncateTo(7);

        // THEN
        Assertions.assertEquals("One two", truncatedString,
                                "Expected to truncate to the first 7 characters");

    }

    @Test
    /* ADD YOUR TESTS HERE */
    public void truncateTo_givenNullString_returnsEmptyString() {
        // GIVEN
        String original = null;
        TextTruncator truncator = new TextTruncator(original);

        // WHEN
        String truncatedString = truncator.truncateTo(10);

        // THEN
        Assertions.assertEquals("", truncatedString,
                "Expected to return an empty string");

    }

    @Test
    public void truncateTo_stringLongerThan_toProperLength() {
        // GIVEN
        String original = "some random string";
        TextTruncator truncator = new TextTruncator(original);

        // WHEN
        String truncatedString = truncator.truncateTo(10);

        // THEN
        Assertions.assertEquals(10, truncatedString.length(),
                "Expected length of 10");

    }

    @Test
    public void truncateTo_stringShorterThan_returnsOriginalString() {
        // GIVEN
        String original = "shorter than 20";
        TextTruncator truncator = new TextTruncator(original);

        // WHEN
        String truncatedString = truncator.truncateTo(20);

        // THEN
        Assertions.assertEquals(original, truncatedString,
                "Expected the original string");

    }

}
