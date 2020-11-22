import org.junit.Test;

import java.util.HashMap;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount();
    }

    @Test
    public void testCountWords() {
        String msg = "I do not know what to say my brain is empty but I have left side of my brain and right side of my brain but I do not know how to function them";
        HashMap<String,Integer> wordMap = HandleTruth.countWords(msg);

        assert(wordMap.get("I") == 3);
        assert(wordMap.get("do") == 2);
        assert(wordMap.get("not") == 2);
        assert(wordMap.get("know") == 2);
        assert(wordMap.get("what") == 1);
        assert(wordMap.get("to") == 2);
        assert(wordMap.get("say") == 1);
        assert(wordMap.get("my") == 3);
        assert(wordMap.get("brain") == 3);
        assert(wordMap.get("is") == 1);
        assert(wordMap.get("empty") == 1);
        assert(wordMap.get("but") == 2);
        assert(wordMap.get("have") == 1);
        assert(wordMap.get("left") == 1);
        assert(wordMap.get("side") == 2);
        assert(wordMap.get("of") == 2);
        assert(wordMap.get("and") == 1);
        assert(wordMap.get("right") == 1);
        assert(wordMap.get("how") == 1);
        assert(wordMap.get("function") == 1);
        assert(wordMap.get("them") == 1);
        assert(wordMap.size() == 21 );

    }

    @Test
    public void testCountWords2() {
        String msg = "";
        for (int i = 0; i < 10001; i++) {
            if (i != 0) {
                msg += " ";
            }
            msg += "monkey";
        }

        HashMap<String, Integer> wordMap = HandleTruth.countWords(msg);

        assert(wordMap.isEmpty() == false);
        assert(wordMap.get("monkey") == 10000 + 1);

    }


    @Test
    public void testSpecialWords() {
        String msg = "I i , . ! ; ?";
        HashMap<String,Integer> wordMap = HandleTruth.countWords(msg);

        assert(wordMap.get("I") == 1);
        assert(wordMap.get("i") == 1);
        assert(wordMap.get(",") == 1);
        assert(wordMap.get(".") == 1);
        assert(wordMap.get("!") == 1);
        assert(wordMap.get(";") == 1);
        assert(wordMap.get("?") == 1);

    }

    @Test
    public void testOrderWords() {

    }

    @Test
    public void testOrderWords2() {

    }


}