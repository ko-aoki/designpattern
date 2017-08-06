package com.example.interpreter;

import java.util.StringTokenizer;

/**
 * Created by ko-aoki on 2017/08/06.
 */
public class Context {

    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        this.tokenizer = new StringTokenizer(text);
        this.nextToken();
    }

    public String nextToken() {
        if (this.tokenizer.hasMoreTokens()) {
            this.currentToken = this.tokenizer.nextToken();
        } else {
            this.currentToken = null;
        }
        return this.currentToken;
    }

    public String currentToken() {
        return this.currentToken;
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(this.currentToken)) {
            throw new ParseException("Warning:" + token + " is expected, but " + this.currentToken + " is found");
        }
        this.nextToken();
    }

    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(this.currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning:" + e);
        }
        return number;
    }
}
