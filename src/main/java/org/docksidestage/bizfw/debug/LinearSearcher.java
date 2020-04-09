package org.docksidestage.bizfw.debug;

import java.util.List;

public class LinearSearcher implements Searcher {
    public List<Word> words;

    public LinearSearcher() {
        words = new WordPool().getWords();
    }

    @Override
    public Word search(String searchingFor) {
        for (int i = 0; i < words.size(); i++) {
            if (searchingFor.equals(words.get(i).getWord())) {
                return words.get(i);
            }
        }
        throw new IllegalArgumentException("the word you are looking for is not here, word:" + searchingFor);
    }
}
