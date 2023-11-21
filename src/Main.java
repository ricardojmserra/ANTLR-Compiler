

import Grammar.IntepreterLexer;
import Grammar.IntepreterParser;
import Grammar.TypeChecker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.lang.runtime.SwitchBootstraps;


public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        try {
            if (inputFile != null) is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            IntepreterLexer lexer = new IntepreterLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            IntepreterParser parser = new IntepreterParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.start();

            ParseTreeWalker walker = new ParseTreeWalker();
            TypeChecker listener = new TypeChecker();

            System.out.println("Type checking...");
            walker.walk(listener, tree);
            if (listener.nmr_erros > 0) {
                System.err.println(listener.str_erros);
                System.out.println(listener.nmr_erros + " semantic errors found. Compilation process halted.");
                System.exit(1);
            }
            System.out.println("No semantic errors found");
        }
        switch()
        catch (java.io.IOException e) {
            System.out.println(e);
        }
    }

}