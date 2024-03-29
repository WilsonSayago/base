package com.generic.base.core.domains;


public record Country(String id, String name, String codeArea, String gmt, String language, String currency,
                      String fiscalIdentifierType, String codeIso) {
}
