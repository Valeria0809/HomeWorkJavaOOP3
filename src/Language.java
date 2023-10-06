import java.util.ArrayList;
import java.util.Arrays;

public class Language extends AbstractGame{
    ArrayList<String> alphabetEn = new ArrayList<>(Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")));
    ArrayList<String> alphabetRus = new ArrayList<>(Arrays.asList("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".split("")));

    @Override
    ArrayList<String> generateCharListEn() {
        return alphabetEn;
    }

    @Override
    ArrayList<String> generateCharListRus() {
        return alphabetRus;
    }

    @Override
    ArrayList<String> generateCharList() {
        return null;
    }
}
