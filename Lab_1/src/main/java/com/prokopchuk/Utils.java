package com.prokopchuk;

import java.util.Set;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Utils {

  private static final Set<String> keywords = Set.of(
      "break", "case", "chan", "const", "continue",
      "default", "defer", "else", "fallthrough", "for",
      "func", "go", "goto", "if", "import",
      "interface", "map", "package", "range", "return",
      "select", "struct", "switch", "type", "var", "iota"
  );

  public static boolean isKeyword(String str) {
    return keywords.contains(str);
  }

  public static boolean isBoolean(String str) {
    return str.equals("true") || str.equals("false");
  }

  public static boolean isNull(String str) {
    return str.equals("null");
  }

  public static boolean isSeparator(Character c) {
    return c == '{' || c == '}'
        || c == '(' || c == ')'
        || c == '[' || c == ']'
        || c == ',' || c == '.' || c == ';';
  }

  public static boolean isOperator(Character c) {
    return c == '&' || c == '|'
        || c == '=' || c == '<' || c == '>'
        || c == '?' || c == ':' || c == '!'
        || c == '+' || c == '-' || c == '*'
        || c == '/' || c == '^' || c == '%';
  }

}