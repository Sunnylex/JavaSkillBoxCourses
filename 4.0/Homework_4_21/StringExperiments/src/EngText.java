import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EngText {
    public static final String ENG_TEXT = "Today, plastic packaging has a bad (w)rap.\n" +
            "But the first commercially viable version of the now ubiquitous material - cellophane - was conceived " +
            "in a more innocent age, before anyone worried about plastic in landfill, or the sea, or the food chain.\n" +
            "It begins in 1904, at an upmarket restaurant in Vosges, France, when an elderly patron spilled red wine " +
            "over a pristine linen tablecloth.\n" +
            "Sitting at a nearby table was a Swiss chemist called Jacques Brandenberger, who worked for a French textile" +
            " company. As he watched the waiter change the tablecloth, he wondered about designing a fabric that would " +
            "simply wipe clean.\n" +
            "He tried spraying cellulose on tablecloths but it peeled off in transparent sheets. But might those " +
            "transparent sheets have a market?\n" +
            "Find out more 50 Things That Made the Modern Economy highlights the inventions, ideas and innovations that " +
            "helped create the economic world.\n" +
            "It is broadcast on the BBC World Service. You can find more information about the programme's sources and " +
            "listen to all the episodes online or subscribe to the programme podcast.\n" +
            "By World War One, he'd found one: eye-pieces for gas masks.\n" +
            "He called his invention \"cellophane\" and in 1923 he sold the rights to the DuPont corporation in America.\n" +
            "Its early uses there included wrapping chocolates, perfume and flowers.\n" +
            "But DuPont had a problem. Some customers weren't happy. They'd been told cellophane was waterproof, and it " +
            "was, but it wasn't moisture-proof.\n" +
            "Candies stuck to it; knives rusted in it; cigars dried out.\n" +
            "DuPont hired a 27-year-old chemist, William Hale Charch, and tasked him with finding a solution.\n" +
            "Image copyrightGETTY IMAGES\n" +
            "Within a year, he'd done it - the cellophane was coated with extremely thin layers of nitrocellulose, wax, " +
            "a plasticiser and a blending agent.\n" +
            "Sales took off.\n" +
            "The timing was perfect. In the 1930s, supermarkets were changing - customers no longer queued to tell shop " +
            "assistants what food they required. They picked products off the shelves instead.\n" +
            "See-through packaging was a hit. And, as Harvard Business School researcher Ai Hisano points out, had \"a " +
            "significant impact not only on how consumers purchased foods but also on how they understood food quality\".\n" +
            "Cellophane let them choose food on the basis of how it looked, without sacrificing hygiene or freshness." +
            " n-m n - m.\"' '  ";

    public static void main(String[] args) {
        String regex ="[.,\"?]";
        String textWithOutSymb = ENG_TEXT.replaceAll(regex," ");
        String[] strings = textWithOutSymb.split("\\s+");
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
