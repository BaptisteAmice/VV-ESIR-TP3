package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.StringUtils.isBalanced;
import static org.junit.jupiter.api.Assertions.*;


class StringUtilsTest {

    /******************** Input Space Partitioning ********************/

    /****Tests Q1 ****/

    // A : pas de contenu textuel supplementaire => vrai
    @Test
    void testNoText() {
        assertTrue(isBalanced("({}[])"));
    }

    // B : contenu textuel supplementaire symetrique => vrai
    @Test
    void testSymetricText() {
        assertTrue(isBalanced("(a(b(c)d)e)"));
    }

    // C : contenu textuel supplementaire non symetrique => vrai
    @Test
    void testNonSymetricText() {
        assertTrue(isBalanced("(a(b(c)))"));
    }

    /****Tests Q2 ****/
    // A : chaine vide => vrai 
    @Test
    void testEmptyString() {
        assertTrue(isBalanced(""));
    }

    // B : une ouverture par fermeture => vrai
    @Test
    void testOneOpenClose() {
        assertTrue(isBalanced("(()(())())"));
    }

    //C : moins d'une fermeture par ouverture => faux
    @Test
    void testLessCloseThanOpen() {
        assertFalse(isBalanced("(()(())("));
    }

    /****Tests Q3 ****/

    // A => impossible

    // B => ordre fermeture/ouverture respecte => vrai
    @Test
    void testOrderRespected() {
        assertTrue(isBalanced("([]{}[{}()])"));
    }

    // C => ordre fermeture/ouverture non respecte => faux
    @Test
    void testOrderNotRespected() {
        assertFalse(isBalanced("([)]"));
    }


    /******************** Test coverage ********************/

    // Input Space Partitioningis sufficient to cover all the code

    /******************** Logic test ********************/

    @Test 
    void testBranchCoverageBrackets() {
        assertFalse(isBalanced("(]"));
    }

    @Test 
    void testBranchCoverageBraces() {
        assertFalse(isBalanced("(}"));
    }


    /******************** Mutation score ********************/

    @Test
    void testClassSignature() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isBalanced("({}[])"));
    }


}