package classe_test;

// Classe di test
public class Alpha {
    private int memorizedNumber;
    private String memorizedWord;

    public Alpha(int memorizedNumber, String memorizedWord) {
        this.memorizedNumber = memorizedNumber;
        this.memorizedWord = memorizedWord;
    }

    public int getMemorizedNumber() {
        return memorizedNumber;
    }

    public void setMemorizedNumber(int memorizedNumber) {
        this.memorizedNumber = memorizedNumber;
    }

    public String getMemorizedWord() {
        return memorizedWord;
    }

    public void setMemorizedWord(String memorizedWord) {
        this.memorizedWord = memorizedWord;
    }
}
