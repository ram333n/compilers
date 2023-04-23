package com.prokopchuk;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Lexer lexer = new Lexer();
    List<TokenWrapper> tokens = lexer.tokenize("./src/main/resources/example.go");
    for (TokenWrapper token : tokens) {
      System.out.printf("(%s: '%s')%n", token.getToken(), token.getData());
    }
  }

}
