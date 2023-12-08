package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.StringUtils.isBalanced;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    // La chaine peut être vide => vrai
    @Test
    void testEmptyString() {
        assertTrue(isBalanced(""));
    }

    // Fermetures correspondantes aux ouvertures => vrai
    @Test
    void testBalancedString() {
        assertTrue(isBalanced("({[]})"));
    }

    // Fermetures non correspondantes aux ouvertures par nombre d'apparition => faux
    @Test
    void testUnbalancedString() {
        assertFalse(isBalanced("(()"));
    }

    // Fermerture non correspondante par ordre d'apparition => faux
    @Test
    void testUnbalancedString2() {
        assertFalse(isBalanced("([)]"));
    }


}