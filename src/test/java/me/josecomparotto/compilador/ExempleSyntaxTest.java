package me.josecomparotto.compilador;

import java.io.FileInputStream;
import java.io.InputStream;

import me.josecomparotto.compilador.lexical.LexicalScanner;
import me.josecomparotto.compilador.syntax.SyntaxParser;

public class ExempleSyntaxTest {

    public static void main(String[] args) {

        final String TEST_INPUT_FILE = "docs/txt/exemplo.txt";

        try {

            final InputStream in = new FileInputStream(TEST_INPUT_FILE);

            String source = Helpers.getString(in);

            LexicalScanner scanner = new LexicalScanner(source);

            SyntaxParser parser = new SyntaxParser(scanner);

            // System.setOut(out);

            parser.parse();

            in.close();
            // out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
